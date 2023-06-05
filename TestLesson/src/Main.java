//1) Удалить в массиве все числа, которые повторяются более двух раз.+
//2)Найдите наибольший нечетный элемент.+
//3)Найдите индекс наибольшего элементa.
//4)Найдите сумму отрицательных элементов массива.
//5)Найдите наименьший четный элемент массива. Если такого нет, то выведите первый элемент.
//6)Прописать метод который сортирует массив
//7)Выводит все элементы массива через 1.
//8)Выводит все элементы массива пока не встретится элемент -1
//9)Заменить элeменты в массиве отрицательные на положительные и наоборот
//10)Найти количество

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson #1\n");
        System.out.println("Изначальный массив");
        int[] arr = new int[] {2, 4, 1, 2, 1, 2, 4, 5,23,23,54,56,67,68,56};
        System.out.println(Arrays.toString(arr));

        System.out.println("\nМассив без повторяющихся чисел");
        removeDuplicates(arr);
        System.out.println(Arrays.toString(removeDuplicates(arr)));

        MaxArray(arr);
        System.out.println("\nМаксимальный нечетный элемент в массиве: " + MaxArray(arr));
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] newArr = new int[arr.length];
        int newArrIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j)break;
                if (j == arr.length-1)newArr[newArrIndex++]=arr[i];
            }
        }
        int[] newArr2 = new int[newArrIndex];
        for (int i = 0; i < newArrIndex; i++) {
            newArr2[i] = newArr[i];
        }
        return  newArr2;
    }

    public  static int MaxArray(int[]arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1){
                max = arr[i];
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i] && arr[i] % 2 == 1) max = arr[i];
        }
        return max;
    }
}