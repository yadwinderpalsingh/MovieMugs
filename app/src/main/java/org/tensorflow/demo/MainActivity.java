package org.tensorflow.demo;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import org.tensorflow.demo.model.AppManager;

public class MainActivity extends AppCompatActivity {

    private LinearLayout _startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume(){
        super.onResume();
        AppManager.setActivity(this);

        _startBtn = (LinearLayout) findViewById(R.id.parentContainer);

        _startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManager.setGameStart(true);
                startActivity(new Intent(MainActivity.this, PlayerStartActivity.class));
            }
        });
    }
}
