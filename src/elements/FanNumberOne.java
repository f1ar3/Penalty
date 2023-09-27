package elements;

import java.awt.*;

public class FanNumberOne implements Fan{
    public static class Factory implements FanFactory {

        @Override
        public Fan createFan() {
            return new FanNumberOne();
        }
    }
    public static final Factory FACTORY_INSTANCE = new Factory();

    @Override
    public void drawFan(Graphics2D g, int x, int y) {
        //Рисование туловища
        g.setColor(new Color(0xFCFCD5));
        g.fillOval(x + 10,y - 35, 30,30);
        g.setStroke(new BasicStroke(4));
        g.drawLine(x + 25, y - 5, x + 25, y + 20);
        g.drawLine(x + 21, y - 2, x, y - 15);
        g.drawLine(x + 29, y - 2, x + 50, y - 15);
        g.drawLine(x + 24, y + 22, x + 15, y + 40);
        g.drawLine(x + 26, y + 22, x + 35, y + 40);

        //Глаза и улыбка
        g.setColor(Color.WHITE);
        g.fillOval(x + 17, y - 27, 5,5);
        g.fillOval(x + 27, y - 27, 5,5);
        g.setColor(Color.BLACK);
        g.fillOval(x + 18, y - 26, 3, 3);
        g.fillOval(x + 28, y - 26, 3, 3);
        g.setStroke(new BasicStroke(1));
        g.drawArc(x + 17, y - 17, 15, 5, 210,120);

        //Форма
        g.setColor(new Color(0x8A2BE2));
        g.drawArc(x + 23, y - 7, 5,5,210,110);
        g.fillRect(x + 21, y - 2 , 8, 25);
        g.setStroke(new BasicStroke(5));
        g.drawLine(x + 21, y-2, x + 15, y - 5);
        g.drawLine(x + 29, y - 2, x + 35, y - 5);
        g.drawLine(x + 24, y + 22, x + 20, y + 30);
        g.drawLine(x + 26, y + 22, x + 30, y + 30);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(1));
        g.drawLine(x + 21, y + 20, x + 29, y + 20);

        g.fillOval(x + 9, y + 38, 10, 4);
        g.fillOval(x + 32, y + 38, 10,4);

    }
}