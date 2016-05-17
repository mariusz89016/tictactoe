package com.java.oop.ticatactoe;

public class Runner {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        Board board = new Board();
        board.insertElement(3, Element.CROSS);
        board.insertElement(6, Element.CIRCLE);
        System.out.println(board);
    }
}
