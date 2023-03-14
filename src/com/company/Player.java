package com.company;

import java.util.ArrayList;

public class Player {
    private ArrayList<ChessPiece> pedine;
    private boolean bianco;

    public Player(boolean bianco) {
        pedine = new ArrayList<ChessPiece>(16);
        if (bianco){
            for(int i = 0; i < 8; i++){
                Pawn pedone = new Pawn(new Position(2,(char)(i+65)));
                pedine.add(pedone);
            }
            Rook torre1 = new Rook(new Position(1,'A'));
            //Horse cavallo1 = new Horse(new Position(1,'B'));
            Bishop alfiere1 = new Bishop(new Position(1,'C'));
            Queen regina = new Queen(new Position(1,'D'));
            King re = new King(new Position(1,'E'));
            Bishop alfiere2 = new Bishop(new Position(1,'F'));
            //Horse cavallo2 = new Horse(new Position(1,'G'));
            Rook torre2 = new Rook(new Position(1,'H'));
        } else {
            for(int i = 0; i < 8; i++){
                Pawn pedone = new Pawn(new Position(7,(char)(i+65)));
                pedine.add(pedone);
            }
            Rook torre1 = new Rook(new Position(8,'A'));
            //Horse cavallo1 = new Horse(new Position(8,'B'));
            Bishop alfiere1 = new Bishop(new Position(8,'C'));
            Queen regina = new Queen(new Position(8,'D'));
            King re = new King(new Position(8,'E'));
            Bishop alfiere2 = new Bishop(new Position(8,'F'));
            //Horse cavallo2 = new Horse(new Position(8,'G'));
            Rook torre2 = new Rook(new Position(8,'H'));
        }
    }
}
