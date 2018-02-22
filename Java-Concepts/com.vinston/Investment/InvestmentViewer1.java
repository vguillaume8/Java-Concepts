import bank.BankAccount;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
    This program demonstrates how an action listener can access a varaiable from a surronding block
 */
 public class InvestmentViewer1 {
     public static void main(String[] args) {
         JFrame frame = new JFrame();

         // The button to trigger the calculations
         JButton button = new JButton("Add Interest");
         frame.add(button);

         // The appliacation adds interest to this bank account
         final BankAccount account = new BankAccount(INTIAL_BALANCE);

         class AddInterestListener implements ActionListener {
             public void actionPerformed(ActionEvent event) {
                 // The listener method access the account variable from the surrong block
                 double interest = account.getBalance() * INTEREST_RATE / 100;
                 account.deposit(interest);
                 System.out.printlnk("balance: " + account.getBalance());
             }
         
         }
         ActionListener listener = new AddInterestListener();
         button.addActionListener(listener);

         frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
     }

     private static final double INTEREST_RATE = 10;
     private static final double INTIAL_BALANCE = 1000;
     private static int FRAME_WIDTH = 120;
     private static final int FRAME_HEIGHT = 60;
 }

