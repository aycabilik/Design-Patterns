package lab8;

public class LazyInitialization {
    private static LazyInitialization instance = null;
    private int coin;

    private LazyInitialization() {  }


    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }

    public void addCoin(String coinName){
        coin= coin+10;
        System.out.println(coinName + ".getCoinCount() = " + coin);
    }

    public void decreaseCoin(String coinName){
        coin= coin-1;
        System.out.println(coinName + ".getCoinCount() = " + coin);
    }
}
