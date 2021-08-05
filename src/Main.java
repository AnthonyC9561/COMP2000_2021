import javax.swing.*;
import java.awt.*;
public class Main extends JFrame{//extends meeaning inheriting properties from a parent class
    
    public static void main(String[] args) throws Exception {
     Main window = new Main();
    // window.run();

    }

public class Canvas extends JPanel {
    public Canvas() {
        setPreferredSize(new Dimension(720,720));
    }
    
@Override //to indicate that this method is used over the one from JPanel, 
   /* public void paint(Graphics g){ //paint method already called on JPanel, overriding allows this mothod to be used
        for(int i = 10; i < 710; i+=35) {
            for(int j = 10; j < 710; j+= 35) {
                g.setColor(Color.WHITE); //set the color before filling or drawing the rectangle
                g.fillRect(i,j,35,35);
                g.setColor(Color.BLACK);
                g.drawRect(i,j,35,35);
            }
        }
    }*/
      public void paint(Graphics g){
        Grid grid = new Grid(710,710,20,20);
        Cell cell = new Cell(35,35,Color.WHITE,Color.BLACK);
        grid.paintWholeGrid(10 ,10 ,cell ,g);
        }
    }

//Constructor
    public Main() {//methods under the class Window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        setContentPane(canvas);//sets the 'content' of the window with the canvas
        this.pack();
        this.setVisible(true);
    }
}
