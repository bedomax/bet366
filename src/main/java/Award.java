public class Award {
    private Type type;
    private float prize;
    private boolean draw;
    private boolean win;

    public Award(Type type, float prize, boolean draw, boolean win) {
        this.type = type;
        this.prize = prize;
        this.draw = draw;
        this.win = win;
    }

    public Type getType() {
        return type;
    }

    public float getPrize() {
        return prize;
    }

    public boolean isDraw() {
        return draw;
    }

    public boolean isWin() {
        return win;
    }
}
