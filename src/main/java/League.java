import java.util.ArrayList;

public class League {
    private Type type;
    private ArrayList<Team> teams;

    public League(Type type, ArrayList<Team> teams) {
        this.type = type;
        this.teams = new ArrayList<Team>();
    }

    public Type getType() {
        return type;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }
}
