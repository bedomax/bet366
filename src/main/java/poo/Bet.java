package poo;

public class Bet{
    private Bettor bettor;
    private String datetime;
    private Match match;
    private Integer localScore;
    private Integer visitorScore;
    private Award award;
    private Boolean win, draw, lose;

    public Bet(Bettor bettor, String datetime, Match match, Boolean win, Boolean draw, Boolean lose) {
        this.bettor = bettor;
        this.datetime = datetime;
        this.match = match;
        this.award = award;
        this.win = win;
        this.draw = draw;
        this.lose = lose;
    }

    public String getDatetime() {
        return datetime;
    }

    public Bettor getBettor() {
        return bettor;
    }

    public Match getMatch() {
        return match;
    }

    public Integer getLocalScore() {
        return localScore;
    }

    public Integer getVisitorScore() {
        return visitorScore;
    }

    public Award getAward() {
        return award;
    }

    public Boolean getWin() {
        return win;
    }

    public Boolean getDraw() {
        return draw;
    }
    public Boolean getLose() {
        return lose;
    }
}
