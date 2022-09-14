package lab8;

public class Main {
    public static void main(String[] args) {

        EagerInitialization coin1 = EagerInitialization.getInstance();
        EagerInitialization coin2 = EagerInitialization.getInstance();
        LazyInitialization coin1L = LazyInitialization.getInstance();
        LazyInitialization coin2L = LazyInitialization.getInstance();
        ThreadSafeInitialization coin1T = ThreadSafeInitialization.getInstance();
        ThreadSafeInitialization coin2T = ThreadSafeInitialization.getInstance();

        System.out.println("Singleton - Eager Initialization");
        coin1.addCoin("coin1");
        coin2.decreaseCoin("coin2");
        System.out.println(coin1);
        System.out.println(coin2 +"\n");

        System.out.println("Singleton - Lazy Initialization");
        coin1L.addCoin("coin1");
        coin2L.decreaseCoin("coin2");
        System.out.println(coin1L);
        System.out.println(coin2L+"\n");

        System.out.println("Singleton - Thread Safe Initialization");
        coin1T.addCoin("coin1");
        coin2T.decreaseCoin("coin2");
        System.out.println(coin1T);
        System.out.println(coin2T+"\n");

    }
}
