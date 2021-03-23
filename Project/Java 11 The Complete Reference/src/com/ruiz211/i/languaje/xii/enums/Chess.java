package com.ruiz211.i.languaje.xii.enums;

public enum Chess {

    King(1), Queen(1), Bishop(2), Knight(2), Rock(2), Pawn(8);

    private int number;

    Chess(int i) {
        this.number = i;
    }

    public int getNumber() {
        return number;
    }
}


