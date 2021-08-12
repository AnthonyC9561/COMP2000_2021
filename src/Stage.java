import java.awt.*;

public class Stage {
    Grid grid;
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

    
}
