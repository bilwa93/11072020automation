package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account(new SBI());//SBI=Chrome
		Account(new HDFC());//HDFC=firefox
		Account(new ICICI());//ICICI=Edge

		
		//all have been assigned values
		String name="anand";
		RBIInterface bank=new SBI();
		int a=10;
		//by entering declared above values
		sum(a);
		message(name);
		Account(bank);
		//by direct giving values
		sum(20);
		message("bilwa");
		Account(new SBI());
		
		
		
	}
	public static void Account(RBIInterface bank)//RBI ==WebDriver
	{
		
		bank.CreditCard();//Navigate
		bank.debitCard();//click
		bank.CurrentAccount();//enter Data
		bank.SavingAccount();//select option
		
		
	}
	
	public static void message(String name)
	{
		
	}
	public static void sum(int a)
	{
		
	}
	
	
}
