import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Lesson #1");
//        System.out.println("1)Summa(a,b)");
//        System.out.println("2)Delenie(a,b)");
//        System.out.println("3)Proizvedenie(a,b)");
//        System.out.println("4)Raznost(a,b)");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число");
//        int b = scanner.nextInt();
//        int c = 0;
//        sum(a,b);
//        delenie(a,b,c);
//        proizvedenie(a,b);
//        raznost(a,b);
//    }
//
//    public static void sum(int a, int b) {
//        System.out.println(a + b);
//    }
//    public static void delenie(int a, int b, int c) {
//        c = a / b;
//        System.out.println(c);
//    }
//    public static void proizvedenie(int a, int b) {
//        System.out.println(a * b);
//    }
//    public static void raznost(int a, int b){
//        System.out.println(a - b );
//    }


        System.out.println("Lesson #2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите третье число");
        int c = scanner.nextInt();
        System.out.println("Введите четвёртое число");
        int d = scanner.nextInt();
        System.out.println("Введите пятое число");
        int e = scanner.nextInt();
        int[]arr=new int[5];
        arr[0]= a;
        arr[1]= b;
        arr[2]= c;
        arr[3]= d;
        arr[4]= e;
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int max = getMax(arr);
        System.out.println("Maximum Value is: "+max);

        int min = getMin(arr);
        System.out.println("Minimum Value is: "+min);

        int average = 0;
        if (arr.length > 0)
        {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            average = sum / arr.length;
            System.out.println("Среднее арифметическое " + average);
        }
    }
    public static int getMax(int[] arr){
        int maxValue = arr[0];
        for(int i=1;i < arr.length;i++){ if(arr[i] > maxValue){
            maxValue = arr[i];
        }
        }
        return maxValue;
    }
    public static int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
}