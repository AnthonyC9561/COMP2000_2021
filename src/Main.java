import javax.swing.*;
import java.awt.*;
<<<<<<< HEAD
public class Main extends JFrame{//extends meeaning inheriting properties from a parent class
    
    public static void main(String[] args) throws Exception {
        Main window = new Main();

        while (window.isActive()) {
            Point mousePoint = MouseInfo.getPointerInfo().getLocation();
            Point mouseLoc = window.getLocationOnScreen();
            Double x = mousePoint.getX() - mouseLoc.getX();
            Double y = mousePoint.getY() - mouseLoc.getY();
           // Point mousePoint = window.getMousePosition().getLocation();
            //System.out.println("X and Y are" + mousePoint.getX() + " " + mousePoint.getY());
            System.out.println("X and Y points are:" + x + "  " + y);
        }
    }

    // window.run();

    

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
        grid.setGrid(cell);
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
=======

class Main extends JFrame {
    
    class App extends JPanel {
        
        Grid grid;

        public App() {
            setPreferredSize(new Dimension(720, 720));
            grid = new Grid();
        }

        @Override
        public void paint(Graphics g) {
            grid.paint(g, getMousePosition());
        }

    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            this.repaint();
        }
>>>>>>> 816bbac67de49d95b4edc6517f7de10efbd6503f
    }
}