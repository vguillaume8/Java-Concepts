package borderLayout;
import java.awt.*;
import javax.swing.*;

public class borderLayout {
	public static void init() {
		JFrame frame = new JFrame("BorderLayout");
		// For BorderLayout, the constructor parameters are horizontal and vertical gaps
		frame.setLayout(new BorderLayout(20,50));
		frame.setSize(400,400);
		JButton button = new JButton("Button 1 NORTH");
		frame.add(button, BorderLayout.NORTH);
		button = new JButton("Button 2 East");
		frame.add(button, BorderLayout.EAST);
		button = new JButton("Button 3 WEST");
		frame.add(button, BorderLayout.WEST);
		button = new JButton("Button 4 SOUTH");
		frame.add(button, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();

	}

}
