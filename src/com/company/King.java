package com.company;

import java.util.ArrayList;

public class King extends ChessPiece{
    public King(Position pos) {
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

        for(i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(x < 1 || x > 8){
                    valida = false;
                } else if(y < 0 || y > 7){
                    valida = false;
                } else {
                    valida = true;
                }

                if(valida){
                    Position posit = new Position(x, colonValid[y]);
                    mosse.add(posit);
                }

                x = x + 1;
                y = y + 1;
            }
        }
        return mosse;
    }
}
