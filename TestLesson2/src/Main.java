public class Main {


    public static void main(String[] args) {
        Phone phone = new Phone("+329886460", "nokia_1100", "154");
        String[]arr = new String[]{"1234","34534","3423"};
        phone.sendMessage(arr,"Hello ");
        phone.ReceiveCall("Elizabeth");
    }
}