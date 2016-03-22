package com.example.android.howtocreateasplashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by everything on 3/12/2016.
 */
public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        Thread sleep=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent startMain=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(startMain);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        ;
        sleep.start();
    }
}
