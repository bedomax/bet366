package graph;

import graph.views.bets.Form;
import poo.League;
import poo.Match;
import poo.Team;
import poo.Type;

import java.awt.*;

public class BetController {
    private Container matchContainer;
    private  AppController app;

    static Type type_1, type_2;
    static League league_nacional, league_internacional;
    static Team team_1, team_2, team_3, team_4, team_5;
    static Match match_1,match_2, match_3, match_4;

    public BetController(AppController app){
        this.app = app;
    }
    public void index(){
        this.loadConfiguration();
        matchContainer = this.app.getContentPane();
        matchContainer.setLayout(null);
        Form betForm = new Form(this.app,league_nacional, league_internacional);
        matchContainer.setVisible(true);
        betForm.render(matchContainer);
    }
    private void loadConfiguration(){
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

        match_1 = new Match(league_nacional,"15/Jun/2020",  team_1, team_2);
        league_nacional.addMatch(match_1);
        match_2 = new Match(league_internacional,"17/Jun/2020",  team_2, team_3);
        league_internacional.addMatch(match_2);
        match_3 = new Match(league_internacional,"16/Jun/2020",  team_4, team_5);
        league_internacional.addMatch(match_3);
        match_4 = new Match(league_internacional,"25/Jun/2020",  team_1, team_3);
        league_internacional.addMatch(match_4);

    }
}
