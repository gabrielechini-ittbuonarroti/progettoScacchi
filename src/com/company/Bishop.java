package com.company;

import java.util.ArrayList;

public class Bishop extends ChessPiece{
    public Bishop(Position pos) {
        super(pos);
    }

    public ArrayList<Position> validMoves(Position pos) {
        char[] colonValid = {'A','B','C','D','E','F','G','H'};
        int x = pos.getRow();
        int y = findColonn(colonValid, pos.getCol());

        ArrayList<Position> mosse = new ArrayList<>(1);

        Position posit = pos;
        boolean continua = true;
        int i = 1;

        while(continua){
            posit = new Position((x+i), colonValid[y + i]);
            if(posit.isValid()){
                mosse.add(posit);
            } else {
                continua = false;
            }
            i = i + 1;
        }

        continua = true;
        i = 1;

        while(continua){
            posit = new Position((x-i), colonValid[y + i]);
            if(posit.isValid()){
                mosse.add(posit);
            } else {
                continua = false;
            }
            i = i + 1;
        }

        continua = true;
        i = 1;

        while(continua){
            posit = new Position((x+i), colonValid[y - i]);
            if(posit.isValid()){
                mosse.add(posit);
            } else {
                continua = false;
            }
            i = i + 1;
        }

        continua = true;
        i = 1;

        while(continua){
            posit = new Position((x-i), colonValid[y - i]);
            if(posit.isValid()){
                mosse.add(posit);
            } else {
                continua = false;
            }
            i = i + 1;
        }

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
