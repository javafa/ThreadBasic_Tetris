package com.kodonho.android.threadbasic_tetris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

public class DividedActivity extends AppCompatActivity {

    FrameLayout mainStage,subStage;

    Button btnUp,btnDown,btnLeft,btnRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divided);

        mainStage = (FrameLayout) findViewById(R.id.mainStage);
        subStage = (FrameLayout) findViewById(R.id.subStage);

        btnUp = (Button) findViewById(R.id.btnUp);
        btnDown = (Button) findViewById(R.id.btnDown);
        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnRight = (Button) findViewById(R.id.btnRight);
    }
}
