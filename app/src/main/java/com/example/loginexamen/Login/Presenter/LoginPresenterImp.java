package com.example.loginexamen.Login.Presenter;

import android.util.Log;

import com.example.loginexamen.Login.Interator.LoginInterator;
import com.example.loginexamen.Login.Interator.LoginInteratorImpl;
import com.example.loginexamen.Login.Vista.LoginActivity;
import com.example.loginexamen.Login.Vista.LoginView;

public class LoginPresenterImp implements LoginPresenter, OnLoginFinish{

    LoginActivity loginActivity;
    LoginInterator loginInterator;

    public LoginPresenterImp(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
        loginInterator = new LoginInteratorImpl();
    }

    @Override
    public void Prueba() {
        loginInterator.prueba(this);
        Log.e("PRESENTER","Pasa por el presentador");
    }

    @Override
    public void PruebaReturn() {
        loginActivity.Prueba();
        Log.e("PRESENTER","Regresa al presentador");
    }
}
