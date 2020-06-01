package com.example.develop.appquanlichitieu;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
     Button buttondn,buttondk;
     EditText matkhau, dangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttondn= findViewById(R.id.btndangnhap);
        buttondk = findViewById(R.id.btndangki);
        matkhau = findViewById(R.id.edmatkhau);
        dangnhap = findViewById(R.id.eddangnhap);
    }



    public void LoginDN(View view) {
        Intent intent = new Intent(Login.this,MainActivity.class);
        startActivity(intent);
    }


    }


