//Создать 7 разных ошибок ( Exception )
//Cоздать свою ошибку (ArrayException , StringException)


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
//    public static int[] arr = new int[]{10,0,2,50};

//    public static int getByIndex(int index){
//        if (index>=0 && index < arr.length)
//        return arr[index];
//        return -1;
//    }

//    public static int delenie(int value, int index)throws ArithmeticException, ArrayIndexOutOfBoundsException{
//        if (index < 0 || index>= arr.length)
//            throw  new  IndexOutOfBoundsException("Вы вышли за пределы массива");
//
//        return value/arr[index];
//    }

//    public static void View() throws Exception {
////        String text1 = "Hello World!";
//        String text2 = "World Hello!";
//        String text1 = "World Hello!";
//        if (text1 != text2){
//            throw new Exception("Ошибка совпадения!");
//        }else {
//            System.out.println("Текст совпал.");
//        }
//    }

   public static void Sum(int a, int b) throws Exception, InputMismatchException {
       if (b<=0){
           throw new Exception("Значение может быть только больше нуля");
       }else {
           System.out.println(a+b);
       }
   }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько хотите перевести");
        int a = 0;
        System.out.println("Enter a = " + a);
        System.out.print("Enter b = ");
        int b = scanner.nextInt();
        Sum(a,b);

//        View();


//        int a = 10;
//        int b =100;
//        try {
//            int result = delenie(a,b);
//            System.out.println("Result = " + result);
//        }catch (ArithmeticException exception){
//            System.out.println("Деление на 0 запрещено");
//            exception.printStackTrace();
//        }catch (ArrayIndexOutOfBoundsException exception){
//            exception.printStackTrace();
//        }catch (Exception exception){
//            System.out.println("Error");
//            exception.printStackTrace();
//        }
//        System.out.println(getByIndex(100));
//        System.out.println("Hello World");
    }
}