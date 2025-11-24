//javap
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

class zadanie {
    public static void main(String[] args) {
        // System.out.println("Введите число");
        // Scanner input = new Scanner(System.in);
        // Int num = input.nextInt();
        // System.out.println(num/2);


    }
    
}


class time {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dayofweekformat = new SimpleDateFormat("");
        String dayofweek = dayofweekformat.format(currentDate);
        System.out.println(dayofweek);




    }
}


class square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("*".repeat(num));
        }
        

    }
}