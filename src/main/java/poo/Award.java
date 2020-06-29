package poo;

import poo.Type;

public class Award extends  Type{
    private float prize;
    private boolean draw;
    private boolean win;

    public Award(String nameType, float prize, boolean draw, boolean win) {
        super(nameType);
        this.prize = prize;
        this.draw = draw;
        this.win = win;
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
