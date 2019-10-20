import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleGui3B implements ActionListener {
	
	JFrame frame;
	
	public static void main(String[] args) {
		SimpleGui3B gui = new SimpleGui3B();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Change color");
		button.addActionListener(this);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent even) {
		frame.repaint();
	}
}