package com.jie.dagger2demo.login;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

public class LoginPresenter implements LoginContract.Presenter {

    private Context mContext;
    private LoginContract.View mView;

    LoginPresenter(Context context, LoginContract.View view) {
        mContext = context;
        mView = view;
    }

    @Override
    public void login() {
        Log.i("System", "Presenter Login");
        mView.loginSuccess();
    }
}
