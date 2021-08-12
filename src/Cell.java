import java.awt.*;

class Cell extends Rectangle{
    // fields
    /*int x;//x and y are positions within the grid, while in contains 
    int y;*/
    /*static int size = 35;
    */
    //constructors
    public Cell(int x, int y){
        super.x = x;
        super.y = y;
        super.width = 35;
        super.height = 35;
    }

    //methods
    void paint(Graphics g, Point mousePos){
        if(mousePos != null && super.contains(mousePos)){
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x,y,super.width,super.height);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,super.width,super.height);
    }
/*
    public boolean contains(Point p){ //paint in Grid scans all the cells and checks if point p's coord are within a range of a cell in the grid
        if (p != null){
            return (x < p.x && x+ super.width > p.x && y < p.y && y+ super.height > p.y);
        } else {
            return false;
        }
    }
    */

}
