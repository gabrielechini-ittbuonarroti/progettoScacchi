package com.company;

public class Main {

    public static void main(String[] args) {
        Bishop b=new Bishop(new Position(1,'A'));
        try {
            if(!b.moveTo(new Position(4,'D'))){
                throw new Exception("Position not valid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        King k=new King(new Position(1,'A'));
        try {
            if(!k.moveTo(new Position(2,'A'))){
                throw new Exception("Position not valid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Queen q=new Queen(new Position(1,'A'));
        try {
            if(!b.moveTo(new Position(4,'D'))){
                throw new Exception("Position not valid");
            }
            if(!b.moveTo(new Position(4,'H'))){
                throw new Exception("Position not valid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Rook r=new Rook(new Position(1,'A'));
        try {
            if(!b.moveTo(new Position(1,'H'))){
                throw new Exception("Position not valid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
