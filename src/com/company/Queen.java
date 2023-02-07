package com.company;

import java.util.ArrayList;

public class Queen extends ChessPiece{
    public Queen(Position pos) {
        super(pos);
    }

    public ArrayList<Position> validMoves(Position pos){
        int x = pos.getRow() - 1;
        int y = 0;


        char[] colonValid = {'A','B','C','D','E','F','G','H'};
        boolean valida;
        ArrayList<Position> mosse = new ArrayList<>(1);

        int i = 0;
        boolean trovata = false;
        while (i < 8 && !trovata){
            if(colonValid[i] == pos.getCol()){
                trovata = true;
                y = i;
            }
            i = i + 1;
        }

        y = y - 1;
        for(i = 0; i < 8; i++){
            Position p = new Position((i+1), pos.getCol());
            mosse.add(p);
        }

        for(i = 0; i < 8; i++){
            Position p = new Position(x, colonValid[i]);
            mosse.add(p);
        }
        mosse.remove(pos);
        return mosse;
    }
}

