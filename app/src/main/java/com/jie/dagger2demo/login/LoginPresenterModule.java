package com.jie.dagger2demo.login;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
class LoginPresenterModule {

    private Context mContext;
    private LoginContract.View mView;

    LoginPresenterModule(Context context, LoginContract.View view){
        mContext = context;
        mView = view;
    }

    @Provides
    LoginContract.Presenter providePresenter() {
        return new LoginPresenter(mContext, mView);
    }

}
