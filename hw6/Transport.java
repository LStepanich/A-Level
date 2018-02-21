package hw6;

public class Transport {
	private static int quantity=0;
	private int quantityOfPassengers;
	Transport(){
		quantity++;
	}
	public static int getQuantity() {
		return quantity;
	}
	public void getIn(int quantityOfPassengers)
	{
		this.quantityOfPassengers+=quantityOfPassengers; 
	}
	public int getQuantityOfPassengers() {
		return quantityOfPassengers;
	}
	public void setQuantityOfPassengers(int quantityOfPassengers) {
		this.quantityOfPassengers = quantityOfPassengers;
	}
	
}
