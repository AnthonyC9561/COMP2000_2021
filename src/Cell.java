import javax.swing.*;
import java.awt.*;

public class Cell {
    int x; //size of each cell in the grid (in pixels) 
    int y;
    Color color; //colour of each cell

    public Cell(int x, int y, Color color) {
        this.x = x; //this.x refers to the attributes of the class, not the method, otherwise use different name for parameters of class
        this.y = y;
        this.color = color;
    }

    

}
