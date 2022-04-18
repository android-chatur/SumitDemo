package com.example.sumtproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.sumtproject.UI.HomeActivity;
import com.example.sumtproject.UI.Login;
import com.google.android.material.snackbar.Snackbar;

import java.util.UUID;

public class SpashActivity extends AppCompatActivity {
    public static boolean ishome = false;
    private static int SPLASH_TIME_OUT = 1500;
    Activity activity;
    Context context;
    String ipaddress;
    String Uniqueids;
    //    SessionManager sessionManager;
//    AppPreferences appPreferences;
    private ConstraintLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        context = this;
        activity = this;

        ipaddress = UUID.randomUUID().toString();


        coordinatorLayout = findViewById(R.id.coordinatorLayout);
        new Handler().postDelayed(new Runnable() {
            // Showing splash screen with a timer. This will be useful when you want to show case your app logo / company
            @Override
            public void run() {

                startActivity(new Intent(SpashActivity.this, Login.class));
                finish();
//                if (SpashActivity.this.isNetworkConnected()) {
////                    if (!sessionManager.isLoggedIn()) {
////                        appPreferences.getLanguage();
//
//                    startActivity(new Intent(SpashActivity.this, Login.class));
//                    finish();
//
//                } else {
//
//
//                    startActivity(new Intent(SpashActivity.this, HomeActivity.class));
//                    finish();
//
//
//                }





                Snackbar snackbar = Snackbar
                        .make(coordinatorLayout, "No internet connection!", Snackbar.LENGTH_LONG)
                        .setAction("RETRY", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                            }
                        });

                // Changing message text color
                snackbar.setActionTextColor(Color.RED);

                // Changing action button text color
                View sbView = snackbar.getView();
                // TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                TextView textView = sbView.findViewById(com.google.android.material.R.id.snackbar_text);
                textView.setTextColor(Color.YELLOW);

                snackbar.show();
                // TastyToast.makeText(context, "Check your Internet Connection", TastyToast.LENGTH_LONG, TastyToast.ERROR);
            }

        }, SPLASH_TIME_OUT);
    }

    private boolean isNetworkConnected() {
        @SuppressLint("WrongConstant") ConnectivityManager cm = (ConnectivityManager) this.getSystemService("connectivity");
        return cm.getActiveNetworkInfo() != null;
    }
}

        //Uniqueids = uniquepwd();



