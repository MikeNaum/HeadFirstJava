import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TwoButtons {

    JFrame frame;
	JButton buttonLabel;
	JButton buttonColor;
	JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        buttonLabel = new JButton("Change label");
        buttonLabel.addActionListener(new LabelListener());

        buttonColor = new JButton("Change color");
        buttonColor.addActionListener(new ButtonListener());

        label = new JLabel("Buttons no clicked");

        MyDrawPanel myDrawPanel = new MyDrawPanel();
        
        frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
        frame.getContentPane().add(BorderLayout.EAST, buttonLabel);
        frame.getContentPane().add(BorderLayout.SOUTH, buttonColor);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Button Label clicked");
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
            label.setText("Button Color clicked");
        }
    }
}