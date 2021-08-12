<<<<<<< HEAD
import javax.swing.*;
import java.awt.*;
public class Grid {
    private int cellNumX;//number of cells in the Grid on x axis
    private int cellNumY;// "" on y axis
    private int gridNumX;//pixel size of grid in x axis
    private int gridNumY;// "" on y axis
    private Cell[][] gridOfCells;

    public Grid(int numX, int numY, int cellX, int cellY) { //Construct a grid...
        gridNumX = numX;
        gridNumY = numY;
        cellNumX = cellX;
        cellNumY = cellY;

        gridOfCells = new Cell[cellX][cellY]; //allocates space for 2d for the number of cells
        
        
    }
    public void setGrid(Cell cell){ //creates a 2D array of cells
        for(int i = 0; i < cellNumX ; i++) {
            for(int j = 0; j < cellNumY; j++) {
                gridOfCells[i][j] = cell;
=======
import java.awt.*;

class Grid {
    //fields
    Cell[][] cells = new Cell[20][20];

    // constructor
    public Grid(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell(10+35*i,10+35*j);
>>>>>>> 816bbac67de49d95b4edc6517f7de10efbd6503f
            }
        }
    }

<<<<<<< HEAD
    public void paintWholeGrid(int startX, int startY,Cell cell, Graphics g) {//gridSize in pixels, startX - where to start drawing grid

        for(int i = startX; i < gridNumX ; i+= cell.getCellSizeX()) {
            for(int j = startY; j < gridNumY ; j+= cell.getCellSizeY()) {
                cell.paintCell(i,j,g);
            }
        }
    
    }

    public void updateGrid(Cell cell) {

    }
        


}

=======
    // methods
    public void paint(Graphics g, Point mousePos){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j].paint(g, mousePos);
            }
        }
    }
}
>>>>>>> 816bbac67de49d95b4edc6517f7de10efbd6503f
