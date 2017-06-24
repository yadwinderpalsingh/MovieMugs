package org.tensorflow.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import org.tensorflow.demo.model.AppManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
    }

    @Override
    public void onResume() {
        super.onResume();
        AppManager.setActivity(this);

        //creating thread that will sleep for 10 seconds
        Thread t=new Thread() {
            public void run() {

                try {
                    //sleep thread for 2 seconds, time in milliseconds
                    sleep(2000);

                    //start new activity
                    Intent i=new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(i);

                    //destroying Splash activity
                    finish();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        //start thread
        t.start();
    }
}
