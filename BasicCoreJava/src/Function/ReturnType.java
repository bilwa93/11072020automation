package Function;

public class ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int add=sum(10,20);
		System.out.println(add);
		boolean c=eligible(10);
		System.out.println(c);
		//not required to write(c==true)
		if(c)
		{
			System.out.println("you are eligible");
		}
		else
		{
			System.out.println("You are not eligible");
		}
	}

	
	public static int sum(int a,int b)
	{
		return a+b;
	}
	public static boolean eligible(int age)
	{
		if(age>=18)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
}
