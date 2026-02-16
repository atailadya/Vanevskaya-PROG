package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public class Staryu extends Pokemon {
    public Staryu(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(30, 45, 55, 70, 55, 85);

        setMove(
                new Blizzard(),
                new Recover(),
                new Waterfall()
        );
    }
}