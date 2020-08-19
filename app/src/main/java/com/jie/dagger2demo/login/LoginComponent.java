package com.jie.dagger2demo.login;

import dagger.Component;

@Component(modules = LoginPresenterModule.class)
public interface LoginComponent {
    void inject(LoginActivity activity);
}
