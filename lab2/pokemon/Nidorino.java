package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public class Nidorino extends NidoranM {
    public Nidorino(String name, int level) {
        super(name, level);
        setType(Type.POISON);
        setStats(61, 72, 57, 55, 55, 65);

        setMove(
            new IceBeam(),
            new DoubleKick(),
            new FuryAttack()
        );
    }
}