// Created by Sean Gowen. The game rules and art for Onitama are not my property and are the property of Arcane Wonders. This version of this game is not for sale or distribution and is intended solely for personal use.

package com.example.android.onitamaclone;

import android.content.Context;
import android.util.AttributeSet;

public class GridCell extends android.support.v7.widget.AppCompatImageButton {

    public static final int PAWN = 1;
    public static final int MASTER = 2;

    boolean isOccupied = false;
    private int p1p2 = 0;
    boolean masterPlatform = false;
    int whichPlatform = 0;
    int type = 0;
    boolean selectable = false;


    public GridCell(Context context) {
        super(context);
    }

    public GridCell(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GridCell(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void updateBG() {

        if(selectable) {
            if (!isOccupied) {
                if(masterPlatform) {
                    if(whichPlatform == 1) setBackgroundResource(R.drawable.platformredselectable);
                    if(whichPlatform == 2) setBackgroundResource(R.drawable.platformblueselectable);
                }
                else setBackgroundResource(R.drawable.blankcellselectable);
            } else {
                if (type == MASTER) {
                    if(p1p2 == 1) setBackgroundResource(R.drawable.masterredselectable);
                    if(p1p2 == 2) setBackgroundResource(R.drawable.masterblueselectable);
                } else {
                    if (type == PAWN) {
                        if(p1p2 == 1) setBackgroundResource(R.drawable.pawnredselectable);
                        if(p1p2 == 2) setBackgroundResource(R.drawable.pawnblueselectable);
                    }

                }
            }
        } else {
            if (isOccupied) {
                if(this.p1p2 == 1){
                    if(this.type == PAWN) setBackgroundResource(R.drawable.pawnred);
                    if(this.type == MASTER) {
                        setBackgroundResource(R.drawable.masterred);
                    }
                }
                if(this.p1p2 == 2){
                    if(this.type == PAWN) setBackgroundResource(R.drawable.pawnblue);
                    if(this.type == MASTER) {
                        setBackgroundResource(R.drawable.masterblue);
                    }
                }
            } else {
                if(masterPlatform) {
                    if(whichPlatform == 1) setBackgroundResource(R.drawable.platformred);
                    if(whichPlatform == 2) setBackgroundResource(R.drawable.platformblue);
                }
                else setBackgroundResource(R.drawable.blankcell);
            }
        }
    }

    public void setMasterPlatform(int p1p2) {
        this.masterPlatform = true;
        this.whichPlatform = p1p2;
    }

    public void placePiece(int p1p2, int type){
        this.p1p2 = p1p2;
        this.type = type;
        this.isOccupied = true;
        updateBG();
    }

    public void emptyCell() {
        this.isOccupied = false;
        this.p1p2 = 0;
        int type = 0;
        selectable = false;
        updateBG();
    }


    public void makeSelectable() {
        selectable = true;
        updateBG();
    }

    public boolean isSelectable() { return selectable; }

    public void unSelectable() {
        selectable = false;
        updateBG();
    }

    public boolean isMaster() { return type == MASTER; }

    public boolean getIsPlatform() { return masterPlatform; }

    public int getP1P2() { return p1p2; }

    public int getType() { return type; }

}
