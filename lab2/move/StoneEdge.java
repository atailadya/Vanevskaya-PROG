package move;
import ru.ifmo.se.pokemon.*;

final public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 0.8);
    }
    @Override protected double calcCriticalHit(Pokemon att, Pokemon def) {
        // вероятность попадания атаки увеличивается в 3 раза
        if (att.getStat(Stat.SPEED) * 3 / 512 > Math.random()) {
            System.out.println("Критический удар!");
            return 2.0;
        }
        return 1.0; 
    }
    @Override protected String describe() {
        return "использует Stone Edge";
    }
}