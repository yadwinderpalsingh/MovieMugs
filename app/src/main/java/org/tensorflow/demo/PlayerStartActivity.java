package org.tensorflow.demo;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import org.tensorflow.demo.model.AppManager;

public class PlayerStartActivity extends AppCompatActivity {

    private ConstraintLayout _startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_player_start);
    }

    @Override
    public void onResume(){
        super.onResume();
        AppManager.setActivity(this);

        _startBtn = (ConstraintLayout) findViewById(R.id.parentContainer);

        _startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppManager.setGameStart(true);
                startActivity(new Intent(PlayerStartActivity.this, PlayerTurnActivity.class));
            }
        });
    }
}
