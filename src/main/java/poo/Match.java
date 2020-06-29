package poo;

import poo.League;
import poo.Team;

public class Match extends  League{
    private String datetime;
    private League league;
    private Team local;
    private Team visitor;
    private Integer localScore;
    private Integer visitorScore;

    public Match(League league, String datetime, Team local, Team visitor) {
        super(league);
        this.datetime = datetime;
        this.local = local;
        this.visitor = visitor;
        this.localScore = 0;
        this.visitorScore = 0;
    }

    public void addScore(Integer localScore, Integer visitorScore){
        this.localScore = localScore;
        this.visitorScore = visitorScore;
    }

    public String getDatetime() {
        return datetime;
    }

    public League getLeague() {
        return league;
    }

    public Team getLocal() {
        return local;
    }

    public Team getVisitor() {
        return visitor;
    }

    public Integer getLocalScore() {
        return localScore;
    }

    public Integer getVisitorScore() {
        return visitorScore;
    }

    public String getResult(){
        if(this.localScore > this.visitorScore){
            return Constants.LOCAL;
        }
        if(this.visitorScore > this.localScore){
            return Constants.VISITOR;
        }
        return Constants.DRAW;
    }
}
