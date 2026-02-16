package move;
import ru.ifmo.se.pokemon.*;

final public class DreamEater extends SpecialMove {
    private double dealt = 0.0;
    public DreamEater() {
        super(Type.PSYCHIC, 100, 1.0);
    }
    @Override protected void applyOppDamage(Pokemon def, double damage) {
        if (def.getCondition() == Status.SLEEP) {
            dealt = damage;
            super.applyOppDamage(def, damage);
        }
        else {
            dealt = 0.0;
        }
    }
    @Override protected void applySelfEffects(Pokemon p) {
        if (dealt > 0.0) {
            double maxHP = p.getStat(Stat.HP);
            int halfHP = (int) Math.round(dealt / 2.0);
            double curHP = p.getHP();
            int missingHP = (int) Math.round(maxHP - curHP);
            if (missingHP > halfHP) {
                p.setMod(Stat.HP, -halfHP);
            }
            else {
                p.setMod(Stat.HP, -missingHP);
            }
        }
        else {
            return;
        }
    }
    @Override protected String describe() {
        return "использует Dream Eater";
    }

}