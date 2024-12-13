package game.strategy;

public class NormalAttack implements AttackStrategy {
    @Override
    public int calculateDamage(int baseDamage, int diceRoll) {

        return diceRoll >= 15 ? baseDamage + 5 : baseDamage;
    }
}
