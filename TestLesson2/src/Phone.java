public class Phone {
    private String number;
    private String model;
    private String weight;
    //private String receiveCall;


    public Phone(String number, String model, String weight){
        this(number,model);
        this.weight = weight;
        //this.receiveCall = name;
    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void ReceiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    public void ReceiveCall(String name, String number) {
        System.out.println("Звонит " + name + " по номеру " + number);
    }
    public void sendMessage(String[]arr, String message){
        System.out.println(message + "было отправлено");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " отправлено.");
        }
    }
}
