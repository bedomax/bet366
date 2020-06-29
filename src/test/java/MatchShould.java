import org.junit.Before;
import org.junit.Test;
import poo.*;

import static org.junit.Assert.assertEquals;

public class MatchShould {
    static Type type_1, type_2;
    static League league_nacional, league_internacional;
    static Team team_1, team_2, team_3, team_4, team_5;
    static Match match_1;
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
        match_1 = new Match(league_nacional,"15/Jun/2020", team_1, team_2);

    }
    @Test
    public void MatchLocalWinIsPassed(){
        match_1.addScore(2,0);
        assertEquals(Constants.LOCAL,match_1.getResult());
    }
    @Test
    public void MatchLocalDrawIsPassed(){
        match_1.addScore(1,1);
        assertEquals(Constants.DRAW,match_1.getResult());
    }
    @Test
    public void MatchVisitorWinIsPassed(){
        match_1.addScore(0,2);
        assertEquals(Constants.VISITOR,match_1.getResult());
    }
}
