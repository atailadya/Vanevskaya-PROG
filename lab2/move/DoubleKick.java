package move;
import ru.ifmo.se.pokemon.*;

final public class DoubleKick extends PhysicalMove {
    public DoubleKick() {
        super(Type.FIGHTING, 30, 1.0, 0, 2);
    }
    @Override protected String describe() {
        return "использует Double Kick";
    }
}