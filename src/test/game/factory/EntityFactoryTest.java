package game.factory;

import game.entities.Heroi;
import game.entities.Monstro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntityFactoryTest {

    @Test
    void testCreateHero() {
        Heroi heroi = EntityFactory.createHero();
        assertNotNull(heroi, "O herói deve ser criado com sucesso");
    }

    @Test
    void testCreateMonster() {
        Monstro monstro = EntityFactory.createMonster();
        assertNotNull(monstro, "O monstro deve ser criado com sucesso");
    }
}
