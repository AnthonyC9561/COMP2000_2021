<<<<<<< HEAD
import javax.swing.*;
import java.awt.*;

public class Cell {
    private int sizeX; //size of each cell in the grid (in pixels) 
    private int sizeY;
    private Color cellColor; //colour of each cell
    private Color cellOutlineColor; //outline of each cell

    public Cell(int x, int y, Color cellColor, Color cellOutlineColor) {
        this.sizeX = x; //this.x refers to the attributes of the class, not the method, otherwise use different name for parameters of class
        this.sizeY = y;
        this.cellColor = cellColor;
        this.cellOutlineColor = cellOutlineColor;
    }

    public int getCellSizeX() {
        return sizeX;
    }

    public int getCellSizeY() {
        return sizeY;
    }

    public void paintCell(int posX, int posY, Graphics g) {//pos = position in the grid
            g.setColor(cellColor);
            g.fillRect(posX, posY, sizeX, sizeY);
            //outline
            g.setColor(cellOutlineColor);
            g.drawRect(posX, posY, sizeX, sizeY);
    }

    public void cellHighlight(double x, double y, Graphics g) {//x and y from mouse position on panel
        int rounderX =(int)x % sizeX; //to round to the nearest cell drawing position
        int rounderY = (int)y % sizeY;
        int cellInitPosX = (int)x - rounderX;  
        int cellInitPosY = (int)y - rounderY;
        
        g.setColor(Color.GRAY);
        g.fillRect(cellInitPosX, cellInitPosY,sizeX,sizeY);
        g.setColor(cellOutlineColor);
        g.drawRect(cellInitPosX,cellInitPosY, sizeX, sizeY);

    }

}
=======
import java.awt.*;

class Cell{
    // fields
    int x;
    int y;
    static int size = 35;

    //constructors
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    //methods
    void paint(Graphics g, Point mousePos){
        if(contains(mousePos)){
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
    }

    boolean contains(Point p){
        if (p != null){
            return (x < p.x && x+size > p.x && y < p.y && y+size > p.y);
        } else {
            return false;
        }
    }
}
>>>>>>> 816bbac67de49d95b4edc6517f7de10efbd6503f
