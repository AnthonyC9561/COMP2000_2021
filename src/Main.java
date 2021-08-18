import javax.swing.*;
import java.awt.*;
class Main extends JFrame {
    
    class App extends JPanel {
        
        Stage stage;

        public App() {
            setPreferredSize(new Dimension(720, 720));
            stage = new Stage();
        }

        @Override
        public void paint(Graphics g) {
<<<<<<< HEAD
            Stage s = new Stage();
            s.setStage(g,getMousePosition()); //replaced with setStage to paint over the grid
           // grid.paint(g, getMousePosition());
=======
            stage.paint(g, getMousePosition());
>>>>>>> 6ab525615c19d2d2a4cc2de353c6f09c66fb4f9d
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
    }
}