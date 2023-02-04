package com.company;

import java.util.ArrayList;

public abstract class ChessPiece{
    private Position pos;

    public ChessPiece(Position pos){
        this.pos = pos;
    }

    public Position getPosition(){
        return this.pos;
    }

    public boolean moveTo(Position pos){
        boolean moved = false;
        if(this.validMoves().contains(pos)){
            this.pos = pos;
            moved = true;
        }
        return moved;
    }

    public abstract ArrayList<Position> validMoves();

}