import javax.swing.JFrame;

public class Main extends JFrame{
    public static void main(String[] args) {
        // create windows and gamepanel
        JFrame window = new JFrame();
        GamePanel panel = new GamePanel();

        // window setUp
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("AGE OF FRONTIER"); // Window title
        window.add(panel);
        window.pack();
        window.setLocationRelativeTo(null); // Places the window in the middle of the screen
        window.setVisible(true);

        // start mainthread
        panel.mainThread();

    }
}