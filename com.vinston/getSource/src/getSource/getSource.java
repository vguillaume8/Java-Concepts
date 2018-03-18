package getSource;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class getSource {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.setBackground(Color.yellow);
		panel2.setBackground(Color.green);
		JButton thirdButton = new JButton("This button changes color");
		ActionListener AL = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == redButton) {
					thirdButton.setBackground(Color.RED);
				} else if (e.getSource() == blueButton) {
					thirdButton.setBackground(Color.BLUE);;
				}
			}
		};
		
		redButton.addActionListener(AL);
		blueButton.addActionListener(AL);
		frame.add(panel1);
		frame.add(panel2);
		panel1.add(redButton);
		panel1.add(blueButton);
		panel2.add(thirdButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		

	}

}
