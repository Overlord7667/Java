public class SwordBacaleyaFactory implements BacaleyFactory{
    @Override
    public Bacaleya createBacaleya() {
        return new Sword();
    }
}
