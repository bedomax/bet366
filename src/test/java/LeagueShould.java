
import org.junit.Before;
import org.junit.Test;
import poo.League;
import poo.Type;
import poo.Team;

import static org.junit.Assert.assertEquals;

public class LeagueShould {
    static Type type_1, type_2;
    static League league_nacional, league_internacional;
    static Team team_1, team_2, team_3, team_4, team_5;
    @Before
    public void before(){
        type_1 = new Type("Liga Nacional");
        type_2 = new Type("Liga Internacional");
        league_nacional = new League(type_1);
        league_internacional = new League(type_2);
        team_1 = new Team("Colo-Colo", "Santiago");
        team_2 = new Team("U.Chile", "Santiago");
        team_3 = new Team("River", "Argentina");
        team_4 = new Team("Boca", "Argentina");
        team_5 = new Team("Fluminense", "Brasil");
        league_nacional.addTeam(team_1);
        league_nacional.addTeam(team_2);
        league_internacional.addTeam(team_3);
        league_internacional.addTeam(team_4);
        league_internacional.addTeam(team_5);
    }
    @Test
    public void LeagueNacionalIsPassed(){
        assertEquals(2, league_nacional.getTeams().size());
    }
    @Test
    public void LeagueInternacionalIsPassed(){
        assertEquals(3, league_internacional.getTeams().size());
    }
}
