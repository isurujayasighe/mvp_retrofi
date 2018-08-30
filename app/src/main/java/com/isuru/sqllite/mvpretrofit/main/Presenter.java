package com.isuru.sqllite.mvpretrofit.main;

import android.content.Context;

import com.isuru.sqllite.mvpretrofit.model.ServiceProvider;

import java.util.List;

public class Presenter implements MainView.Presenter,MainView.onGetDataListener {

    private MainView.view mGetDataView;
    private MainView.Interactor interactor;

    public Presenter(MainView.view mGetDataView) {
        this.mGetDataView = mGetDataView;
        interactor = new Intractor(this);
    }

    @Override
    public void getDataFromURL(Context context) {
        interactor.initRetrofitCall(context);
    }

    @Override
    public void onSuccess(String message, List<ServiceProvider> list) {
        mGetDataView.onGetDataSuccess(message,list);
    }

    @Override
    public void onFailure(String message) {
        mGetDataView.onGetDataFailure(message);
    }
}
