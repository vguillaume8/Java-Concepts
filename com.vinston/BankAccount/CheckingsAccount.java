public class CheckingsAccount extends BankAccount {

    /**
        Constructs a checking account with a given balance
        @param initialBalance the intial balance
     */
    public CheckingsAccount(double initialBalance) {
        // Construct superclass
        super(initialBalance);
        // Intialize transaction count
        transactionCount = 0;
    }

    public void deposit(double amount) {
        transactionCount++;
        // Now add to balance
        super.deposit(amount);

    }

    public void withdraw(double amount) {
        transactionCount++;
        // Now subtract amount from balance
        super.withdraw(amount);
    }

    /**
        Deducts the accumulated fees and resets the transaction count
     */
    public void deductFees() {
        if (transactionCount > FREE_TRANSACTIONS) {
            double fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
            super.withdraw(fees);
        }
        transactionCount = 0;
    }

    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;
}