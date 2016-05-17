package com.java.oop.ticatactoe;

public class Board {
    private final Element[][] array = new Element[3][3];

    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = Element.EMPTY;
            }
        }
    }
    public void insertElement(int place, Element element) {
        array[place/3][place%3] = element;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                stringBuilder.append(array[i][j]);
                if(j!=2)
                    stringBuilder.append("|");
            }
            stringBuilder.append("\n");
            if(i!=2)
                stringBuilder.append("-+-+-\n");
        }
        return stringBuilder.toString();
    }
}
