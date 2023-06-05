class ArrayTest {
    int[] arr;
    int index;
    int size;

    {
        this.size = 10;
        this.index = 0;
        arr = new int[this.size];
    }

    public void add(int value) {
        regeneration();
        arr[index] = value;//index= 0;
        index = index + 1;//index = 1
    }

    public int lenght(){
        return this.index;
    }

    public void remove(int index) {
        if (index < this.index && index >= 0) {

            int[] newArr = new int[this.size];

            for (int i = 0, t = 0; i < this.index; i++)
                if (index != i)
                    newArr[t++] = this.arr[i];

            this.index--;
            this.arr = newArr;
        }
    }

    void add(int index,int element){
        regeneration();
        int[] newArr = new int[this.size];

        for (int i = 0,j=0; i < this.index; j++ ) {
            if (j==index){
                newArr[index] = element;
            }else{
                newArr[j] = this.arr[i];
                i++;
            }
        }
        this.index++;
        this.arr = newArr;
    }

    void addStart(int element){
        regeneration();
        int[] newArr = new int[this.size];
        newArr[0] = element;
        for (int i = 0; i < this.index; i++ ) {
            newArr[i+1] = this.arr[i];
        }
        this.index++;
        this.arr = newArr;
    }

    void addEnd(int value){
        regeneration();
        arr[index] = value;//index= 0;
        index = index + 1;//index = 1
    }

    public void regeneration() {
        if (index == size) {
            // this.size = this.size*2;
            this.size++;
            ;
            int[] newArr = new int[this.size];
            for (int i = 0; i < this.arr.length; i++) {
                newArr[i] = this.arr[i];
            }

            this.arr = newArr;
        }
    }

    public void print() {
        for (int i = 0; i < this.index; i++) {
            System.out.println(this.arr[i] + " ");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        //  int[] arr = new int[10];

        // List<Integer> arr = new ArrayList<>();
        ArrayTest arr = new ArrayTest();
        arr.add(1);
        arr.add(4);
        arr.add(6);
        arr.add(2);
        arr.add(3);
        arr.add(8);
//arr.add(0,100);
        arr.addStart(100);
        arr.addEnd(200);

        arr.print();
        // System.out.println(arr);

        //  arr.add(0,8);
         arr.remove(2);
       System.out.println("Lenght :  " + arr.lenght());
//        arr.print();
        // System.out.println(Arrays.toString(arr.toArray()));
        // arr.get(2);
    }
}