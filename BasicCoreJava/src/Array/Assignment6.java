package Array;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create an array to store fruits name
		//Create an array to store prices
		//Create an array to excel values(10 by 5) 10 row 5 columns
//use For loop to read
		
		String[] fruitName= {"Mango","Apple","Banana","PineApple"};
		for(String a:fruitName)
		{
			System.out.print(a + " ");
		}
		System.out.println();
	double[] Prices= {550,599.99,1000.20,1500};
		for(double b:Prices)
		{
			System.out.print(b + " ");
		}
		int[][] data=new int[10][5];
		int[] row= {1,2,3,4,5,6,7,8,9,10};
		int[] col= {1,2,3,4,5};
		
		
		for(int b:row)
		{
			for(int c:col)
			{
				System.out.print(c + " ");
			}
			System.out.println();
				
		}
		
		
		/*
		
		
		
		
		
		
		
		
		
		
		
		
		for(int a=1;a<row.length;a++)
		{
			for(int b=0;b<col[a].length;b++)
			{
				System.out.print(data[r][c]+" ");
			}
			System.out.println();
		}
		
		for(int b:ids)
		{
		
		*/
	}

}
