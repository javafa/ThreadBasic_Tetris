package com.kodonho.android.threadbasic_tetris;

import java.util.Random;

/**
 * Created by fastcampus on 2016-10-17.
 */
public class Block {

    private static final int ABS_X = 5;
    private static final int ABS_Y = 0;

    int x = 0;
    int y = 0;

    // 현재 회전방향 처음엔 0으로 세팅
    private int currentOrientation = 0;
    private int currentOrientationLimit = 0;

    private int[][][] currentBlockGroup;
    private int[][] currentBlock;


    public void setBlock(){  //  type = 0 to 6
        // 블럭을 타입을 랜덤하게 선택한다
        Random random = new Random();
        int type = random.nextInt(7);
        // 선택된 타입으로 블럭의 회전상태를 포함한 블럭 그룹을 선택
        currentBlockGroup = block[type];
        // 블럭의 회정방향을 선택
        currentOrientation = 0;
        // 블럭의 회전방향이 블럭의 타입에 따라 다르므로, 회전방향 개수를 제한해준다
        currentOrientationLimit = currentBlockGroup.length;
        // 현재 회전방향의 블럭을 세팅한다
        currentBlock = currentBlockGroup[currentOrientation];

        // 최초에 세팅되는 블럭의 위치
        x = ABS_X;
        y = ABS_Y;
    }

    public void rotateBlock(){
        // 회전방향을 무조건 +1을 하고
        currentOrientation++;
        // 현재블럭이 가지고 있는 회전방향 제한수로 나눠서 나머지값을 회전방향으로 한다
        currentOrientation = currentOrientation % currentOrientationLimit;
        // 현재 회전방향의 블럭을 세팅한다
        currentBlock = currentBlockGroup[currentOrientation];
    }

    public int[][] getCurrentBlock(){
        // 현재 세팅된 블럭을 리턴해준다
        return currentBlock;
    }

    int block[][][][] =
    {
        {
            {
                {0, 1, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 0, 0}
            },
            {
                {1, 1, 1, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            }
        },
        {
            {
                {0, 2, 0, 0},
                {2, 2, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            },
            {
                {0, 2, 0, 0},
                {0, 2, 2, 0},
                {0, 2, 0, 0},
                {0, 0, 0, 0},
            },
            {
                {0, 0, 0, 0},
                {2, 2, 2, 0},
                {0, 2, 0, 0},
                {0, 0, 0, 0},
            },
            {
                {0, 2, 0, 0},
                {2, 2, 0, 0},
                {0, 2, 0, 0},
                {0, 0, 0, 0},
            }
        },
        {
            {
                {0, 3, 3, 0},
                {0, 3, 3, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            }
        },
        {
            {
                {0, 4, 0, 0},
                {4, 4, 0, 0},
                {4, 0, 0, 0},
                {0, 0, 0, 0}
            },
            {
                {4, 4, 0, 0},
                {0, 4, 4, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
            }
        },
        {
            {
                {5, 0, 0, 0},
                {5, 5, 0, 0},
                {0, 5, 0, 0},
                {0, 0, 0, 0}
            },
            {
                {0, 5, 5, 0},
                {5, 5, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
            }
        },
        {
            {
                {0, 6, 0, 0},
                {0, 6, 6, 6},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            },
            {
                {0, 6, 6, 0},
                {0, 6, 0, 0},
                {0, 6, 0, 0},
                {0, 0, 0, 0},
            },
            {
                {0, 6, 6, 6},
                {0, 0, 0, 6},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            },
            {
                {0, 0, 6, 0},
                {0, 0, 6, 0},
                {0, 6, 6, 0},
                {0, 0, 0, 0},
            }
        },
        {
            {
                {0, 0, 7, 0},
                {7, 7, 7, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            },
            {
                {0, 7, 0, 0},
                {0, 7, 0, 0},
                {0, 7, 7, 0},
                {0, 0, 0, 0},
            },
            {
                {7, 7, 7, 0},
                {7, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            },
            {
                {0, 7, 7, 0},
                {0, 0, 7, 0},
                {0, 0, 7, 0},
                {0, 0, 0, 0},
            }
        }
    };
}
