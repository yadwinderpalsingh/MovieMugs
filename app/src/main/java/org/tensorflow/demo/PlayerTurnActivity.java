package org.tensorflow.demo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.tensorflow.demo.model.AppManager;

public class PlayerTurnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_player_turn);
    }

    @Override
    public void onResume(){
        super.onResume();

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
        View view = getLayoutInflater().inflate(R.layout.custom_actionbar, null);
        AppManager.setCustomActionBar(actionBar, view, "Round 1");

        //creating thread that will sleep for 10 seconds
        Thread t=new Thread() {
            public void run() {

                try {
                    //sleep thread for 2 seconds, time in milliseconds
                    sleep(3000);
                    //sleep(10000);
                    //start new activity
                    Intent i=new Intent(PlayerTurnActivity.this, ClassifierActivity.class);
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
