package elements;

import java.awt.*;

public class Sky {

    private int x,y;

    public Sky(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawSky(Graphics2D g) {
        g.setColor(new Color(0x9CCCEF));
        g.fillRect(x, y,800,100);
    }
}
