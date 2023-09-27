package elements;

import java.awt.*;

public class FanNumberTwo implements Fan {
    public static class Factory implements FanFactory {

        @Override
        public Fan createFan() {
            return new FanNumberTwo();
        }
    }
    public static final Factory FACTORY_INSTANCE = new Factory();

    @Override
    public void drawFan(Graphics2D g, int x, int y) {
        //Рисование туловища
        g.setColor(new Color(0xFCFCD5));
        g.fillOval(x + 10,y - 30, 30,30);
        g.setStroke(new BasicStroke(4));
        g.drawLine(x + 25, y, x + 25, y + 25);
        g.drawLine(x + 21, y + 3, x + 13, y + 15);
        g.drawLine(x + 29, y + 3, x + 37, y + 15);
        g.drawLine(x + 24, y + 27, x + 20, y + 30);
        g.drawLine(x + 26, y + 27, x + 30, y + 30);
        g.drawLine(x + 18, y + 32, x + 16, y + 42);
        g.drawLine(x + 32, y + 32, x + 34, y + 42);

        //Глаза и улыбка
        g.setColor(Color.WHITE);
        g.fillOval(x + 17, y - 22, 5,5);
        g.fillOval(x + 27, y - 22, 5,5);
        g.setColor(Color.BLACK);
        g.fillOval(x + 18, y - 21, 3, 3);
        g.fillOval(x + 28, y - 21, 3, 3);
        g.setStroke(new BasicStroke(1));
        g.drawArc(x + 17, y - 10, 15, 5, 30,120);

        //Форма
        g.setColor(Color.CYAN);
        g.drawArc(x + 23, y - 2, 5,5,210,110);
        g.fillRect(x + 21, y + 3 , 8, 25);
        g.setStroke(new BasicStroke(5));
        g.drawLine(x + 21, y + 3, x + 18, y + 7);
        g.drawLine(x + 29, y + 3, x + 32, y + 7);

        g.drawLine(x + 24, y + 27, x + 20, y + 30);
        g.drawLine(x + 26, y + 27, x + 30, y + 30);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(1));
        g.drawLine(x + 21, y + 24, x + 29, y + 24);

        g.fillOval(x + 9, y + 41, 10, 4);
        g.fillOval(x + 32, y + 41, 10,4);
    }
}
