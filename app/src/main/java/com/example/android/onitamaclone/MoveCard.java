package com.example.android.onitamaclone;

public class MoveCard {

    public static final int BOAR = 1;
    public static final int COBRA = 2;
    public static final int CRAB = 3;
    public static final int CRANE = 4;
    public static final int DRAGON = 5;
    public static final int EEL = 6;
    public static final int ELEPHANT = 7;
    public static final int FROG = 8;
    public static final int GOOSE = 9;
    public static final int HORSE = 10;
    public static final int MANTIS = 11;
    public static final int MONKEY  =12;
    public static final int OX = 13;
    public static final int RABBIT = 14;
    public static final int ROOSTER = 15;
    public static final int TIGER = 16;
    public static final int RED = 1;
    public static final int BLUE = 2;

    private int type = 0;
    private int color = 0;
    private int[] row;
    private int[] col;

    public MoveCard(int type) {
        this.type = type;
        setAttributes();

    }

    private void setAttributes() {

        switch (type) {
            case BOAR:  color = RED;
                        row = new int[]{0 , 1 , 0 , 0};
                        col = new int[]{-1 , 1, 1 , 0};
                        break;
            case COBRA: color = RED;
                        row = new int[]{0 , 1 , -1 , 0};
                        col = new int[]{-1 , 1 , 1 , 0};
                        break;
            case CRAB:  color = BLUE;
                        row = new int[]{0 , 1 , 0 , 0};
                        col = new int[]{-2 , 0 , 2, 0};
                        break;
            case CRANE: color = BLUE;
                        row = new int[]{-1 , 1 , -1, 0};
                        col = new int[]{-1 , 0 , 1 , 0};
                        break;
            case DRAGON:color = RED;
                        row = new int[]{1 , -1 , -1 , 1};
                        col = new int[]{-2 , -1 , 1 , 2};
                        break;
            case EEL:   color = BLUE;
                        row = new int[]{1 , -1 , 0 , 0};
                        col = new int[]{-1 , -1 , 1 , 0};
                        break;
            case ELEPHANT:  color = RED;
                            row = new int[]{1 , 0 , 0 , 1};
                            col = new int[]{-1 , -1 , 1, 1};
                            break;
            case FROG:  color = RED;
                        row = new int[]{0 , 1 , -1 , 0};
                        col = new int[]{-2 , -1 , 1 , 0};
                        break;
            case GOOSE: color = BLUE;
                        row = new int[]{1 , 0 , 0 , -1};
                        col = new int[]{-1 , -1 , 1 , 1};
                        break;
            case HORSE: color = RED;
                        row = new int[]{0 , 1 , -1 , 0};
                        col = new int[]{-1, 0 , 0 , 0};
                        break;
            case MANTIS:color = RED;


        }
    }




}
