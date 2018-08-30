package com.isuru.sqllite.mvpretrofit.main;

import android.content.Context;

import com.isuru.sqllite.mvpretrofit.model.ServiceProvider;

import java.util.List;

public interface MainView  {

    interface view {
        void onGetDataSuccess(String message, List<ServiceProvider> list);
        void onGetDataFailure(String message);
    }

    interface Presenter{
        void getDataFromURL(Context context);
    }
    interface Interactor{
        void initRetrofitCall(Context context
        );

    }
    interface onGetDataListener{
        void onSuccess(String message, List<ServiceProvider> list);
        void onFailure(String message);
    }
}
