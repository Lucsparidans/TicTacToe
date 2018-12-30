import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {
    public Display(String title) throws HeadlessException {
        super(title);
        setContentPane(new DrawComponent());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public Display() throws HeadlessException {
        this("TicTacToe");
    }

    class DrawComponent extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            g.fillRect(20, 20, 100, 200);
        }
    }
}
