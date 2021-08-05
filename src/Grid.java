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

        gridOfCells = new Cell[cellX + 1][cellY + 1];
        
        
    }
   
    public void paintWholeGrid(int startX, int startY,Cell cell, Graphics g) {//gridSize in pixels, startX - where to start drawing grid
        int gridX = 0;
        int gridY = 0;

        for(int i = startX; i < gridNumX ; i+= cell.getCellSizeX()) {
            for(int j = startY; j < gridNumY ; j+= cell.getCellSizeY()) {
                System.out.println(gridX + "  " + gridY);
                cell.paintCell(i,j,g);
                gridOfCells[gridX][gridY] = cell; 
                gridX++;
            }
            gridX = 0;
            gridY++;
        }
    
    }
        


}

