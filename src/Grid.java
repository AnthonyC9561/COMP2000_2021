import java.awt.*;
class Grid {
    //fields
    Cell[][] cells = new Cell[20][20];

    // constructor
    public Grid(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell(10+35*i,10+35*j);
            }
        }
    }

    // methods
    public void paint(Graphics g, Point mousePos){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j].paint(g, mousePos);
            }
        }
    }

<<<<<<< HEAD
}
=======
    public Cell cellAtColRow(int c, int r) {
        return cells[c][r];
    }
}
>>>>>>> 6ab525615c19d2d2a4cc2de353c6f09c66fb4f9d
