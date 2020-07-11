package Function;

public class CallVariables {

	public static void main(String[] args) {
		//to call static variables
		//System.out.println(Variables.name);
			
		//to call Non static variables
		Variables reference=new Variables();
		//System.out.println(reference.name2);
			
		//Assigning new value to name 1 and name 2 
		reference.name="Ajinkya";
		reference.name2="Aniket";
		//Create New object
		Variables reference2=new Variables();
		
		//System.out.println(Variables.name);
		System.out.println(reference2.name);
		System.out.println(reference.name);		
		System.out.println(reference2.name2);
		System.out.println(reference.name2);
	}

}
