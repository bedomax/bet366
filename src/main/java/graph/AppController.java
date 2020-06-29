package graph;

import poo.Constants;

import javax.swing.*;

public class AppController extends JFrame{
    private BetController matchController;
    private String action = Constants.BET_FORM;
    public AppController(){
        setSize(1200,600);
        setTitle(Constants.TITLE);
        this.route(action);
    }
    public void route(String actionEvent){
        switch (actionEvent){
            case Constants.BET_FORM:
                matchController = new BetController(this);
                matchController.index();
                break;
        }
    }
}