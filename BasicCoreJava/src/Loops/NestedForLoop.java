package Loops;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int rows=0;rows<=10;rows++)
		{			for (int cols=0; cols<=10;cols++)
			{
				//System.out.println("Row No="+rows+ "and Column number="+cols );
				
				//System.out.print(rows+" ");gives Wrong o/p
				System.out.print(cols + " ");
			}
			System.out.println();
		}
		
	
	}

}
