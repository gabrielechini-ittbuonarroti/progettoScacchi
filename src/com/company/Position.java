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
        if((0 < row && row < 9) && (0 < col && col < 9)){
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
