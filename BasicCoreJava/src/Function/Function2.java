package Function;

public class Function2 {

	public static String name="bilwa";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(10,20);
		sum(20,30);
		sum(40,50);
		sum(10,20,30);
		message("Bilwa");
		eligibility("Anand",32);
		eligibility("Prachee",17);
		System.out.println(name);
		
	}
	public static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	
	//whenever we have two or multiple functions with same name with different number of parameters then it is called as method overloading
	public static void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void message(String name)
	{
		System.out.println("Welcome" +name);
		
	}
	public static void eligibility(String name,int age)
	{
		if (age>18)
		{
			System.out.println("You are Eligible"+"  "+name+   " as your age is"  + age);	
			
		}
		else
		{
			System.out.println("You are not Eligible"+"  "+name +" as your age is"+ age);
		}
		
	}
	
	
	
}
