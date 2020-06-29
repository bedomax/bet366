package graph.views.bets;

import graph.AppController;
import poo.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class Form extends JFrame implements ActionListener{
    private JLabel title,lbettor, lnickname ,tmatch, lregister;
    private JTextField fbettor, fnickname;
    private JTextArea tregister;
    private JButton submit,result;
    private JRadioButton[] win_matches;
    private JRadioButton[] draw_matches;
    private JRadioButton[] lose_matches;
    private AppController app;
    private League league_internacional;
    private ArrayList<Match> matches ;
    private ArrayList<Bet> bets;
    private ButtonGroup buttonGroup[];
    public Form(AppController app, League league_nacional, League league_internacional){
        this.app = app;
        this.matches = new ArrayList<Match>();
        this.matches.addAll(league_nacional.getMatchs());
        this.matches.addAll(league_internacional.getMatchs());
        this.bets = new ArrayList<Bet>();
        win_matches = new JRadioButton[this.matches.size()];
        draw_matches = new JRadioButton[this.matches.size()];
        lose_matches = new JRadioButton[this.matches.size()];
        buttonGroup = new ButtonGroup[this.matches.size()];
    }
    public Container render( Container c){
        int location_y = 50;
        int space_y =50;

        /* Titulo */
        title = new JLabel("Bet366 - Realizar apuesta");
        title.setFont(new Font("Verdana", Font.PLAIN, 20));
        title.setSize(300, 30);
        title.setLocation(10, 30);
        c.add(title);
        /* Titulo */

        location_y = location_y + space_y;

        /* Titulo */
        lbettor = new JLabel("Nombre:");
        lbettor.setFont(new Font("Verdana", Font.PLAIN, 15));
        lbettor.setSize(100, 20);
        lbettor.setLocation(10, location_y);
        c.add(lbettor);
        /* Titulo */



        /* Textfield */
        fbettor = new JTextField();
        fbettor.setFont(new Font("Verdana", Font.PLAIN, 15));
        fbettor.setSize(190, 20);
        fbettor.setLocation(100, location_y);
        c.add(fbettor);
        /* Textfield */

        /* Titulo */
        lbettor = new JLabel("Nickname:");
        lbettor.setFont(new Font("Verdana", Font.PLAIN, 15));
        lbettor.setSize(100, 20);
        lbettor.setLocation(300, location_y);
        c.add(lbettor);
        /* Titulo */

        /* Textfield */
        fnickname = new JTextField();
        fnickname.setFont(new Font("Verdana", Font.PLAIN, 15));
        fnickname.setSize(190, 20);
        fnickname.setLocation(400, location_y);
        c.add(fnickname);
        /* Textfield */

        location_y = location_y + space_y;

        /* Matches */
        tmatch = new JLabel("Juegos para apostar (10/Jun/2020):");
        tmatch.setFont(new Font("Verdana", Font.PLAIN, 15));
        tmatch.setSize(400, 20);
        tmatch.setLocation(10, location_y);
        c.add(tmatch);
        /* Matches */
        location_y = location_y + space_y;


        /* Games */
        JLabel[] lmatches = new JLabel[this.matches.size()];
        for(int i=0;i<this.matches.size();i++){
            int location_x = 330;
            int space_x =90;
            buttonGroup[i] = new ButtonGroup();
            String labelMatch = this.matches.get(i).getDatetime()+" "+
                                this.matches.get(i).getLocal().getName()+" vs "+
                                this.matches.get(i).getVisitor().getName();
            lmatches[i] = new JLabel(labelMatch);
            lmatches[i].setFont(new Font("Verdana", Font.PLAIN, 14));
            lmatches[i].setSize(450, 20);
            lmatches[i].setLocation(10, location_y);
            c.add(lmatches[i]);

            win_matches[i] = new JRadioButton("Gana");
            win_matches[i].setSize(90, 20);
            win_matches[i].setLocation(location_x, location_y);
            c.add(win_matches[i]);
            buttonGroup[i].add(win_matches[i]);

            location_x = location_x +space_x;
            draw_matches[i] = new JRadioButton("Empata");
            draw_matches[i].setSize(90, 20);
            draw_matches[i].setLocation(location_x, location_y);
            c.add(draw_matches[i]);
            buttonGroup[i].add(draw_matches[i]);

            location_x = location_x +space_x;
            lose_matches[i] = new JRadioButton("Pierde");
            lose_matches[i].setSize(90, 20);
            lose_matches[i].setLocation(location_x, location_y);
            c.add(lose_matches[i]);
            buttonGroup[i].add(lose_matches[i]);
            location_y = location_y + space_y;
        }
        /* Games */

        location_y = location_y + space_y;

        submit = new JButton("Guardar y crear nuevo");
        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setSize(200, 20);
        submit.setLocation(350, location_y);
        submit.addActionListener(this);
        c.add(submit);

        location_y = 30;

        result = new JButton("Validar Resultados");
        result.setFont(new Font("Arial", Font.PLAIN, 15));
        result.setSize(140, 20);
        result.setLocation(1000, location_y);
        result.addActionListener(this);
        c.add(result);

        /* Titulo */
        lregister = new JLabel("Registros:");
        lregister.setFont(new Font("Verdana", Font.PLAIN, 15));
        lregister.setSize(100, 20);
        lregister.setLocation(700, location_y);
        c.add(lregister);
        /* Titulo */

        location_y = location_y + space_y;

        tregister = new JTextArea();
        tregister.setFont(new Font("Verdana", Font.PLAIN, 12));
        tregister.setSize(400, 400);
        tregister.setEditable(false);
        tregister.setLocation(700, location_y);
        tregister.setLineWrap(true);
        c.add(tregister);

        return c;
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit){
            Bettor bettor = new Bettor(fbettor.getText(), fnickname.getText());
            for(int i=0;i<this.matches.size();i++){
                boolean win = false, draw = false, lose = false;
                if(this.win_matches[i].isSelected()){
                    win = true;
                }
                if(this.draw_matches[i].isSelected()){
                    draw = true;
                }
                if(this.lose_matches[i].isSelected()){
                    lose = true;
                }
                this.bets.add(new Bet(bettor,
                        this.matches.get(i).getDatetime(),
                        this.matches.get(i),
                        win,
                        draw,
                        lose));
            }
            tregister.setText("Guardo informacion");
            this.printInfo();
            this.reset();
        }
    }
    public void printInfo(){
        String texto;
        Iterator<Bet> itr_bets = this.bets.iterator();
        texto = "";
        while(itr_bets.hasNext()){
            Bet bet = itr_bets.next();
            String betText = "";
            if(bet.getWin()) betText = "GANA";
            if(bet.getDraw()) betText = "EMPATA";
            if(bet.getLose()) betText = "PIERDE";

            texto += "Apuesta:"+
                    bet.getBettor().getNickname() + "\n"+
                    "Partido:" + bet.getMatch().getLocal().getName() +
                    " vs "+bet.getMatch().getVisitor().getName()+ "\n"+
                    betText+":"+bet.getMatch().getLocal().getName();
            texto += "\n\n";
            tregister.setText(texto);
        }
    }
    public void reset(){
        String def = "";
        fbettor.setText(def);
        fnickname.setText(def);
        for(int i=0;i<this.matches.size();i++){
            buttonGroup[i].clearSelection();
        }
    }
}
