package lab8;

public class ThreadSafeInitialization {
    private static ThreadSafeInitialization instance = null;
    private int coin;

    private ThreadSafeInitialization() {  }


    public static ThreadSafeInitialization getInstance() {
        synchronized (ThreadSafeInitialization.class) {
            if (instance == null) {
                instance = new ThreadSafeInitialization();
            }
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
