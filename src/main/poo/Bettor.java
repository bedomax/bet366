public class Bettor {
    private Person person;
    private Integer wallet;
    public Bettor(Person person, Integer wallet) {
        this.person = person;
        this.wallet = wallet;
    }

    public Person getPerson() {
        return person;
    }

    public Integer getWallet() {
        return wallet;
    }
}
