package elements;

import java.awt.*;

public class Text {

    private String string;
    private int x,y;

    public Color c;

    public Text(String string, int x, int y, Color c) {
        this.string = string;
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void setC8(Color c) {
        this.c = c;
    }

    public void drawText(Graphics2D g) {
        g.setColor(c);
        g.setFont(new Font("Times", Font.PLAIN,50));
        g.drawString(string, x, y);
    }
}
