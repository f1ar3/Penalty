import elements.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {
    Sky sky;
    FootballField footballField;
    Gates gates;
    Ball ball;
    Goalkeeper goalkeeper;
    Text goal;
    Text abibas;
    Text niki;
    Text winner;
    Advertising advertising;
    Stands stands;
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStartForBallX = 365;
    private int ticksFromStartForBallY = 500;
    private int ticksFromStartForGoalkeeper = 360;
    private  int ticksFromStartForAbibas = 0;
    private int ticksFromStartForNiki = -150;
    private int ticksFromStartForGoal = -350;
    private int ticksFromStartForWinner = -1050;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        sky = new Sky(0,0);
        advertising = new Advertising(0,380);
        footballField = new FootballField(0, 450);
        stands = new Stands(0,0);
        gates = new Gates(100,150, Color.WHITE);
        ball = new Ball(ticksFromStartForBallX, ticksFromStartForBallY);
        goalkeeper = new Goalkeeper(ticksFromStartForGoalkeeper, 250);
        goal = new Text("GOAL", ticksFromStartForAbibas,430, Color.white);
        abibas = new Text("ABIBAS", ticksFromStartForAbibas, 430, Color.white);
        niki= new Text("NIKI", ticksFromStartForNiki, 430, Color.WHITE);
        goal = new Text("GOAL!", ticksFromStartForGoal, 430, Color.WHITE);
        winner = new Text("The winner is PURPLE TEAM", ticksFromStartForWinner, 430, Color.WHITE);
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);

        Graphics2D g = (Graphics2D) gr;

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        sky.drawSky(g);
        advertising.drawAdv(g);
        footballField.drawFootballField(g);
        abibas.drawText(g);
        abibas.setX(ticksFromStartForAbibas);
        niki.drawText(g);
        niki.setX(ticksFromStartForNiki);
        goal.drawText(g);
        goal.setX(ticksFromStartForGoal);
        winner.drawText(g);
        winner.setX(ticksFromStartForWinner);
        stands.drawStands(g);
        gates.drawGates(g);
        goalkeeper.drawGoalkeeper(g);
        goalkeeper.setX(ticksFromStartForGoalkeeper);
        ball.setY(ticksFromStartForBallY);
        ball.setX(ticksFromStartForBallX);
        ball.drawBall(g);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
//            if (ticksFromStartForAbibas < 900 ) {
//                ticksFromStartForAbibas +=5;
//            } else {
//                ticksFromStartForAbibas = -150;
//                abibas.setX(ticksFromStartForAbibas);
//            }
            ticksFromStartForAbibas += 5;
            ticksFromStartForNiki += 5;
            ticksFromStartForGoal += 5;
            if (ticksFromStartForWinner < 50) {
                ticksFromStartForWinner += 5;
            } else {
                ticksFromStartForWinner += 0;
            }
            if (ticksFromStartForBallX < 690 && ticksFromStartForBallY > 270 && ticksFromStartForGoalkeeper > 250) {
                ticksFromStartForBallX += 5;
                ticksFromStartForBallY -= 5;
                ticksFromStartForGoalkeeper -= 2;
            }

        }
    }
}

