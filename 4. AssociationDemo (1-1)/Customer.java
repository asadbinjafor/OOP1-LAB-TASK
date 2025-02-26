import java.lang.*;

public class Customer
{
	private String phnNumber;
	private Account account;
	
	public Customer()
	{
		System.out.println("Empty Customer");
	}
	public Customer(String phnNumber, Account account)
	{
		System.out.println("Para Customer");
		this.phnNumber = phnNumber;
		this.account = account;
	}
	public void setPhnNumber(String phnNumber)
	{
		this.phnNumber = phnNumber;
	}
	public void setAccount(Account account)
	{
		this.account = account;
	}
	public String getPhnNumber(){return phnNumber;}
	public Account getAccount(){return account;}
	
	public void showDetails()
	{
		System.out.println("Customer Phn Number: "+phnNumber);
		System.out.println("Customer Account Number: "+account.getAccountNumber());
		System.out.println("Customer Account Holder Name: "+account.getAccountHolderName());
		System.out.println("Customer Account Balance: "+account.getBalance());
		//account.showDetails();
		
	}
}