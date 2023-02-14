package com.company;

import java.util.ArrayList;


public class Pawn extends ChessPiece {
    public Pawn(Position pos) {
        super(pos);
    }

    public ArrayList<Position> validMoves(Position pos) {

        int x = pos.getRow() - 1;
        int y = 0;


        char[] colonValid = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        boolean valida;
        ArrayList<Position> mosse = new ArrayList<>(1);

        int i = 0;
        boolean trovata = false;
        while (i < 8 && !trovata) {
            if (colonValid[i] == pos.getCol()) {
                trovata = true;
                y = i;
            }
            i = i + 1;
        }

        y = y - 1;


        if (mosse.size() == 1) {
            for (i = 0; i < 8; i++) {
                if (y > 2) {
                    valida = false;
                } else {
                    valida = true;
                }
            }
        } else {
            for (i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (y > 1) {
                        valida = false;
                    } else {
                        valida = true;
                    }
                    if (valida) {
                        Position posit = new Position(x, colonValid[y]);
                        mosse.add(posit);
                    }

                    x = x + 1;
                    y = y + 1;
                }
            }
        }


        return mosse;
    }



    public boolean mangia(Position pos) throws Exception {
        Position posDestra = new Position(pos.getRow()+1, (char) (pos.getCol()+1));
        Position posSinistra = new Position(pos.getRow()-1, (char) (pos.getCol()+1));
        if(pos.getRow() <= 7 && pos.getCol() <= 7){
            if(!moveTo(posDestra) ){

            } else if (moveTo(posSinistra)) {

            }
        }

    }
}

