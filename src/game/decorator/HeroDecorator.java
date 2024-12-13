package game.decorator;
import game.entities.Heroi;

abstract class HeroDecorator extends Heroi {
    protected Heroi decoratedHero;

    public HeroDecorator(Heroi hero) {
        this.decoratedHero = hero;
    }
}
