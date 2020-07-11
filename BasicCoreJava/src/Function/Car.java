package Function;
//Learning constructor
public class Car {

	String colour;
	int capacity;
	
	public void features()
	{
		System.out.println("Car Features are="+colour+" and Capacity is"+capacity);
	}
	
	public Car(String colour,int capacity)
	{
		//global=local variable
this.colour=colour;
this.capacity=capacity;

	}
	public Car()
	{
		
	}
}
