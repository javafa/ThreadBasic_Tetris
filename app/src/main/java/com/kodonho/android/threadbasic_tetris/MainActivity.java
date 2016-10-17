package com.kodonho.android.threadbasic_tetris;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout ground;
    Button btnUp,btnDown,btnLeft,btnRight;

    int stageLevel =  1;


    Stage stage = new Stage();
    Block block = new Block();
    MainStage mainStage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ground = (FrameLayout) findViewById(R.id.singleStage);

        btnUp = (Button) findViewById(R.id.btnUp);
        btnDown = (Button) findViewById(R.id.btnDown);
        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnRight = (Button) findViewById(R.id.btnRight);

        // stageMap 배열에 Stage 객체에 정의된 배열값을 세팅한다
        setStage(1);
        // 뷰 객체를 생성한다
        mainStage = new MainStage(this, stage, block);
    }

    public void setStage(int stageLevel){
        stage.setStage(stageLevel);
        block.setBlock();
    }



}
