package com.company;

import java.util.ArrayList;

public class Rook extends ChessPiece{
    public Rook(Position pos) {
        super(pos);
    }

    public ArrayList<Position> validMoves(Position pos){
        char[] colonValid = {'A','B','C','D','E','F','G','H'};
        int x = pos.getRow();
        int y = findColonn(colonValid, pos.getCol());

        ArrayList<Position> mosse = new ArrayList<>(1);

        for(int i = 0; i < 8; i++){
            Position p = new Position((i+1), pos.getCol());
            mosse.add(p);
        }

        for(int i = 0; i < 8; i++){
            Position p = new Position(x, colonValid[i]);
            mosse.add(p);
        }

        mosse.remove(pos);
        return mosse;
    }

    private int findColonn(char[] letter, char pos){
        int i = 0;
        int y = 0;
        boolean trovata = false;
        while (i < 8 && !trovata){
            if(letter[i] == pos){
                trovata = true;
                y = i;
            }
            i = i + 1;
        }

        return y;
    }
}
