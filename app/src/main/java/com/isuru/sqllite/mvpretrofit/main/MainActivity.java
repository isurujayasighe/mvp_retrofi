package com.isuru.sqllite.mvpretrofit.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.isuru.sqllite.mvpretrofit.Adapter.ServiceProviderAdapter;
import com.isuru.sqllite.mvpretrofit.R;
import com.isuru.sqllite.mvpretrofit.model.ServiceProvider;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView.view {

    private ServiceProviderAdapter serviceProviderAdapter;
    private Presenter presenter;

    @BindView(R.id.service_provider_list)
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new Presenter(this);
        presenter.getDataFromURL(getApplicationContext());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void onGetDataSuccess(String message, List<ServiceProvider> list) {
        serviceProviderAdapter = new ServiceProviderAdapter(getApplicationContext(),list);
        mRecyclerView.setAdapter(serviceProviderAdapter);
    }

    @Override
    public void onGetDataFailure(String message) {
        Log.d("Status",message);
    }
}
