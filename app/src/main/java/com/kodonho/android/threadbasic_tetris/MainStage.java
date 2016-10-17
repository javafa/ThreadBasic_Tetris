package com.kodonho.android.threadbasic_tetris;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by fastcampus on 2016-10-17.
 */
public class MainStage extends View {
    Stage stage;
    Block block;

    public MainStage(Context context,Stage stage,Block block) {
        super(context);
        // 커스텀 뷰에 그려야 될 대상을 입력해준다
        this.stage = stage;
        this.block = block;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 1. 스테이지 영역을 모두 그린다

        // 1.1 스테이지 배열에 해당 블럭이 포함된채로 그림을 그린다

        // 1.2 현재 움직이는 블럭을 그린다


        // 2. 프리뷰 영역을 그린다

        // 2.1 다음에 보여줄 블럭과 함께 그린다
    }

}
