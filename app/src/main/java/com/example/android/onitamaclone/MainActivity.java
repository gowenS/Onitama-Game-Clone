package com.example.android.onitamaclone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

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

    MoveCard p1Opt1;
    MoveCard p1Opt2;
    MoveCard p2Opt1;
    MoveCard p2Opt2;
    MoveCard p1Next;
    MoveCard p2Next;
    MoveCard p1Play;
    MoveCard p2Play;

    ImageButton p1opt1Butt;
    ImageButton p1opt2Butt;
    ImageButton p2opt1Butt;
    ImageButton p2opt2Butt;

    ImageView p1NextView;
    ImageView p1PlayView;
    ImageView p2NextView;
    ImageView p2PlayView;

    CheckBox basegame;
    CheckBox expansion;

    Button reset1;
    Button reset2;

    int playerTurn;

    boolean win = false;

    boolean moveChosen = false;

    int[] movePlayer;

    GridCell[][] gameBoard = new GridCell[5][5];
    ArrayList<MoveCard> cardStack = new ArrayList<MoveCard>(16);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        basegame = findViewById(R.id.basegame);
        basegame.setChecked(true);
        expansion = findViewById(R.id.senseispath);


        p1opt1Butt = findViewById(R.id.p1option1);
        p1opt1Butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseMove(1);
            }
        });

        p1opt2Butt = findViewById(R.id.p1option2);
        p1opt2Butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseMove(2);
            }
        });

        p2opt1Butt = findViewById(R.id.p2option1);
        p2opt1Butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseMove(3);
            }
        });

        p2opt2Butt = findViewById(R.id.p2option2);
        p2opt2Butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseMove(4);
            }
        });

        p1NextView = findViewById(R.id.p1nextcard);
        p1PlayView = findViewById(R.id.p1playcard);
        p2NextView = findViewById(R.id.p2nextcard);
        p2PlayView = findViewById(R.id.p2playcard);

        reset1 = findViewById(R.id.reset_1);
        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( basegame.isChecked() || expansion.isChecked() ) {
                    initializeGame();
                }

            }
        });

        reset2 = findViewById(R.id.reset_2);
        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( basegame.isChecked() || expansion.isChecked() ) {
                    initializeGame();
                }
            }
        });



        zero_zero = (GridCell) findViewById(R.id.zero_zero);
        zero_zero.setBackgroundResource(R.drawable.blankcell);
        gameBoard[0][0] = zero_zero;
        zero_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(0,0);


            }
        });

        zero_one = (GridCell) findViewById(R.id.zero_one);
        zero_one.setBackgroundResource(R.drawable.blankcell);
        gameBoard[0][1] = zero_one;
        zero_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(0,1);


            }
        });

        zero_two = (GridCell) findViewById(R.id.zero_two);
        zero_two.setBackgroundResource(R.drawable.blankcell);
        gameBoard[0][2] = zero_two;
        zero_two.setMasterPlatform(2);
        zero_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(0,2);


            }
        });

        zero_three = (GridCell) findViewById(R.id.zero_three);
        zero_three.setBackgroundResource(R.drawable.blankcell);
        gameBoard[0][3] = zero_three;
        zero_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(0,3);

            }
        });

        zero_four = (GridCell) findViewById(R.id.zero_four);
        zero_four.setBackgroundResource(R.drawable.blankcell);
        gameBoard[0][4] = zero_four;
        zero_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(0,4);



            }
        });

        //end row 0

        one_zero = (GridCell) findViewById(R.id.one_zero);
        one_zero.setBackgroundResource(R.drawable.blankcell);
        gameBoard[1][0] = one_zero;
        one_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(1,0);


            }
        });

        one_one = (GridCell) findViewById(R.id.one_one);
        one_one.setBackgroundResource(R.drawable.blankcell);
        gameBoard[1][1] = one_one;
        one_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(1,1);


            }
        });

        one_two = (GridCell) findViewById(R.id.one_two);
        one_two.setBackgroundResource(R.drawable.blankcell);
        gameBoard[1][2] = one_two;
        one_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(1,2);


            }
        });

        one_three = (GridCell) findViewById(R.id.one_three);
        one_three.setBackgroundResource(R.drawable.blankcell);
        gameBoard[1][3] = one_three;
        one_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(1,3);


            }
        });

        one_four = (GridCell) findViewById(R.id.one_four);
        one_four.setBackgroundResource(R.drawable.blankcell);
        gameBoard[1][4] = one_four;
        one_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(1,4);


            }
        });

        //end row 1

        two_zero = (GridCell) findViewById(R.id.two_zero);
        two_zero.setBackgroundResource(R.drawable.blankcell);
        gameBoard[2][0] = two_zero;
        two_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(2,0);


            }
        });

        two_one = (GridCell) findViewById(R.id.two_one);
        two_one.setBackgroundResource(R.drawable.blankcell);
        gameBoard[2][1] = two_one;
        two_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(2,1);



            }
        });

        two_two = (GridCell) findViewById(R.id.two_two);
        two_two.setBackgroundResource(R.drawable.blankcell);
        gameBoard[2][2] = two_two;
        two_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(2,2);


            }
        });

        two_three = (GridCell) findViewById(R.id.two_three);
        two_three.setBackgroundResource(R.drawable.blankcell);
        gameBoard[2][3] = two_three;
        two_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(2,3);


            }
        });

        two_four = (GridCell) findViewById(R.id.two_four);
        two_four.setBackgroundResource(R.drawable.blankcell);
        gameBoard[2][4] = two_four;
        two_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(2,4);


            }
        });

        //end row 2

        three_zero = (GridCell) findViewById(R.id.three_zero);
        three_zero.setBackgroundResource(R.drawable.blankcell);
        gameBoard[3][0] = three_zero;
        three_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(3,0);


            }
        });

        three_one = (GridCell) findViewById(R.id.three_one);
        three_one.setBackgroundResource(R.drawable.blankcell);
        gameBoard[3][1] = three_one;
        three_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(3,1);


            }
        });

        three_two = (GridCell) findViewById(R.id.three_two);
        three_two.setBackgroundResource(R.drawable.blankcell);
        gameBoard[3][2] = three_two;
        three_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(3,2);


            }
        });

        three_three = (GridCell) findViewById(R.id.three_three);
        three_three.setBackgroundResource(R.drawable.blankcell);
        gameBoard[3][3] = three_three;
        three_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(3,3);


            }
        });

        three_four = (GridCell) findViewById(R.id.three_four);
        three_four.setBackgroundResource(R.drawable.blankcell);
        gameBoard[3][4] = three_four;
        three_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(3,4);


            }
        });


        //end row 3

        four_zero = (GridCell) findViewById(R.id.four_zero);
        four_zero.setBackgroundResource(R.drawable.blankcell);
        gameBoard[4][0] = four_zero;
        four_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(4,0);


            }
        });

        four_one = (GridCell) findViewById(R.id.four_one);
        four_one.setBackgroundResource(R.drawable.blankcell);
        gameBoard[4][1] = four_one;
        four_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(4,1);


            }
        });

        four_two = (GridCell) findViewById(R.id.four_two);
        four_two.setBackgroundResource(R.drawable.blankcell);
        gameBoard[4][2] = four_two;
        four_two.setMasterPlatform(1);
        four_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(4,2);


            }
        });

        four_three = (GridCell) findViewById(R.id.four_three);
        four_three.setBackgroundResource(R.drawable.blankcell);
        gameBoard[4][3] = four_three;
        four_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(4,3);


            }
        });

        four_four = (GridCell) findViewById(R.id.four_four);
        four_four.setBackgroundResource(R.drawable.blankcell);
        gameBoard[4][4] = four_four;
        four_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridPress(4,4);


            }
        });

        initializeGame();

    }

    public void initializeGame() {
        cardStack.clear();
        moveChosen = false;
        movePlayer = null;
        win = false;

        if (basegame.isChecked()) {
            if (expansion.isChecked()) {
                for (int i = 0; i < 32 ; i++) {
                    cardStack.add(new MoveCard(i + 1));
                }
            } else {
                for (int i = 0; i < 16 ; i++) {
                    cardStack.add(new MoveCard(i + 1));
                }
            }
        } else {
            if (expansion.isChecked()) {
                for (int i = 16; i < 32 ; i++) {
                    cardStack.add(new MoveCard(i + 1));
                }
            }
        }

        Collections.shuffle(cardStack);


        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++){
                gameBoard[i][j].emptyCell();
            }
        }

        unselectAll();

        zero_zero.placePiece(2,GridCell.PAWN);
        zero_one.placePiece(2,GridCell.PAWN);
        zero_two.placePiece(2,GridCell.MASTER);
        zero_three.placePiece(2,GridCell.PAWN);
        zero_four.placePiece(2,GridCell.PAWN);

        four_zero.placePiece(1,GridCell.PAWN);
        four_one.placePiece(1,GridCell.PAWN);
        four_two.placePiece(1,GridCell.MASTER);
        four_three.placePiece(1,GridCell.PAWN);
        four_four.placePiece(1,GridCell.PAWN);

        p1Opt1 = cardStack.get(0);
        p1Opt2 = cardStack.get(1);
        p2Opt1 = cardStack.get(2);
        p2Opt2 = cardStack.get(3);

        p1opt1Butt.setBackgroundResource(p1Opt1.getBG());
        p1opt2Butt.setBackgroundResource(p1Opt2.getBG());
        p2opt1Butt.setBackgroundResource(p2Opt1.getBG());
        p2opt2Butt.setBackgroundResource(p2Opt2.getBG());

        p1PlayView.setBackgroundResource(R.drawable.redcard);
        p2PlayView.setBackgroundResource(R.drawable.bluecard);
        p1NextView.setBackgroundResource(R.drawable.blank);
        p2NextView.setBackgroundResource(R.drawable.blank);


        MoveCard next = cardStack.get(4);
        if(next.whichColor() == MoveCard.BLUE) {
            p2Next = next;
            p2NextView.setBackgroundResource(p2Next.getBGinv());
            playerTurn = 2;
        }
        if(next.whichColor() == MoveCard.RED) {
            p1Next = next;
            p1NextView.setBackgroundResource(p1Next.getBGinv());
            playerTurn = 1;
        }

    }

    public void chooseMove(int button){
        if(!moveChosen){
            movePlayer = null;
            if(playerTurn == 1 && button == 1 ) {
                p1Play = p1Opt1;
                p1Opt1 = null;
                p1PlayView.setBackgroundResource(p1Play.getBG());
                p1opt1Butt.setBackgroundResource(R.drawable.blank);
                moveChosen = true;
            }
            if(playerTurn == 1 && button == 2 ) {
                p1Play = p1Opt2;
                p1Opt2 = null;
                p1PlayView.setBackgroundResource(p1Play.getBG());
                p1opt2Butt.setBackgroundResource(R.drawable.blank);
                moveChosen = true;
            }
            if(playerTurn == 2 && button == 3 ) {
                p2Play = p2Opt1;
                p2Opt1 = null;
                p2PlayView.setBackgroundResource(p2Play.getBG());
                p2opt1Butt.setBackgroundResource(R.drawable.blank);
                moveChosen = true;
            }
            if(playerTurn == 2 && button == 4 ) {
                p2Play = p2Opt2;
                p2Opt2 = null;
                p2PlayView.setBackgroundResource(p2Play.getBG());
                p2opt2Butt.setBackgroundResource(R.drawable.blank);
                moveChosen = true;
            }
        }
    }

    public void gridPress(int row, int col) {
        if (moveChosen) {
            if (playerTurn == gameBoard[row][col].getP1P2()) {
                unselectAll();
                showLegalMoves(row,col);
            }
            if (gameBoard[row][col].isSelectable()) {
                if (gameBoard[row][col].isOccupied && gameBoard[row][col].isMaster()) win = true;
                if (!gameBoard[row][col].isOccupied && gameBoard[row][col].getIsPlatform() && playerTurn != gameBoard[row][col].whichPlatform) win = true;
                gameBoard[row][col].placePiece(playerTurn,gameBoard[movePlayer[0]][movePlayer[1]].getType());
                gameBoard[movePlayer[0]][movePlayer[1]].emptyCell();
                unselectAll();
                movePlayer = null;
                giveCards();
                moveChosen = false;
                if (win) {
                    if (playerTurn == 1) gameBoard[row][col].setBackgroundResource(R.drawable.hughmungus);
                    if (playerTurn == 2) gameBoard[row][col].setBackgroundResource(R.drawable.hughmungus2);
                }
            }
        }
    }

    public void showLegalMoves(int row, int col) {

        movePlayer = new int[]{row,col};
        MoveCard cardChosen = null;
        GridCell checkHere;
        int rowCheck = -1;
        int colCheck = -1;
        if ( playerTurn == 1 ) {
            cardChosen = p1Play;
        }
        if ( playerTurn == 2 ) {
            cardChosen = p2Play;
        }
        int[] moveRow = cardChosen.getRow();
        int[] moveCol = cardChosen.getCol();
        for (int spot = 0; spot < 4 ; spot++){
            if ( playerTurn == 1 ) {
                rowCheck = row - moveRow[spot];
                colCheck = col + moveCol[spot];
            }
            if ( playerTurn == 2 ){
                rowCheck = row + moveRow[spot];
                colCheck = col - moveCol[spot];
            }
            if ((rowCheck > -1 && rowCheck < 5) && (colCheck > -1 && colCheck < 5)) {
                checkHere = gameBoard[rowCheck][colCheck];
                if (checkHere.getP1P2() != playerTurn) {
                    checkHere.makeSelectable();
                }
            }

        }
    }

    public void unselectAll() {
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++){
                gameBoard[i][j].unSelectable();
            }
        }
    }

    public void giveCards() {
        if (playerTurn == 1) {
            p2Next = p1Play;
            p1Play = null;
            p2NextView.setBackgroundResource(p2Next.getBGinv());
            p1PlayView.setBackgroundResource(R.drawable.redcard);
            if (p1Opt1 == null) {
                p1Opt1 = p1Next;
                p1Next = null;
                p1opt1Butt.setBackgroundResource(p1Opt1.getBG());
                p1NextView.setBackgroundResource(R.drawable.blank);
            }
            if (p1Opt2 == null) {
                p1Opt2 = p1Next;
                p1Next = null;
                p1opt2Butt.setBackgroundResource(p1Opt2.getBG());
                p1NextView.setBackgroundResource(R.drawable.blank);
            }
            playerTurn = 2;
        } else {
            p1Next = p2Play;
            p2Play = null;
            p1NextView.setBackgroundResource(p1Next.getBGinv());
            p2PlayView.setBackgroundResource(R.drawable.bluecard);
            if (p2Opt1 == null) {
                p2Opt1 = p2Next;
                p2Next = null;
                p2opt1Butt.setBackgroundResource(p2Opt1.getBG());
                p2NextView.setBackgroundResource(R.drawable.blank);
            }
            if (p2Opt2 == null) {
                p2Opt2 = p2Next;
                p2Next = null;
                p2opt2Butt.setBackgroundResource(p2Opt2.getBG());
                p2NextView.setBackgroundResource(R.drawable.blank);
            }
            playerTurn = 1;
        }

    }



}
