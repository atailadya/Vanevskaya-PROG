package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

final public class Nidoking extends Nidorino {
    public Nidoking(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(81, 102, 77, 85, 75, 85);
        setMove(
            new IceBeam(),
            new DoubleKick(),
            new FuryAttack(),
            new Rest()
        );
    }
}