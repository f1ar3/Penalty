package elements;

import java.awt.*;

public class Seat {
    private Fan f;
    private int x, y;

    public Seat(int x, int y, Fan f) {
        this.f = f;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void drawSeat(Graphics2D g) {
        g.setColor(new Color(0x8F1414));
        g.fillRect(x,y - 5,50,30);
        g.fillOval(x,y - 20,50,30);
        g.setColor(new Color(0xB24141));
        g.fillRect(x,y + 25,50,8);
        g.fillOval(x,y + 30 ,50,7);
        g.setColor(Color.WHITE);
        g.fillOval(x + 5,y + 28, 15,2);
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(1));
        g.drawLine(x + 15,y - 10, x + 35, y - 10);
        g.drawLine(x + 15,y - 5,x + 35,y - 5);
        if (f != null) {
            f.drawFan(g, x, y);
        }
    }
    public Fan getFan() {
        return f;
    }
}
