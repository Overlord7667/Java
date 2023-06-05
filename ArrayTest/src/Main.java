import java.util.Arrays;
import java.util.Random;

//[0,1,0,3,5,6,0,12,0,1]
//[1,2,3] -> [1,3,2],[2,1,3],[3,1,2]


public class Main {
    public static void main(String[] args) {
//        int[] arr = {0,1,0,3,5,6,0,12,0,1};
//        System.out.println(Arrays.toString(arr));
//
//        swap(arr);
//        System.out.println(Arrays.toString(arr));
        int[] arr = {1,2,3};

//        int[] arr1 = {1,2,3};
//        int[] arr2 = {1,2,3};
//        int[] arr3 = {1,2,3};
//        int[] arr4 = {1,2,3};
        Random rnd = new Random();
        for (int i = arr.length -1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int swap = arr[index];
            arr[index]=arr[i];
            arr[i]=swap;

        }
//        for (int i = arr1.length -1; i > 0; i--) {
//            int index = rnd.nextInt(i + 1);
//            int swap = arr1[index];
//            arr1[index]=arr1[i];
//            arr1[i]=swap;
//        }for (int i = arr2.length -1; i > 0; i--) {
//            int index = rnd.nextInt(i + 1);
//            int swap = arr2[index];
//            arr2[index]=arr[i];
//            arr2[i]=swap;
//        }for (int i = arr3.length -1; i > 0; i--) {
//            int index = rnd.nextInt(i + 1);
//            int swap = arr3[index];
//            arr3[index]=arr[i];
//            arr3[i]=swap;
//        }for (int i = arr4.length -1; i > 0; i--) {
//            int index = rnd.nextInt(i + 1);
//            int swap = arr4[index];
//            arr4[index]=arr[i];
//            arr4[i]=swap;
//        }
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr4));

//        num(arr);
//        System.out.println(Arrays.toString(arr));
    }

    //Функция перемещения фсех нулей массива в конец
//    public static void swap(int[] arr) {
//
//        //сохраняет индекс доступной позиции
//        int key = 0;
//
//        //если текущий элемент отличный от 0, переместить в свободную позицию
//        for (int i: arr) {
//            if(i != 0){
//                arr[key++] = i;
//            }
//        }
//
//        //перемещение 0 в конец массива
//        for (int i = key; i < arr.length; i++) {
//            arr[i] = 0;
//        }
//    }

//    public static void num(int[] arr){
//        Random rnd = new Random();
//        for (int i = arr.length -1; i < 0; i--) {
//            int index = rnd.nextInt(i + 1);
//            int swap = arr[index];
//            arr[index]=arr[i];
//            arr[i]=swap;
//        }
//    }
}