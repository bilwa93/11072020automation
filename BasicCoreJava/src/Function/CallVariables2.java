package Function;

public class CallVariables2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables2 ref=new Variables2();
		
		//Change Values
		ref.name="NewBilwa";//Static
		ref.name2="NewPrachee";//Non static
		
		//Create New Object
		Variables2 ref2=new Variables2();
		
		//Call all variables again
		System.out.println(ref2.name);//New Bilwa
		System.out.println(ref.name);//New Bilwa
		System.out.println(ref2.name2);//Prachee
		System.out.println(ref.name2);//NewPrachee
		
	}

}
