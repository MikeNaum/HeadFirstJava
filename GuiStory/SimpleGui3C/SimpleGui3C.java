import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimpleGui3C implements ActionListener {
	
	JFrame frame;
	
	public static void main(String[] args) {
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Change color");
		button.addActionListener(this);
		
		MyDrawPanel myDrawPanel = new MyDrawPanel();		
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		frame.repaint();
	}
}