import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import java.awt.geom.Line2D;

public class FrameViewer extends JComponent {
     public void paintComponent(Graphics g) {

        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(5, 10, 20, 30);
        //g2.draw(box);

        //box.translate(15,25);

        //g2.draw(box);

        // Draw the head
        Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150);
        g2.draw(head);
        // Draw the eyes
        Line2D.Double eye1 = new Line2D.Double(25, 70, 45, 90);
        g2.draw(eye1);

        Line2D.Double eye2 = new Line2D.Double(85, 70, 65, 90);
        g2.draw(eye2);

        // Draw the mouth
        Rectangle mouth = new Rectangle(30, 130, 50, 5);
        g2.setColor(Color.RED);
        g2.fill(mouth);

        // Draw the greeting
        g2.setColor(Color.BLUE);
        g2.drawString("What's Good my Nigga!!!!!!!!!", 5, 175);
    
    }

    

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("An Alien Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FrameViewer component = new FrameViewer();
        frame.add(component);
        frame.setVisible(true);


    }
   
}
