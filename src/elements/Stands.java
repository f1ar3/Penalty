package elements;

import java.awt.*;
import java.util.Random;

public class Stands {

    private int x, y;
    private Seat[] seats = new Seat[27];
    private int[] random = {0, 1, 2};
    private int[] fanTypes = new int[seats.length];
    FanNumberOne fanNumberOne;
    FanNumberTwo fanNumberTwo;

    private int x1 = 12;
    private int y1 = 100;

    private static final FanFactory[] factories = new FanFactory[]{
            FanNumberOne.FACTORY_INSTANCE,
            FanNumberTwo.FACTORY_INSTANCE,
            new FanFactory() {
                @Override
                public Fan createFan() {
                    return null;
                }
            }
    };

    public Stands(int x, int y) {
        this.x = x;
        this.y = y;

        for (int i = 0; i < seats.length; i++) {
            Fan f = factories[getRandom(random)].createFan();
            seats[i] = new Seat(x1, y1, f);

            fanTypes[i] = getRandom(random);

            if (i == seats.length / 9 || i == seats.length / 3 + 2) {
                x1 += 185;
            }
            if (i > seats.length / 2 + 2) {
                x1 += 71;
                continue;
            }
            if (i == seats.length / 4 + 1) {
                x1 = 10;
                y1 = 211;
                continue;
            }
            if (i == seats.length / 2 + 2) {
                x1 = 12;
                y1 = 306;
                continue;
            }

            x1 += 75;
        }
    }

    public void drawStands(Graphics2D g) {
        g.setColor(new Color(0xDED1D8));
        g.fillRect(0, 100, 800, 265);

        g.fillRect(0, 365, 800, 15);

        g.setColor(new Color(0x9EBCF3));
        // g.fillRect(302,100, 178, 32);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(5));
        g.drawLine(0, 365, 800, 365);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(1));

        for (int i = 306; i < 360; i += 15) {
            g.drawLine(x, i, 800, i);
        }

        g.setColor(new Color(0x7C7C83));
        for (int i = 1; i < 800; i += 70) {
            g.fillRect(i, 369, 10, 10);
        }

        //Первый уровень
        g.setColor(Color.BLACK);
        for (int i = 211; i < 260; i += 15) {
            g.drawLine(x, i, 300, i);
        }

        for (int i = 211; i < 260; i += 15) {
            g.drawLine(480, i, 800, i);
        }

        //Второй уровень
        for (int i = 100; i < 160; i += 15) {
            g.drawLine(x, i, 300, i);
        }

        for (int i = 100; i < 160; i += 15) {
            g.drawLine(480, i, 800, i);
        }

        for (int i = 131; i < 300; i += 50) {
            g.drawLine(300, i, 480, i);
        }

        g.setStroke(new BasicStroke(2));
        g.drawLine(302, 100, 302, 306);
        g.drawLine(478, 100, 478, 306);

        g.setStroke(new BasicStroke(3));
        g.drawLine(1, 100, 1, 365);
        g.setStroke(new BasicStroke(3));
        g.drawLine(782, 100, 782, 365);

        for (Seat seat : seats) {
            seat.drawSeat(g);
            Fan fan = seat.getFan();
            if (fan != null) {
                fan.drawFan(g, seat.getX(), seat.getY());
            }
        }
    }
    
    public int getRandom(int[] array) {
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(array.length);
        return array[randomIndex];
    }
}
