package move;
import ru.ifmo.se.pokemon.*;

final public class Recover extends StatusMove {
    public Recover() {
        super(Type.NORMAL, 0, 1.0);
    }
    @Override protected void applySelfEffects(Pokemon p) {
        double maxHP = p.getStat(Stat.HP);
        int halfHP = (int) Math.round(maxHP / 2.0);
        double curHP = p.getHP();
        int missingHP = (int) (maxHP - curHP);
        if (missingHP <= halfHP) {
            p.setMod(Stat.HP, -missingHP);
        }
        else {
            p.setMod(Stat.HP, -halfHP);
        }
    }
    @Override protected String describe() {
        return "использует Recover";
    }
}