package move;
import ru.ifmo.se.pokemon.*;

final public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 1.0);
    }
    @Override protected void applySelfEffects(Pokemon p) {
        double maxHP = p.getStat(Stat.HP);
        double curHP = p.getHP();
        int missingHP = (int) Math.round(maxHP-curHP);
        if (missingHP > 0) {
            p.setMod(Stat.HP, -missingHP);
        }
        p.setCondition(new Effect().condition(Status.SLEEP). turns(2));
    }
    @Override protected String describe() {
        return "использует Rest";
    }

    
}