/**
 * 
 */
package bankAccount;

/**
 * @author kingvince
 *
 */
public class bankAccount {
	private double balance;
	private int accountNumber;
	
	public bankAccount() {
		balance = 0;
	}
	
	public bankAccount(double initialBalance) {
		balance = initialBalance;
		
	}
	
	public bankAccount(int anAccountNumber) {
		accountNumber = anAccountNumber;
		balance = 0;
	}
	
	public bankAccount(int anAccountNumber, double initialBalance) {
		accountNumber = anAccountNumber;
		balance = initialBalance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void transfer(double amount, bankAccount other) {
		withdraw(amount);
		other.deposit(amount);
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
 
	/**
	 * @return the balance
	 */
	/**
	 * @param balance the balance to set
	 */
	public double getBalance() {
		return balance;
	}

}
