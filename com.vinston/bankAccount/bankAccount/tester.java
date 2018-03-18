/**
 * 
 */
package bankAccount;

/**
 * @author kingvince
 *
 */
public class tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankAccount vince = new bankAccount(1000);
		bankAccount mom = new bankAccount(5000000);
		vince.deposit(3000);
		mom.transfer(30000, vince);
		System.out.println(vince.getBalance());
		

	}

}
