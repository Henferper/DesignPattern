package test.game.sigleton;

import game.entities.Heroi;
import game.entities.Monstro;
import game.factory.EntityFactory;
import game.singleton.GameManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameManagerTest {

    @Test
    void testSingletonInstance() {
        GameManager instance1 = GameManager.getInstance();
        GameManager instance2 = GameManager.getInstance();
        assertSame(instance1, instance2, "GameManager deve retornar sempre a mesma instância (singleton)");
    }

    @Test
    void testStartGameInitialization() {
        GameManager gameManager = GameManager.getInstance();

        Heroi heroi = EntityFactory.createHero();
        Monstro monstro = EntityFactory.createMonster();

        assertNotNull(heroi, "Herói deve ser inicializado");
        assertNotNull(monstro, "Monstro deve ser inicializado");
        assertTrue(heroi.getVida() > 0, "O herói deve começar com vida maior que 0");
        assertTrue(monstro.getVida() > 0, "O monstro deve começar com vida maior que 0");
    }
}
