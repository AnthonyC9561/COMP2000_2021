import java.awt.*;

<<<<<<< HEAD
public interface Actor {//task 8 --maybe change interface to an abstract to define field 

    public void paint(Graphics g);
    public Point getPoint();
=======
public abstract class Actor {
    Color color;
    Cell loc;

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
        g.setColor(Color.GRAY);
        g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    }
>>>>>>> 6ab525615c19d2d2a4cc2de353c6f09c66fb4f9d
}
