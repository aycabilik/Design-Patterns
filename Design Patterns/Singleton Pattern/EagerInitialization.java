package lab8;

public class EagerInitialization {
    private static EagerInitialization instance = new EagerInitialization();
    private int coin;

    private EagerInitialization() {  }


    public static EagerInitialization getInstance() {
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
