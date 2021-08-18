<<<<<<< HEAD
=======
import java.awt.Graphics;
>>>>>>> 6ab525615c19d2d2a4cc2de353c6f09c66fb4f9d
import java.awt.*;

public class Stage {
    Grid grid;
<<<<<<< HEAD
    Train train;
    Car car;
    Boat boat;
    Actor[] actors = new Actor[3];

    public Stage() {
        grid = new Grid();
        train = new Train();
        car = new Car();
        boat = new Boat();

        actors[0] = train;
        actors[1] = car;
        actors[2] = boat;
    }

    public void setStage(Graphics g, Point mousept) {
        
        grid.paint(g,mousept);
        for(Actor a : actors) {
            a.paint(g);
        }

    }

    
=======
    Actor train;
    Actor car;
    Actor boat;

    public Stage() {
        grid = new Grid();
        train = new Train(grid.cellAtColRow(0, 0));
        car = new Car(grid.cellAtColRow(0, 15));
        boat = new Boat(grid.cellAtColRow(12, 9));
    }

    public void paint(Graphics g, Point mouseLoc) {
        grid.paint(g, mouseLoc);
        train.paint(g);
        car.paint(g);
        boat.paint(g);
    }
>>>>>>> 6ab525615c19d2d2a4cc2de353c6f09c66fb4f9d
}
