public class Person {
    private String name;
    private String nickname;
    private Float wallet;

    public Person(String name, String nickname, Float wallet) {
        this.name = name;
        this.nickname = nickname;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public Float getWallet() {
        return wallet;
    }
}
