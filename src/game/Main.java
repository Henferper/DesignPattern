package game;

import game.singleton.GameManager;

public class Main {
    public static void main(String[] args) {
        GameManager game = GameManager.getInstance();
        game.startGame();
    }
}
