import java.awt.*;

<<<<<<< HEAD
public class Car implements Actor{ //common items among train, car and boat includes the fields, the implemented paint all have different implementations 
    int x = 10 + 35 * 3;
    int y =  10 + 35 * 19;
    Point p;
    int size = 35;
    Color carColor;
    Cell car;

    public Car() {
        car = new Cell(x,y); 
        carColor = new Color(102,0,153); //purple colour
        p = new Point(x,y);
    }

    public Point getPoint() {
        return p;
    }

    public void paint(Graphics g) {
            g.setColor(carColor);
            g.fillRect(x,y,35,35);
            g.setColor(Color.BLACK);
            g.drawRect(x,y,size,size);
    }

=======
public class Car extends Actor {
    public Car(Cell inLoc) {
        loc = inLoc;
        color = new Color(148, 33, 146); // or we could use Color.MAGENTA
    }
>>>>>>> 6ab525615c19d2d2a4cc2de353c6f09c66fb4f9d
}
