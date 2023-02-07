package com.company;

public class Position {
    private int row;
    private char col;

    public Position(int row, char col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public char getCol() {
        return col;
    }

    public void setCol(char col) {
        this.col = col;
    }

    public boolean isValid(){
        char[] colonValid = {'A','B','C','D','E','F','G','H'};
        boolean colValid = false;
        for(int i = 0; i < 8; i++){
            if(colonValid[i] == col){
                colValid = true;
            }
        }

        if((0 < row && row < 9) && (colValid)){
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Position pos){
        if(row == pos.getRow() && col == pos.getCol()){
            return true;
        } else {
            return false;
        }
    }

}
