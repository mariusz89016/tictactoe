package com.java.oop.ticatactoe;

public enum Element {
    CROSS('X'), CIRCLE('O'), EMPTY('.');


    @Override
    public String toString() {
        return String.valueOf(x);
    }

    private final char x;

    Element(char x) {
        this.x = x;
    }
}
