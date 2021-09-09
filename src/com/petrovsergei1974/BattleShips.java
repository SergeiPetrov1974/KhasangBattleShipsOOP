package com.petrovsergei1974;

public class BattleShips {
    public static void main(String[] args) {
        startGame();
    }

    static void startGame() {
        Field field = new Field();
        Player player = new Player();
        Ship ship = new Ship();
        ship.position = 4;

        field.init();
        field.setShip(ship);

        do {
            field.show();
            int shoot = player.getShoot();
            field.doShoot(shoot);
        }

        while (field.continueGame());
        field.show();
    }
}
