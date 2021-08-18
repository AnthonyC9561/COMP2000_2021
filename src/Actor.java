import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public abstract class Actor {
    Color color;
    List<Polygon> shapes = new ArrayList<>();
    Cell loc;

   /* public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
        g.setColor(Color.GRAY);
        g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    }*/
    public void setShape() {//just draws a circle
        int sides = 20;
        double circleX;
        double circleY;
        double angle = 360/sides;
        Polygon circle = new Polygon();

        for(int i = 0; i <= sides; i++) {
            circleX = (3.0*Math.sin(Math.toRadians(i*angle)));
            circleY = (3.0*Math.cos(Math.toRadians(i*angle)));
            circle.addPoint(loc.x + (int)circleX, loc.y + (int)circleY);
        }

    }
    public void draw(Graphics g) {
        
        for(Polygon p : shapes) {
            g.setColor(Color.BLACK);
            g.drawPolygon(p);
            g.setColor(color);
            g.fillPolygon(p);

        }
    
    }
}
