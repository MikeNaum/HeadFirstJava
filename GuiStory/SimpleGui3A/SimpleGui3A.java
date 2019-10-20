import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimpleGui3A implements ActionListener {

    JFrame frame;
	JButton buttonLabel;
	JButton buttonColor;
	JLabel label;

    public static void main(String[] args) {
        SimpleGui3A gui = new SimpleGui3A();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        buttonLabel = new JButton("Change label");
        buttonLabel.addActionListener(this);

        buttonColor = new JButton("Change color");
        buttonColor.addActionListener(this);

        label = new JLabel("Buttons no clicked");

        MyDrawPanel myDrawPanel = new MyDrawPanel();
        
        frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
        frame.getContentPane().add(BorderLayout.EAST, buttonLabel);
        frame.getContentPane().add(BorderLayout.SOUTH, buttonColor);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == buttonColor) {
            frame.repaint();
            label.setText("Button Color clicked");
        } else {
            label.setText("Button Label clicked");
        }
    }
}