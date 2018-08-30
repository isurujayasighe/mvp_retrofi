package com.isuru.sqllite.mvpretrofit.main;

import android.content.Context;
import android.util.Log;

import com.isuru.sqllite.mvpretrofit.Util.ApiClient;
import com.isuru.sqllite.mvpretrofit.Util.ApiInterface;
import com.isuru.sqllite.mvpretrofit.model.ServiceProvider;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Intractor implements MainView.Interactor {

    private MainView.onGetDataListener mOnGetDatalistener;
    List<ServiceProvider> serviceProviderList = new ArrayList<>();


    public Intractor(MainView.onGetDataListener mOnGetDatalistener) {
        this.mOnGetDatalistener = mOnGetDatalistener;
    }

    @Override
    public void initRetrofitCall(Context context) {

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<List<ServiceProvider>> call = apiInterface.getAllServiceProviders();
        call.enqueue(new Callback<List<ServiceProvider>>() {
            @Override
            public void onResponse(Call<List<ServiceProvider>> call, Response<List<ServiceProvider>> response) {
                serviceProviderList = response.body();
//                serviceProviderAdapter.setServiceProviderList(serviceProviderList);
                mOnGetDatalistener.onSuccess("data",serviceProviderList);
            }

            @Override
            public void onFailure(Call<List<ServiceProvider>> call, Throwable t) {
                Log.d("TAG","Response = "+t.toString());
                mOnGetDatalistener.onFailure(t.getMessage());
            }
        });
    }
}
