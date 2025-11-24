public class Hello {
    public static void main(String[] args) {
        // try {
        //     System.out.println("Привет, " + args[0]);
        //     } catch (ArrayIndexOutOfBoundsException e) {
        //         System.out.println("Привет, хуесос, который не написал своё имя");
        //     }
        // if (args.length > 0) {
        //     System.out.println("Привет, " + args[0]);
        // }
        // else {
        //     System.out.println("Привет, хуесос, который не написал своё имя");
        // }

        switch(args.length) {
            case 0:
                System.out.println("Привет!");
                break;
            case 1:
                System.out.println("Привет, " + args[0] + "!");
                break;
            case 2:
                System.out.println("Привет, " + args[0] + ", " + args[1] + "!");
                break;
            default:
                System.out.println("Привет всем!");
                break;

        }

    }
}

// параметр static позволяет обращаться к методу (функции) бе дополнительного создания ОБЪЕКТА (экземпляра) класса. таким образом мы можем обратиться к методу напрямую через класс, потому что метод напрямую принадлежит классу 



class Beersong {
    public static void main(String[] args) {
        int beernum = 99;
        String word = "бутылок (бутылки)";

        while (beernum > 0) { 
            if (beernum == 1) word = "бутылка";
            System.out.println(beernum + " " + word + " пива на стене");
            System.out.println(beernum + " " + word + " пива");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            beernum -= 1;
            if (beernum > 0) System.out.println(beernum + " " + word + " пива на стене");
            else System.out.println("Нет бутылок пива на стене");
        }
        
        

    }
}

class PhraseOMatic {
    public static void main (String[] args) {
        String[] wordlistone = {"круглосулочный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выиграш", "фронтэнд", "на основе веб-технологий", "проникающий", "умный", "шесть сигм", "метод критического пути", "динамичный"};
        String[] wordlisttwo = {"уполномоченный", "трудный", "распределенный", "кластеризованный", "фирменный", "нестандартный ум", "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на", "общий", "совместный", "ускоренный"};
        String[] wordlistthree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец", "пункт следования"};

        int oneLength = wordlistone.length;
        int twoLength = wordlisttwo.length;
        int threeLength = wordlistthree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordlistone[rand1] + " " + wordlisttwo[rand2]  + " " + wordlistthree[rand3];

        System.out.println("Все, что вам нужно, - это " + phrase);




    }
}


class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
        if (x > 2) {
            System.out.print("a");
        }
        if (x == 2) {
            System.out.print("b c");
        }
        if (x == 1) {
            System.out.print("d");
            x -= 1;
        }
        x -= 1;
        System.out.print("-");

        }
    }
}


class Hello2 {
    public static void main(String[] args) {
        int [] s = {1, 2, 3, 4, 5};
        for (int i : s) {
            System.out.println(i);
        }

    }



}


// class triangle {
//     public static void main (String[] args) throws java.io.IOException {
//         System.out.println("Введите число: ");
//         Char[] array = new Char[];

//     }
// }


class quadrat {
    public static void main(String[] args) {
        int num = 5;
        System.out.format("%10s\n", "*".repeat(num));
        for (int i = 1; i < (num-1); i++) {
            System.out.printf("%10s\n", "*" + " ".repeat(num-2) + "*");
        }
        System.out.printf("%10s", "*".repeat(num));
    }
}

class longvdouble {
    public static void main(String[] args) {
        long a = 123456;
        double s = (double) a;
        System.out.println(s);
    }
}