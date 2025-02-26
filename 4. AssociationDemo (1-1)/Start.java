import java.lang.*;

public class Start
{
	public static void main(String []args)
	{
		Account a1 = new Account();
		a1.setAccountNumber(111111111);
		a1.setAccountHolderName("OOP1 G");
		a1.setBalance(2000.0);
		
		Customer c1 = new Customer();
		c1.setPhnNumber("+88012345678890");
		c1.setAccount(a1);
		
		c1.showDetails();
		System.out.println("----------------------------------------");
		Account a2 = new Account(22222222, "OOP1 C", 2500.0);
		Customer c2 = new Customer("+88019876543221", a2);
		
		System.out.println("Customer PhnNumber: "+c2.getPhnNumber());
		System.out.println("Customer Account Number: "+c2.getAccount().getAccountNumber());
		System.out.println("Customer Account Holder Name: "+c2.getAccount().getAccountHolderName());
		System.out.println("Customer Balance: "+c2.getAccount().getBalance());
		
	}
}




