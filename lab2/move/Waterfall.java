package move;
import ru.ifmo.se.pokemon.*;

final public class Waterfall extends PhysicalMove {
    public Waterfall() {
        super(Type.WATER, 80, 1.0);
    }
    @Override protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) {
            Effect.flinch(p);
        }
    }
    @Override protected String describe() {
        return "использует Waterfall";
    }
}