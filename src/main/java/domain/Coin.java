package domain;

public class Coin {
    private static final int Add_more_coins = 10;
    private int coin;
    private static Coin instance = new Coin();

    private Coin() {

    }

    public static Coin getInstance() {
        return instance;


    }

    public int getCoin() {
        return coin;
    }

    public void Addmorecoins() {
        coin += Add_more_coins;

    }

    public void deduction() {
        coin--;
    }

    public static class Singleton {
        private static final Singleton INSTANCE = new Singleton();

        private Singleton() {

        }

        public static Singleton getInstance() {
            return INSTANCE;

        }

    }

}
