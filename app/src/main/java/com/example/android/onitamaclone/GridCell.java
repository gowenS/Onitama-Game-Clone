package com.example.android.onitamaclone;

import android.content.Context;
import android.util.AttributeSet;

public class GridCell extends android.support.v7.widget.AppCompatImageButton {

    public static final int PAWN = 1;
    public static final int MASTER = 2;

    boolean isOccupied = false;
    int p1p2 = 0;
    boolean masterPlatform = false;
    int whichPlatform = 0;
    boolean isMaster = false;
    int type = 0;


    public GridCell(Context context) {
        super(context);
    }


    public GridCell(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GridCell(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setMasterPlatform(int p1p2) {
        this.masterPlatform = true;
        this.whichPlatform = p1p2;
    }

    public void placePiece(int p1p2, int type){
        this.p1p2 = p1p2;
        this.type = type;
        this.isOccupied = true;
        if(this.p1p2 == 1){
            if(this.type == PAWN) setBackgroundResource(R.drawable.pawnred);
            if(this.type == MASTER) {
                setBackgroundResource(R.drawable.masterred);
                this.isMaster = true;
            }
        }
        if(this.p1p2 == 2){
            if(this.type == PAWN) setBackgroundResource(R.drawable.pawnblue);
            if(this.type == MASTER) {
                setBackgroundResource(R.drawable.masterblue);
                this.isMaster = true;
            }
        }

    }

    public void emptyCell() {
        if(masterPlatform) {
            if(whichPlatform == 1) setBackgroundResource(R.drawable.platformred);
            if(whichPlatform == 2) setBackgroundResource(R.drawable.platformblue);
        }
        else setBackgroundResource(R.drawable.blankcell);

        this.isOccupied = false;
        this.p1p2 = 0;
        this.isMaster = false;
        int type = 0;
    }


    public void makeSelectable() {
        if (!isOccupied) {
            if(masterPlatform) {
                if(whichPlatform == 1) setBackgroundResource(R.drawable.platformredselectable);
                if(whichPlatform == 2) setBackgroundResource(R.drawable.platformblueselectable);
            }
            else setBackgroundResource(R.drawable.blankcellselectable);
        } else {
            if (isMaster) {
                if(p1p2 == 1) setBackgroundResource(R.drawable.masterredselectable);
                if(p1p2 == 2) setBackgroundResource(R.drawable.masterblueselectable);
            } else {
                if(p1p2 == 1) setBackgroundResource(R.drawable.pawnredselectable);
                if(p1p2 == 2) setBackgroundResource(R.drawable.pawnblueselectable);
            }
        }
    }


}
