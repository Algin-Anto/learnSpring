package com.codewithalgi.java_game.game;

public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("down");
    }

    public void left() {
        System.out.println("Go Back");
    }

    public void right() {
        System.out.println("Go faster");
    }
}
