package com.petrovsergei1974;

import java.util.Scanner;

public class BattleShips {
    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {

        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
        int shipPosition = 4;
        cells[shipPosition] = 'X';

        do {


            int shoot = 0;
            shoot = getShoot();


            switch (cells[shoot]) {
                case '.':
                    System.out.println("Промах");
                    cells[shoot] = '*';
                    break;
                case 'X':
                    System.out.println("Потопили");
                    cells[shoot] = '#';
                    break;
                case '*':
                    System.out.println("Уже стреляли");
                    break;
            }
        }
        while (cells[shipPosition] == 'X');
        System.out.println(cells);
    }
}
