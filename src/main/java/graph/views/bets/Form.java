package graph.views.bets;

import graph.AppController;
import poo.Constants;
import poo.League;
import poo.Match;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Form extends JFrame implements ActionListener{
    private JLabel title,lbetter ,tmatch, lregister;
    private JTextField fbetter;
    private JTextArea tregister;
    private JButton submit,result;
    private JRadioButton[] win_matches;
    private JRadioButton[] draw_matches;
    private JRadioButton[] lose_matches;
    private AppController app;
    private League league_internacional;
    private ArrayList<Match> matches ;

    public Form(AppController app, League league_nacional, League league_internacional){
        this.app = app;
        this.matches = new ArrayList<Match>();
        this.matches.addAll(league_nacional.getMatchs());
        this.matches.addAll(league_internacional.getMatchs());
        this.removeAll();
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
        lbetter = new JLabel("Nombre:");
        lbetter.setFont(new Font("Verdana", Font.PLAIN, 15));
        lbetter.setSize(100, 20);
        lbetter.setLocation(10, location_y);
        c.add(lbetter);
        /* Titulo */

        /* Textfield */
        fbetter = new JTextField();
        fbetter.setFont(new Font("Verdana", Font.PLAIN, 15));
        fbetter.setSize(190, 20);
        fbetter.setLocation(100, location_y);
        c.add(fbetter);
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
        win_matches = new JRadioButton[this.matches.size()];
        draw_matches = new JRadioButton[this.matches.size()];
        lose_matches = new JRadioButton[this.matches.size()];
        ButtonGroup buttonGroup;
        buttonGroup = new ButtonGroup();

        for(int i=0;i<this.matches.size();i++){
            int location_x = 230;
            int space_x =90;
            String labelMatch = this.matches.get(i).getDatetime()+" "+
                                this.matches.get(i).getLocal().getName()+" vs "+
                                this.matches.get(i).getVisitor().getName();
            lmatches[i] = new JLabel(labelMatch);
            lmatches[i].setFont(new Font("Verdana", Font.PLAIN, 14));
            lmatches[i].setSize(450, 20);
            lmatches[i].setLocation(10, location_y);
            c.add(lmatches[i]);

            win_matches[i] = new JRadioButton("Gano");
            win_matches[i].setSize(75, 20);
            win_matches[i].setLocation(location_x, location_y);
            c.add(win_matches[i]);
            buttonGroup.add(win_matches[i]);

            location_x = location_x +space_x;
            draw_matches[i] = new JRadioButton("Empate");
            draw_matches[i].setSize(75, 20);
            draw_matches[i].setLocation(location_x, location_y);
            c.add(draw_matches[i]);
            buttonGroup.add(draw_matches[i]);

            location_x = location_x +space_x;
            lose_matches[i] = new JRadioButton("Perder");
            lose_matches[i].setSize(75, 20);
            lose_matches[i].setLocation(location_x, location_y);
            c.add(lose_matches[i]);
            buttonGroup.add(lose_matches[i]);
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
            app.route(Constants.BET_FORM);
        }
    }
}
