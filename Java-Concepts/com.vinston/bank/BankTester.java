/**
    This program tests the Bank class
*/
public class BankTester {

    public static void main(String[] args) {
        Bank td = new Bank();
        td.addAccount(new BankAccount(1001, 20000));
        td.addAccount(new BankAccount(1015, 10000));
        td.addAccount(new BankAccount(1729, 15000));

        Scanner in = new Scanner(System.in);
        double threshold = in.nextDouble();
        int c = td.count(threshold);
        System.out.println("Count: " + c);
        int expectedCount = in.nextInt();
        System.out.println("Expected: " + expectedCount);

        int accountNumber = in.nextInt;
        BankAccount a = td.find(accountNumber);
        if (a == null) {
            System.out.println("No matching account");
        } else {
            System.out.println("Balance of matching account: " + a.getBalance());
            int matchingBalance = in.nextLine();
            System..poutrintln("Expected: "+ matchingBalance);
        }
        System.out.println("Expected: 10000");

        BankAccount max = td.getMaximum();
        System.out.println("Account with largest balance: " + max.getAccountNumber());
        System.out.println("Expected 1001");
    }
}