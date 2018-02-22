
/**
    A bank account has a balance that can be changed by deposits and withdrawls.
*/

public class BankAccount {

    private double balance;
    private int accountNumber;

    public BankAccount() {
        balance = 0;
    }

     /** 
        Constructs a bank account with a given balance.
        @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance) {
         balance = initialBalance;
     } 



    /**
        Constructs a bank account with zero balance
        @param anAccountNumber the account number for this account
     */
    public BankAccount(int anAccountNumber) {
        accountNumber = anAccountNumber;
        balance = 0;

    }
    /** 
        Constructs a bank account with a given balance.
        @param anAccountNumber the account number for this account
        @param initialBalance the initial balance
     */
    public BankAccount(int anAccountNumber, double initialBalance) {
        accountNumber = anAccountNumber;
        balance = initialBalance;

    }

    /**
        Gets the account number of this bank account.
        @return the account number
     */
     public int getAccountNumber() {
         return accountNumber;
     }

     public void transfer(double amount, BankAccount other) {
         withdraw(amount);
         other.deposit(amount);
     }

    /**
        Deposits money into the bank account.
        @param amount the amount to deposit
     */
    public void deposit(double amount) {
        //double newBalance = balance + amount;
        //balance = newBalance;
        balance = balance + amount;

    }
    /**
        Withdraws money from the bank account.
        @param amount the money to withdraw
    */
    public void withdraw(double amount) {
        /*if(amount <= balance) {
            double newBalance = balance - amount;
            balance = newBalance;*/
            balance = balance - amount;
        
    }
    /**
    Gets the current balance of the bank account.
    @return the current balance
    */
    public double getBalance() {
        return balance;
        
    }
}