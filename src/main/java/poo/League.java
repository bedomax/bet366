package poo;

import java.util.ArrayList;

public class League {
    private Type type;
    private ArrayList<Team> teams;
    private ArrayList<Match> matchs;

    public League(League league) {
        this.type = league.type;
        this.teams = league.teams;
        this.matchs = league.matchs;
    }
    public League(Type type) {
        this.type = type;
        this.teams = new ArrayList<Team>();
        this.matchs = new ArrayList<Match>();
    }

    public void addTeam(Team team){
        this.teams.add(team);
    }

    public void addMatch(Match match){
        this.matchs.add(match);
    }

    public Type getType() {
        return type;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public ArrayList<Match> getMatchs() {
        return matchs;
    }
}
