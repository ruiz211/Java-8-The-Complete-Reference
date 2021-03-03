package com.ruiz211.TheJavaLanguage.XII.EnumerationsAutoboxingAndAnnotations;

public class PlayChess {
    public static void main(String... doYourBest) {
        for (Chess piece : Chess.values()) {
            System.out.println("There is/are: " + piece.getNumber() + " " + piece.name());
        }
    }
}
