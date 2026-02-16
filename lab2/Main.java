package lab2;
import ru.ifmo.se.pokemon.*;
import pokemon.*;
import move.*;



public class Main {
    public static void main(String args[]) {
        Battle b = new Battle();
        Pokemon ally1 = new Dialga("Диалга", 42);
        Pokemon ally2 = new Starmie("Старми", 22);
        Pokemon ally3 = new Nidoking("Нидокинг", 22);

        Pokemon foe1  = new Staryu("Стари", 22);
        Pokemon foe2  = new Nidorino("Нидорино", 22);
        Pokemon foe3  = new NidoranM("Нидоран-мальчик", 12);

        b.addAlly(ally1);
        b.addAlly(ally2);
        b.addAlly(ally3);

        b.addFoe(foe1);
        b.addFoe(foe2);
        b.addFoe(foe3);

        b.go();
    }
}