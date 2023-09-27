package elements;

import java.awt.*;

public class Ball {

    private int x, y;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void drawBall(Graphics2D g) {
        g.setColor(Color.white);
        g.fillOval(x,y, 50,50);
        g.setColor(Color.BLACK);

        Polygon p1 = new Polygon();
        p1.addPoint(this.x + 18, this.y + 23);
        p1.addPoint(this.x + 25, this.y + 18);
        p1.addPoint(this.x + 32, this.y + 23);
        p1.addPoint(this.x + 29, this.y + 31);
        p1.addPoint(this.x + 21, this.y + 31);
        g.fillPolygon(p1);

        Polygon p2 = new Polygon();
        p2.addPoint(this.x + 18, this.y + 5);
        p2.addPoint(this.x + 25, this.y + 10);
        p2.addPoint(this.x + 32, this.y + 5);
        p2.addPoint(this.x + 30, this.y + 1);
        p2.addPoint(this.x + 20,this.y + 1);
        g.fillPolygon(p2);

        Polygon p3 = new Polygon();
        p3.addPoint(this.x + 8, this.y + 38);
        p3.addPoint(this.x + 16, this.y + 38);
        p3.addPoint(this.x + 19, this.y + 45);
        p3.addPoint(this.x + 16, this.y + 49);
        p3.addPoint(this.x + 6, this.y + 42);
        g.fillPolygon(p3);

        Polygon p4 = new Polygon();
        p4.addPoint(this.x + 31,this.y + 45);
        p4.addPoint(this.x + 34,this.y + 38);
        p4.addPoint(this.x + 42,this.y + 38);
        p4.addPoint(this.x + 44,this.y + 42);
        p4.addPoint(this.x + 34,this.y + 49);
        g.fillPolygon(p4);

        Polygon p5 = new Polygon();
        p5.addPoint(this.x + 10, this.y + 10);
        p5.addPoint(this.x + 12,this.y + 20);
        p5.addPoint(this.x + 6,this.y + 25);
        p5.addPoint(this.x , this.y + 23);
        p5.addPoint(this.x + 6, this.y + 10);
        g.fillPolygon(p5);

        Polygon p6 = new Polygon();
        p6.addPoint(this.x + 40, this.y + 10);
        p6.addPoint(this.x + 38, this.y + 20);
        p6.addPoint(this.x + 44, this.y + 25);
        p6.addPoint(this.x + 51, this.y + 23);
        p6.addPoint( this.x + 45, this.y + 10);
        g.fillPolygon(p6);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(1));
        g.drawLine(this.x + 25,this.y + 10,this.x + 25,this.y + 18);
        g.drawLine(this.x + 18,this.y + 23,this.x + 12,this.y + 20);
        g.drawLine(this.x + 21,this.y + 31,this.x + 16,this.y + 38);
        g.drawLine(this.x + 29,this.y + 31,this.x + 34,this.y + 38);
        g.drawLine(this.x + 32,this.y + 23,this.x + 38,this.y + 20);
        g.drawLine(this.x + 18,this.y + 5,this.x + 10,this.y + 10);
        g.drawLine(this.x + 8,this.y + 38,this.x + 6,this.y + 25);
        g.drawLine(this.x + 19,this.y + 45,this.x + 31,this.y + 45);
        g.drawLine(this.x + 42,this.y + 38,this.x + 44,this.y + 25);
        g.drawLine(this.x + 40,this.y + 10,this.x + 32,this.y + 5);

        g.setStroke(new BasicStroke(1));
        g.setColor(new Color(0x4F4F56));
        g.drawOval(this.x, this.y, 50,50);
    }
}
