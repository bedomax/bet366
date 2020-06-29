package poo;

public class Bettor extends Person{
    private Person person;
    private float wallet;
    public Bettor(String name, String nickname) {
        super(name,nickname );
        this.wallet = 0;
    }
    public void setWallet(float wallet) {
        this.wallet = wallet;
    }
    public float getWallet() {
        return wallet;
    }
}
