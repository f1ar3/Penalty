package elements;

import java.awt.*;

public class FootballField {

    private int x, y;

    public FootballField(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawFootballField(Graphics2D g) {
        Color c = new Color(0x1CA81C);
        g.setColor(c);
        g.fillRect(x, y, 800, 150);

        g.setColor(Color.WHITE);
        g.fillRect(50,450,15,30);
        g.fillRect(50,450+30, 680, 15);
        g.fillRect(715,450,15,30);
        g.fillOval(375,535, 30,20);
    }
}
