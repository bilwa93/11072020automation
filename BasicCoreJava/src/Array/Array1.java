package Array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// single variable we can store multiple data types

		String[] student = new String[10];
		student[0] = "Name1";
		student[1] = "Name2";
		student[2] = "Name3";
		student[3] = "Name4";
		student[4] = "Name5";
		student[5] = "Name6";
		student[6] = "Name7";
		student[7] = "Name8";
		student[8] = "Name9";
		student[9] = "Name10";
		// System.out.println(student[0]);
		// System.out.println(student[1]);
		// System.out.println(student[2]);
		// System.out.println(student[3]);
		// System.out.println(student[4]);

		//System.out.println(student[9]);
//using for
		for (int i = 0; i < 10; i++) {
			System.out.println(student[i]);
		}
		
		//using string length and one dimentional array
		System.out.println(student.length);
		
		for (int j = 0; j < student.length; j++) 
		{
			System.out.println(student[j]);
		}
		
		
		
		
		
		
		
	}

}
