package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public final class Starmie extends Staryu {
    public Starmie(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.PSYCHIC);
        setStats(60, 75, 85, 100, 85, 115);
        setMove(
                new Blizzard(),
                new Recover(),
                new Waterfall(),
                new DreamEater()
        );
    }
}