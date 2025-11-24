public class Lab1 {
    public static void main(String[] args) {
    Short[] s = new Short[9];
    short value = 17;
    for (int i = 0; i < 9; i += 1, value -= 2) {
        s[i] = value; 
    }

    
    Double[] x = new Double[20];
    for (int i = 0; i < x.length; i++) {
        x[i] = -3.0 + (Math.random() * 15.0);
    }

    Double[][] w = new Double[9][20];
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 20; j++) {
            w[i][j] = element(s[i], x[j]);
        }
    }
    printArray(w);
    
    

    }  
    // метод для расчета элемента массива
    double element (short S, double X) {
        if (S == 9) {
            return Math.sin(Math.atan(Math.cos(X)));
        }
        else if (S == 7 | S == 11 | S == 13 | S == 15) {
            return Math.exp(Math.asin(Math.cos(X)));
        }
        else {
            return Math.cbrt(Math.pow((0.25 * ((2.0 * Math.cos(X)) * (2 * Math.cos(X))) - 0.75), Math.asin(((X + 4.5)/15.0) * ((X + 4.5)/15.0))));
        }
    }
    // метод для вывода элементов массива
    static void printArray (Double[][] w) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.format("%10.5f\t", w[i][j]);
        }
    }
}

    static void printArray2 (Double[][] w) {
        int i = 0;
        int count = 0;
        while (i < 9) {
            int j = 0;
            do {
                System.out.format("%10.5f\t", w[i][j]);
                j += 1;
            } while (j < 20);
            i += 1;
        }
    }
}


class lab0 {
    public static void main(String[] args) {
        Lab1 s = new Lab1();
        short S = 5;
        int f = 33^34; 
        System.out.println(s.element(S, 7.0));
        System.out.println(f);
        // boolean A = false;
        // boolean B = true;
        // System.out.println(A^B);
        
    }
}

логические операции: 1. () 2. отрицание 3. & 4. | 5. 



class Lab1 {
    public static void main(String[] args) {
        Long[] s = new Long[13];
        long value = 16;
        for (int i = 0; i < s.length; i++, value--) {
            s[i] = value;
        } 
        Double[] x = new Double[18];
        for (int i = 0; i < x.length; i++) {
            x[i] = -4.0 + (Math.random() * 15.0);
        }
        Double[][] l = new Double[13][18];
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 18; j++) {
                l[i][j] = element(s[i], x[j]);
            }
        } 
        printArray(l);
        }
    
    
    static double element(Long S, Double X) {
                if (S == 7) {
                    return Math.log(Math.cos(Math.cos(Math.sin(X))) * Math.cos(Math.cos(Math.sin(X))));
                }
                else if (S == 6 | S == 8 | S == 9 | S == 10 | S == 12 | S == 13) {
                    return Math.exp(Math.log(Math.acos((X + 3.5) / 15.0)));
                }
                else {
                    return Math.cbrt(Math.sin(Math.cos(Math.PI / X)*(Math.PI / X)*(Math.PI / X)));
                }
        }
    static void printArray(Double [][] l) {
            for (int i = 0; i < 13; i++) {
                for (int j = 0; j < 18; j++) {
                    System.out.printf("%10.3f\t", l[i][j]);
                }
            }
}
}