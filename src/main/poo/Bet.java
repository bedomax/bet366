public class Bet {
    private String datetime;
    private Match match;
    private Integer localScore;
    private Integer visitorScore;
    private Award award;
    private Boolean win;

    public Bet(String datetime, Match match, Integer localScore, Integer visitorScore, Award award, Boolean win) {
        this.datetime = datetime;
        this.match = match;
        this.localScore = localScore;
        this.visitorScore = visitorScore;
        this.award = award;
        this.win = win;
    }

    public String getDatetime() {
        return datetime;
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
}
