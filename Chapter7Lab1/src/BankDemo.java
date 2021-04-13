
/**
 * @author Melissa Hardwick
 * @date 04/02/2021
 *@purpose A banking program that works with user defined classes
 */
public class BankDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create bank objects and test the methods in the bank class
		Bank bank1 = new Bank();
		bank1.readCheckingInfo();
		
		// Pass information to Bank program
		Bank bank2 = new Bank("AB123","Vicky Hardin", 1000.00, 500.00);
		bank2.writeCheckingInfo();
		
		if ( bank1.equals( bank2 ) )
		 System.out.println( "The two bank accounts are identical" );
		else
		 System.out.println( "The two bank accounts are different" );
		
		Bank bank3 = new Bank("AB123", "Vicky Hardin", "Microsoft", 5,25.00);
		bank3.writeStockInfo();
		
		// Default Constructor Method
		Bank bank4 = new Bank();
		bank4.readStockInfo();

	}

}
