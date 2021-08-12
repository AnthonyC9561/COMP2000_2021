import java.awt.*;

public class Boat implements Actor{
    int x = 10 + 35 * 6; //hardcoded location of the 3 vehicles
    int y = 10 + 35 * 19;
    Point p;
    int size = 35;
    Color boatColor;
    Cell boat;

    public Boat() {
        boat = new Cell(x,y);
        boatColor = Color.ORANGE;
        p = new Point(x,y);
    }

    public Point getPoint() {
        return p;
    }

    public void paint(Graphics g) {
            g.setColor(boatColor);
            g.fillRect(x,y,35,35);
            g.setColor(Color.BLACK);
            g.drawRect(x,y,size,size);
    }
}
