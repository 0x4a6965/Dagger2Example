package com.jie.dagger2demo.login;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.jie.dagger2demo.R;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    @Inject
    LoginContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        DaggerLoginComponent.builder()
                .loginPresenterModule(new LoginPresenterModule(this, this))
                .build()
                .inject(this);

        initListener();
    }

    private void initListener() {
        findViewById(R.id.btn_login).setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                mPresenter.login();
            }
        });
    }

    @Override
    public void loginSuccess() {
        Log.i("System", "View LoginSuccess: ");
    }
}
