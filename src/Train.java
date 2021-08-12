import java.awt.*;

public class Train implements Actor {
    int x = 10;
    int y = 10 + 35 * 19;
    Point p;
    int size = 35;

    Color trainColor;
    Cell train;

    public Train() {
        train = new Cell(x,y);  //starting position in Grid
        trainColor = Color.RED;
        p = new Point(x,y);
    }

    public Point getPoint() {
        return p;
    }

    public void paint(Graphics g) {
        g.setColor(trainColor);
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);

    }

}
