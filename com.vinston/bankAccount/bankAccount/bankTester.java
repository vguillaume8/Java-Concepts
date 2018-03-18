package bankAccount;

public class bankTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank javaBank = new bank();
		javaBank.addAccount(new bankAccount(1001, 20000));
		javaBank.addAccount(new bankAccount(1015, 10000));
		javaBank.addAccount(new bankAccount(1729, 15000));
		
		double threshold = 15000;
		int c = javaBank.count(threshold);
		System.out.println(c + " accounts with balance >= " + threshold);
		
		int accountNumber = 1015;
		bankAccount a = javaBank.find(accountNumber);
		if(a == null) {
			System.out.println("No account with number " + accountNumber);
		} else {
			System.out.println("Account with number " + accountNumber + " has balance " + a.getBalance());
			
			bankAccount max = javaBank.getMaximum();
			System.out.println("Account with number " + max.getAccountNumber() + " has the largest balance.");
		}

	}

}
