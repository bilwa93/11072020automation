package IfElseStatement;

public class IfElseStatementLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//And Operator
		int age=18;
		boolean voterID=true;
		if(age>=18 && voterID)
		{
			System.out.println("You are Eligible");
		}
		else
		{
			System.out.println("You are not Eligible");
		}
		
		//OR Operator
		
		boolean pancard=true;
		boolean aadharcard=true;
		
		if(pancard || aadharcard)
		{
			System.out.println("Create Bank Account");
		}
		else
		{
			System.out.println("Do not Create bank account");
		}
		
		/*! Not  operator wrong code
		boolean Visa=false;
		boolean Passport=false;
		if!(Visa && Passport)
		{
			System.out.println("Not allowed to travel");
		}
		else 
		{
			System.out.println("Travel");
		}
		*/
			
		
		
	}

}
