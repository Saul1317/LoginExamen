package com.example.loginexamen.Login.Interator;

import android.util.Log;

import com.example.loginexamen.Login.Presenter.OnLoginFinish;

public class LoginInteratorImpl implements LoginInterator {

    @Override
    public void prueba(OnLoginFinish onLoginFinish) {
        onLoginFinish.PruebaReturn();
        Log.e("Interator","Llega al interator");
    }
}
