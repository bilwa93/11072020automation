package Array;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using multidimentional array
String[][] data=new String[5][2];
//Row 1
data[0][0]="user1";
data[0][1]="Password1";
//Row 2
data[1][0]="user2";
data[1][1]="Password2";
//Row 3
data[2][0]="user3";
data[2][1]="Password3";
//Row 4
data[3][0]="user4";
data[3][1]="Password4";
//Row 1
data[4][0]="user5";
data[4][1]="Password5";

for(int r=0;r<data.length;r++)
{
	for(int c=0;c<data[r].length;c++)
	{
		System.out.print(data[r][c]+" ");
	}
	System.out.println();
}


		/*int[][] number=new number[7][10];
		//Row 1
		data[0][0][0][0][0][0][0][0][0][0]=1;
		data[0][1][2][3][4][5][6][7][8][9]=2;
		//Row 2
		data[1][1][1][1][1][0][0][0][0][0]=1;
		data[0][1][2][3][4][5][6][7][8][9]=2;
		//Row 3
		data[0][0][0][0][0][0][0][0][0][0]=1;
		data[0][1][2][3][4][5][6][7][8][9]=2;
		//Row 4
		data[0][0][0][0][0][0][0][0][0][0]=1;
		data[0][1][2][3][4][5][6][7][8][9]=2;
		//Row 5
		ddata[0][0][0][0][0][0][0][0][0][0]=1;
		data[0][1][2][3][4][5][6][7][8][9]=2;

*/


	}

}
