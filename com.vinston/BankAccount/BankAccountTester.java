public class BankAccountTester {
    /**
        Tests the methods of the BankAccount class
        @param args not used
     */

     public static void main(String[] args) {
         BankAccount harrysChecking = new BankAccount();
        //  harrysChecking.deposit(2000);
        //  harrysChecking.withdraw(500);
        //  System.out.println(harrysChecking.getBalance());
        //  System.out.println("Expected: 1500");

        BankAccount BellasChecking = new BankAccount(;
        BellasChecking.deposit(1,000);
        BellasChecking.deposit(200);
        BellasChecking.withdraw(150);
        System.out.println(BellasChecking.getBalance());
     }
}v