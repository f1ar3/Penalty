package elements;

import java.awt.*;
import java.util.logging.XMLFormatter;

public class Gates {

    private int x, y;
    private Color c;

    public Gates(int x, int y, Color c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public void drawGates(Graphics2D g){
        g.setColor(this.c);
        g.fillRect(x,y,20,300);
        g.fillRect(x,y,20 * 29,300 / 15);
        g.fillRect(x + 560, y, 20, 300);
        g.setStroke(new BasicStroke(1));

        for (int i = 170; i < 430; i += 20) {
            g.drawLine(x + 20,i+20, x + 560, i+20);
        }

        for (int i = 120; i < 680 ; i += 30) {
            g.drawLine(i, y + 20, i, y + 300);
        }
    }
}
