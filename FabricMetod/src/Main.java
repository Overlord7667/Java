public class Main {
    public static void main(String[] args) {
        BacaleyFactory bacaleyFactory = createBacaleyaByItems("4");
        Bacaleya bacaleya = bacaleyFactory.createBacaleya();

        bacaleya.soldItem();
    }
    static BacaleyFactory createBacaleyaByItems(String items){
        if (items.equalsIgnoreCase("1")){
            return new ArmorBacaleyaFactory();
        } else if (items.equalsIgnoreCase("2")) {
            return new ShieldBacaleyaFactory();
        } else if (items.equalsIgnoreCase("3")) {
            return new SwordBacaleyaFactory();
        }else {
            throw new RuntimeException(items + " is not items.");
        }
    }
}