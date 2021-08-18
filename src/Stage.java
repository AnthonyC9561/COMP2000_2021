import java.awt.Graphics;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Stage {
    Grid grid;
    List<Actor> actors;
    Actor train;
    Actor car;
    Actor boat;

    public Stage() {
        actors = new ArrayList<>();
        grid = new Grid();
        train = new Train(grid.cellAtColRow(0, 0));
        car = new Car(grid.cellAtColRow(0, 15));
        boat = new Boat(grid.cellAtColRow(12, 9));
        train.setShape();
        car.setShape();
        boat.setShape();
        actors.add(train);
        actors.add(car);
        actors.add(boat);
    }

    public void setStage(Graphics g, Point mouseLoc) {
        grid.paint(g, mouseLoc);
        
        for(Actor a : actors) {
           a.draw(g);
        }
    }
}
