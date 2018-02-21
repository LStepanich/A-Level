package hw6;

public class Car extends PersonalTransport{
	Car(){
		super(4);		
	}
	Car(int numberofseats){
		super(4,numberofseats);
	}
	Car( int numberofseats,String owner){
		super(4,numberofseats,owner);
	}
	public void getIn(int quantityOfPassengers)
	{
			System.out.println("Как без водителя??????");
		
	}	
}
