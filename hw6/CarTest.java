package hw6;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car(4);
		PersonalTransport secondcar = new Car();  
		car.getIn(8,"Gogi");
		System.out.println(car.getDriver());
		System.out.println(car.getOwner());
		System.out.println(car.getNumberofseats());
		System.out.println(car.getNumberofwheels());
		System.out.println(car.getQuantity());
		
	}

}
