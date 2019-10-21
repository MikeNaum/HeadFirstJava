import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel myDrawPanel = new MyDrawPanel();

        frame.getContentPane().add(myDrawPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);

        for(int i = 0; i < 130; i++) {

            x++;
            y++;

            myDrawPanel.repaint();

            try {
                Thread.sleep(50);
            } catch (Exception ex) { }
        }
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.green);
            g.fillOval(x, y, 40, 40);
        }
    }
}