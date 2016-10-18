package com.kodonho.android.threadbasic_tetris;

import android.os.Handler;

/**
 * Created by fastcampus on 2016-10-17.
 */
public class Block extends Thread{
    int x = 5;
    int y = 0;
    int orientation_limit = 0;
    int orientation = 0;
    private int blocktype[][][];
    private int block[][];

    boolean alive = true;
    int interval = 0;
    Handler handler;

    public void draw(){
        handler.sendEmptyMessage(Stage.REFRESH);
    }

    public Block(int[][][] blocktype, int interval, Handler handler){
        this.blocktype = blocktype;
        this.interval = interval;
        orientation_limit = this.blocktype.length;
        block = this.blocktype[orientation];
        this.handler = handler;
    }

    // 회전
    public void rotate(){
        orientation++;
        orientation = orientation%orientation_limit;
    }

    // 이동
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    // 생성되고 화면에 세팅되면
    public void run(){
        while(alive) {
            try{
                y++;
                Thread.sleep(interval);
            }catch(Exception e){

            }
        }
    }
}
