package Function;
//Learning Constructor
public class CarUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1=new Car();
		car1.colour="Black";
		car1.colour="Blue";

		car1.capacity=6;
		car1.features();
		
		
		Car car2=new Car();
		car2.colour="White";
		car2.capacity=5;
		car2.features();
		
		Car car3=new Car();
		car3.colour="Red";
		car3.capacity=7;
		car3.features();
		
		Car car4=new Car("White",5);
		car4.features();
		
	}

}
