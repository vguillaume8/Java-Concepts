package bankAccount;
import java.util.ArrayList;

/**
 	This bank contains a collection of bank accounts

 */
public class bank {
	/**
	 	Constructs a bank with no bank accounts
	 */
	private ArrayList<bankAccount> accounts;
	
	public bank() {
		accounts = new ArrayList<bankAccount>();
	}
	
	/**
	 	Adds an account to this bank.
	 	@param a the account to add.
	 */
	public void addAccount(bankAccount a) {
		accounts.add(a);
	}
	
	/**
	 	Gets the sum of the balances of all accounts in this bank.
	 	@return the sum of the balance
	 */
	public double getTotalBalance() {
		double total = 0;
		for(bankAccount a : accounts) {
			total = total + a.getBalance();
		}
		return total;
	}
	
	/*
	 	Counts the number of bank acounts whose balance is at least a given value
	 	@param atLeast the balance required to count an account
	 	@return the number of accounts having at least the given balance
	 */
	public int count(double atLeast) {
		int matches = 0;
		for(bankAccount a : accounts) {
			if(a.getBalance() >= atLeast) {
				matches++; // Found a match
			}
		}
		return matches;
	}
	
	/**
	 	Finds a bank account with a given number.
	 	@param accountNumber the number to find
	 	@return the account with the given number, or null if there is no such account
	 */
	public bankAccount find(int accountNumber) {
		for(bankAccount a : accounts) {
			if(a.getAccountNumber() == accountNumber) {
				return a; // Found a match
			}
		}
		return null; // No match in the entire array list
	}
	
	/**
	 	Gets the bank account with the largest balance.
	 	@return the account with the largest balance, or null if the bank has no accounts
	 */
	public bankAccount getMaximum() {
		if(accounts.size() == 0) {
			return null;
		}
		bankAccount largestYet = accounts.get(0);
		for(int i = 0; i < accounts.size(); i++) {
			bankAccount a = accounts.get(i);
			if(a.getBalance() > largestYet.getBalance()) {
				largestYet = a;
			}
		}
		return largestYet;
	}

}
