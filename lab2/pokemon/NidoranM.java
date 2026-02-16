package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public class NidoranM extends Pokemon {
    public NidoranM(String name, int level) {
        super(name, level);
        setType(Type.POISON);
        setStats(46, 57, 40, 40, 40, 50);
        setMove(
            new IceBeam(),
            new DoubleKick()
        );
    }
}