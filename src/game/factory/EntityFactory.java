package game.factory;

import game.entities.Heroi;
import game.entities.Monstro;

public class EntityFactory {
    public static Heroi createHero() {
        return new Heroi();
    }

    public static Monstro createMonster() {
        return new Monstro();
    }
}