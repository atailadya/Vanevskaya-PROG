package move;
import ru.ifmo.se.pokemon.*;

final public class DragonClaw extends PhysicalMove {
    public DragonClaw() {
        super(Type.DRAGON, 80, 1);
    }
    @Override protected String describe() {
        return "использует Dragon Claw";
    }
}
