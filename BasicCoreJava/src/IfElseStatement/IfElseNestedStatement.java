package IfElseStatement;

public class IfElseNestedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		int c=30;
		//a is greatest
		if(a<b)
		{
			if(b<c)
			{
				System.out.println("a is greatest");
			}
			
		}	
		
		//e is greatest
		int d=10;
		int e=20;
		int f=30;
		
		if (e>d)
		{
			if(d<f)
			{
				System.out.println("e is greatest-");
			}
		}
		
		int g=10;
		int h=20;
		int i=30;
		if(i>h)
		{
			if(i>g)
			{
				System.out.println("i is greatest");
			}
		}
		
		
		
	}

}
