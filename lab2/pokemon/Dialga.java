package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

final public class Dialga extends Pokemon {
    public Dialga(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.DRAGON);
        setStats(100, 120, 120, 150, 100, 90);
        setMove(
            new StoneEdge(),
            new DragonClaw(),
            new Bulldoze(),
            new Rest()
        );
    }
}
