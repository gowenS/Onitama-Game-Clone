package com.example.android.onitamaclone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    GridCell zero_zero;
    GridCell zero_one;
    GridCell zero_two;
    GridCell zero_three;
    GridCell zero_four;

    GridCell one_zero;
    GridCell one_one;
    GridCell one_two;
    GridCell one_three;
    GridCell one_four;

    GridCell two_zero;
    GridCell two_one;
    GridCell two_two;
    GridCell two_three;
    GridCell two_four;

    GridCell three_zero;
    GridCell three_one;
    GridCell three_two;
    GridCell three_three;
    GridCell three_four;

    GridCell four_zero;
    GridCell four_one;
    GridCell four_two;
    GridCell four_three;
    GridCell four_four;

    GridCell[][] gameBoard = new GridCell[5][5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        zero_zero = (GridCell) findViewById(R.id.zero_zero);
        zero_zero.setBackgroundResource(R.drawable.blankcell);
        gameBoard[0][0] = zero_zero;
        zero_zero.placePiece(2,GridCell.PAWN);
        zero_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        zero_one = (GridCell) findViewById(R.id.zero_one);
        zero_one.setBackgroundResource(R.drawable.blankcell);
        gameBoard[0][1] = zero_one;
        zero_one.placePiece(2,GridCell.PAWN);
        zero_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        zero_two = (GridCell) findViewById(R.id.zero_two);
        zero_two.setBackgroundResource(R.drawable.blankcell);
        gameBoard[0][2] = zero_two;
        zero_two.setMasterPlatform(2);
        zero_two.placePiece(2,GridCell.MASTER);
        zero_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        zero_three = (GridCell) findViewById(R.id.zero_three);
        zero_three.setBackgroundResource(R.drawable.blankcell);
        gameBoard[0][3] = zero_three;
        zero_three.placePiece(2,GridCell.PAWN);
        zero_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        zero_four = (GridCell) findViewById(R.id.zero_four);
        zero_four.setBackgroundResource(R.drawable.blankcell);
        gameBoard[0][4] = zero_four;
        zero_four.placePiece(2,GridCell.PAWN);
        zero_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //end row 0

        one_zero = (GridCell) findViewById(R.id.one_zero);
        one_zero.setBackgroundResource(R.drawable.blankcell);
        gameBoard[1][0] = one_zero;
        one_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        one_one = (GridCell) findViewById(R.id.one_one);
        one_one.setBackgroundResource(R.drawable.blankcell);
        gameBoard[1][1] = one_one;
        one_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        one_two = (GridCell) findViewById(R.id.one_two);
        one_two.setBackgroundResource(R.drawable.blankcell);
        gameBoard[1][2] = one_two;
        one_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        one_three = (GridCell) findViewById(R.id.one_three);
        one_three.setBackgroundResource(R.drawable.blankcell);
        gameBoard[1][3] = one_three;
        one_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        one_four = (GridCell) findViewById(R.id.one_four);
        one_four.setBackgroundResource(R.drawable.blankcell);
        gameBoard[1][4] = one_four;
        zero_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //end row 1

        two_zero = (GridCell) findViewById(R.id.two_zero);
        two_zero.setBackgroundResource(R.drawable.blankcell);
        gameBoard[2][0] = two_zero;
        two_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        two_one = (GridCell) findViewById(R.id.two_one);
        two_one.setBackgroundResource(R.drawable.blankcell);
        gameBoard[2][1] = two_one;
        two_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        two_two = (GridCell) findViewById(R.id.two_two);
        two_two.setBackgroundResource(R.drawable.blankcell);
        gameBoard[2][2] = two_two;
        two_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        two_three = (GridCell) findViewById(R.id.two_three);
        two_three.setBackgroundResource(R.drawable.blankcell);
        gameBoard[2][3] = two_three;
        two_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        two_four = (GridCell) findViewById(R.id.two_four);
        two_four.setBackgroundResource(R.drawable.blankcell);
        gameBoard[2][4] = two_four;
        two_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //end row 2

        three_zero = (GridCell) findViewById(R.id.three_zero);
        three_zero.setBackgroundResource(R.drawable.blankcell);
        gameBoard[3][0] = three_zero;
        three_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        three_one = (GridCell) findViewById(R.id.three_one);
        three_one.setBackgroundResource(R.drawable.blankcell);
        gameBoard[3][1] = three_one;
        three_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        three_two = (GridCell) findViewById(R.id.three_two);
        three_two.setBackgroundResource(R.drawable.blankcell);
        gameBoard[3][2] = three_two;
        three_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        three_three = (GridCell) findViewById(R.id.three_three);
        three_three.setBackgroundResource(R.drawable.blankcell);
        gameBoard[3][3] = three_three;
        three_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        three_four = (GridCell) findViewById(R.id.three_four);
        three_four.setBackgroundResource(R.drawable.blankcell);
        gameBoard[3][4] = three_four;
        three_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        //end row 3

        four_zero = (GridCell) findViewById(R.id.four_zero);
        four_zero.setBackgroundResource(R.drawable.blankcell);
        gameBoard[4][0] = four_zero;
        four_zero.placePiece(1,GridCell.PAWN);
        four_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        four_one = (GridCell) findViewById(R.id.four_one);
        four_one.setBackgroundResource(R.drawable.blankcell);
        gameBoard[4][1] = four_one;
        four_one.placePiece(1,GridCell.PAWN);
        four_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        four_two = (GridCell) findViewById(R.id.four_two);
        four_two.setBackgroundResource(R.drawable.blankcell);
        gameBoard[4][2] = four_two;
        four_two.setMasterPlatform(1);
        four_two.placePiece(1,GridCell.MASTER);
        four_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        four_three = (GridCell) findViewById(R.id.four_three);
        four_three.setBackgroundResource(R.drawable.blankcell);
        gameBoard[4][3] = four_three;
        four_three.placePiece(1,GridCell.PAWN);
        four_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        four_four = (GridCell) findViewById(R.id.four_four);
        four_four.setBackgroundResource(R.drawable.blankcell);
        gameBoard[4][4] = four_four;
        four_four.placePiece(1,GridCell.PAWN);
        four_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }



}
