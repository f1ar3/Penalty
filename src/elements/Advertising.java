package elements;

import java.awt.*;

public class Advertising {

    private int x,y;

    public Advertising(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawAdv (Graphics2D g) {
        g.setColor(new Color(0xB0C3FC));
        g.fillRect(this.x,this.y,800,70);

    }
}
