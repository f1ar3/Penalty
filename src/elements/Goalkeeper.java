package elements;

import java.awt.*;

public class Goalkeeper {

    private int x,y;

    public Goalkeeper(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void drawGoalkeeper(Graphics2D g) {
        Color c = new Color(0xFCFCD5);
        g.setColor(c);
        //Рисование туловища вратаря
        g.fillOval(x,y,60,60);
        g.setStroke(new BasicStroke(5));
        g.drawLine(this.x + 30,this.y + 60,this.x + 30,this.y + 150);
        g.drawLine(this.x + 30,this.y + 70,this.x - 10,this.y + 110);
        g.drawLine(this.x + 30,this.y + 70,this.x + 70,this.y + 110);
        g.drawLine(this.x + 30,this.y + 150,this.x + 10,this.y + 200);
        g.drawLine(this.x + 30,this.y + 150,this.x + 50,this.y + 200);

        //Глаза и улыбка
        g.setColor(Color.WHITE);
        g.fillOval(this.x + 10,this.y + 15,15,15);
        g.fillOval(this.x + 35,this.y + 15,15,15);
        g.setColor(Color.black);
        g.fillOval(this.x + 13,this.y + 18,7,7);
        g.fillOval(this.x + 38,this.y + 18,7,7);
        g.setStroke(new BasicStroke(1));
        g.drawArc(this.x + 15,this.y + 40,30,10,210,120);

        //Футболка
        g.setColor(Color.CYAN);
        g.drawArc(this.x + 20,this.y + 55,20,20,210,110);
        g.setStroke(new BasicStroke(10));
        g.drawLine(this.x + 20,this.y + 75,this.x + 5,this.y + 95);
        g.drawLine(this.x + 40,this.y + 75,this.x + 55,this.y + 95);
        g.fillRect(this.x + 20,this.y + 75,20,65);

        //Шорты
        g.fillRect(this.x + 20,this.y + 140,20,20);
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(1));
        g.drawLine(this.x + 20,this.y + 150,this.x + 40,this.y + 150);
        g.setStroke(new BasicStroke(10));
        g.setColor(Color.CYAN);
        g.drawLine(this.x + 25,this.y + 160,this.x + 20,this.y + 175);
        g.drawLine(this.x + 35,this.y + 160,this.x + 40,this.y + 175);

        //Бутсы
        g.setColor(Color.BLACK);
        g.fillOval(this.x - 5,this.y + 195,20,10);
        g.fillOval(this.x + 45,this.y + 195,20,10);


    }
}
