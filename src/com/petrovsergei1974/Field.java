package com.petrovsergei1974;

public class Field {
    char[] cells = new char[10];

    void show() {
        System.out.println(cells);
    }

    void init() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }
}
