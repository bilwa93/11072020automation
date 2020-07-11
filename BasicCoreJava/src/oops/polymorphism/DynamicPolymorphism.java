package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.Smartphone;
import oops.inheritance.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Smartphone obj=new Smartphone();
		
		//Reference= Object
		
		//Mobile obj2=new Smartphone();
		
		//Telephone obj3=new Smartphone();
		//Parent=child
		
			
	//	obj3.calling();
		
		
		//Smartphone obj4=new Mobile();
		
		//We can not use reference of child class for object of parent class
		
		Telephone obj4;//Web driver
		//we can use this reference for mobile,telephone and smartphone
		/*obj4=new Telephone();
		obj4.calling();
		
		obj4=new Mobile();//Chrome Driver
		obj4.calling();
		
		obj4=new Smartphone();//Firefox Driver
		obj4.calling();
		*/
		Telephone obj41=null;
		String browserName="Firefox";
		
		if(browserName.equals("Chrome"))
			
		{
			obj41=new Mobile();
			
		}
		else if(browserName.equals("Firefox"))
		{
		obj41=new Smartphone();//Firefox	
		}
		
		//Script Start
		obj41.calling();
		}
		
		
		
		
		
	

}
