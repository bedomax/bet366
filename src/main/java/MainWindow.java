import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener{
    private Container c;
    private JLabel title;
    private JLabel lbetter;
    private JTextField fbetter;
    private JLabel tmatch;
    private JRadioButton[] win_matches;
    private JRadioButton[] draw_matches;
    private JRadioButton[] lose_matches;
    private JButton submit;
    private JButton rest;
    private JButton result;
    private String[] games =
            {
                    "Colo colo vs U.Catolica",
                    "River vs U.Chile",
                    "Boca vs Peñarol",
                    "Fluminense vs Independiente"
            };

    public MainWindow(){
        int location_y = 50;
        int space_y =50;

        setSize(600,600);
        setTitle("Bet366 - Online betting");

        c = getContentPane();
        c.setLayout(null);

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
        JLabel[] lmatches = new JLabel[games.length];
        win_matches = new JRadioButton[games.length];
        ButtonGroup buttonGroup;
        buttonGroup = new ButtonGroup();

        for(int i=0;i<games.length;i++){
            int location_x = 230;
            int space_x =90;
            lmatches[i] = new JLabel(games[i]);
            lmatches[i].setFont(new Font("Verdana", Font.PLAIN, 14));
            lmatches[i].setSize(250, 20);
            lmatches[i].setLocation(10, location_y);
            c.add(lmatches[i]);

            win_matches = new JRadioButton[games.length];
            win_matches[i] = new JRadioButton("Gano");
            win_matches[i].setSize(75, 20);
            win_matches[i].setLocation(location_x, location_y);
            c.add(win_matches[i]);
            buttonGroup.add(win_matches[i]);

            location_x = location_x +space_x;
            draw_matches = new JRadioButton[games.length];
            draw_matches[i] = new JRadioButton("Empate");
            draw_matches[i].setSize(75, 20);
            draw_matches[i].setLocation(location_x, location_y);
            c.add(draw_matches[i]);
            buttonGroup.add(draw_matches[i]);

            location_x = location_x +space_x;
            lose_matches = new JRadioButton[games.length];
            lose_matches[i] = new JRadioButton("Perder");
            lose_matches[i].setSize(75, 20);
            lose_matches[i].setLocation(location_x, location_y);
            c.add(lose_matches[i]);
            buttonGroup.add(lose_matches[i]);
            location_y = location_y + space_y;
        }
        /* Games */

        location_y = location_y + space_y;

        submit = new JButton("Guardar");
        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setSize(100, 20);
        submit.setLocation(10, location_y);
//        submit.addActionListener(this);
        c.add(submit);

        result = new JButton("Ver Resultados");
        result.setFont(new Font("Arial", Font.PLAIN, 15));
        result.setSize(100, 20);
        result.setLocation(450, location_y);
//        submit.addActionListener(this);
        c.add(result);
    }

    public void actionPerformed(ActionEvent e){

    }

}