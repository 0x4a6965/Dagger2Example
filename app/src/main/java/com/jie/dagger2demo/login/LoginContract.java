package com.jie.dagger2demo.login;

public interface LoginContract {

    interface View {
        void loginSuccess();
    }

    interface Presenter {
        void login();
    }
}
