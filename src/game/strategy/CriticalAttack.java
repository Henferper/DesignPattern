package game.strategy;

public class CriticalAttack implements AttackStrategy {
    @Override
    public int calculateDamage(int baseDamage, int diceRoll) {
        return diceRoll >= 15 ? baseDamage * 2 : baseDamage;
    }
}
