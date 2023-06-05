public class ArmorBacaleyaFactory implements BacaleyFactory{
    @Override
    public Bacaleya createBacaleya() {
        return new Armor();
    }
}
