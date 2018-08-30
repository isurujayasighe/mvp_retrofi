package com.isuru.sqllite.mvpretrofit.Util;

import com.isuru.sqllite.mvpretrofit.model.ServiceProvider;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/provider/all")
    Call<List<ServiceProvider>> getAllServiceProviders();
}
