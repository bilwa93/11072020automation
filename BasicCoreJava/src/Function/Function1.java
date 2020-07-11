package Function;

public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//call function inside main function
		sum();
		
	}
	//4 types of access modifiers
	
	//Public		//Static 					//void										//Anything except 		//Any Data type(primitive/Non primitive)
	//private		//No Keyword(Non static)	//any data type(primitive/non Primitive		//reserved keywords
	//Protected
	
	
	//Access Modifier//nature of method			//Return types								//Name of your method		//Parameters
	public 				static 						void 									sum							(			)//signature of method
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
				int c=30;
				System.out.println(b+c);
				int d=40;
				int e=50;
				System.out.println(d+e);
				
	}

}
