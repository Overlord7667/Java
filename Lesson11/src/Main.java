import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-1,-4,5,6,8,10,12,24,54};
        int[] arr2 = {-1,-5,0,3,7,10,38};
        int[] ssr = merger(arr,arr2);

        System.out.println(Arrays.toString(ssr));
    }

    public static int[] merger(int first[],int second[]){
        int[] res = new int[first.length + second.length];
        int c = first.length;
        int d = second.length;
        int i = 0, j =0, k =0;
        while (i < c && j < d){
            if (first[i] <= second[j]){
                res[k] = first[i];
                i++;
            }else {
                res[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < c){
            res[k] = first[i];
            i++;
            k++;
        }
        while (j < d){
            res[k] = second[j];
            j++;
            k++;
        }
        return res;
    }

}