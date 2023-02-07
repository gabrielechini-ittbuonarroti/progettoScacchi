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

    public boolean moveTo(Position pos) throws Exception{
        if(pos.isValid()) {
            boolean moved = false;
            if (this.validMoves(pos).contains(pos)) {
                this.pos = pos;
                moved = true;
            }
            return moved;
        } else {
            throw new Exception("La posizione non è valida");
        }
    }

    public abstract ArrayList<Position> validMoves(Position pos);

}