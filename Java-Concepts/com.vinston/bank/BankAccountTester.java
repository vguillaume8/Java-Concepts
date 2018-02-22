
/**
    This program tests the BankAccount class and its subclasses
 */
public class BankAccountTester {
    /**
        Tests the methods of the BankAccount class
        @param args not used
     */

     public static void main(String[] args) {
        // BankAccount harrysChecking = new BankAccount();
        //  harrysChecking.deposit(2000);
        //  harrysChecking.withdraw(500);
        //  System.out.println(harrysChecking.getBalance());
        //  System.out.println("Expected: 1500");
        SavingsAccount momsSavings = new SavingsAccount(0.5);
        CheckingsAccount harrysChecking = new CheckingsAccount(100);
        momsSavings.deposit(10000);
        momsSavings.transfer(2000, harrysChecking);
        harrysChecking.withdraw(1500);
        harrysChecking.withdraw(80);

        momsSavings.transfer(1000, harrysChecking);
        harrysChecking.withdraw(400);

        // Simulate end of the month
        momsSavings.addInterest();
        harrysChecking.deductFees();

        System.out.println("Mom's savings balance: " + momsSavings.getBalance());
        System.out.println("Expected: 7035");

        System.out.println("Harry's checking balance: " + harrysChecking.getBalance());
        System.out.println("Expected: 1116");

        /*BankAccount BellasChecking = new BankAccount(;
        BellasChecking.deposit(1,000);
        BellasChecking.deposit(200);
        BellasChecking.withdraw(150);
        System.out.println(BellasChecking.getBalance()); */
     }
}