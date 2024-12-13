package game.decorator;
import game.entities.Heroi;

class ShieldedHero extends HeroDecorator {
    public ShieldedHero(Heroi hero) {
        super(hero);
    }

    @Override
    public int setSofrerDano(int danoMonstro) {
        System.out.println("O escudo absorveu parte do dano!");
        return decoratedHero.setSofrerDano(danoMonstro / 2);
    }
}
