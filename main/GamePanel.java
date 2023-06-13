import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
    // screen values
    private int width = 800;
    private int height = 600;

    // thread
    private Thread graphicsThread;

    public GamePanel(){
        this.setPreferredSize(new Dimension(width, height));
    }

    public void mainThread(){
        graphicsThread = new Thread();
    }

    @Override
    public void run() {
        if (graphicsThread != null){
            repaint();
        }
    }

    public void paintComponent(Graphics graphics){
        Graphics2D g = (Graphics2D) graphics;

        g.fillRect(100, 100, 100, 100);
    }
}
