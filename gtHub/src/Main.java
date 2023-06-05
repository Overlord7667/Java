import java.util.Scanner;

public class Main {
//    public static void Number(int a, int b, int c, int d, int e, int f, int r){
//        if (a == 1){
//            System.out.println("I");
//        } else if (b == 5) {
//            System.out.println("V");
//        } else if (c == 10) {
//            System.out.println("X");
//        } else if (d == 50) {
//            System.out.println("L");
//        } else if (e == 100) {
//            System.out.println("C");
//        } else if (f == 500) {
//            System.out.println("D");
//        } else if (r == 1000) {
//            System.out.println("M");
//        }else {
//            System.out.println("Symbol = " );
//        }
//
//    }

    public static void main(String[] args) {
        System.out.println("Введите число");
        System.out.println("""
                1 = I
                5 = V
                10 = X
                50 = L
                100 = C
                500 = D
                1000 = M 
                """);
        int number;
        Scanner scanner = new Scanner(System.in);
        try {
            number = scanner.nextInt();
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int c = scanner.nextInt();
//            int d = scanner.nextInt();
//            int e = scanner.nextInt();
//            int f= scanner.nextInt();
//            int r = scanner.nextInt();
//            Number(a,b,c,d,e,f,r);
            if (number == 1){
                System.out.print(" = I");
            } else if (number == 5) {
                System.out.print(" = V");
            } else if (number == 10) {
                System.out.print(" = X");
            } else if (number == 50) {
                System.out.print(" = L");
            } else if (number == 100) {
                System.out.print(" = C");
            } else if (number == 500) {
                System.out.print(" = D");
            } else if (number == 1000) {
                System.out.print(" = M");
            }else {
                System.out.print(number);
            }
        }catch (Exception ex){
            System.out.println("Можно ввести только из списка");
        }

//        int a = 0;
//        int b = 0;
//        int c = 0;
//        int d = 0;
//        int e = 0;
//        int f = 0;
//        int r = 0;




    }

}