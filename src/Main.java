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
@Override //to indicate that this method is used over the one from JPanel
    public void paint(Graphics g){
        for(int i = 10; i < 710; i+=35) {
            for(int j = 10; j < 710; j+= 35) {
                g.setColor(Color.WHITE); //set the color before filling or drawing the rectangle
                g.fillRect(i,j,35,35);
                g.setColor(Color.BLACK);
                g.drawRect(i,j,35,35);
            }
        }
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
