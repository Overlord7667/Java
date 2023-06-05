public class ShieldBacaleyaFactory implements BacaleyFactory{
    @Override
    public Bacaleya createBacaleya() {
        return new Shield();
    }
}
