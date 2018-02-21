package hw6;

public class PersonalTransport extends Transport{
	private int numberofwheels=0;
	private int numberofseats=0;
	private String owner,driver; 
	
	PersonalTransport(){
		numberofwheels=2;
		owner="Unknown";
		numberofseats=1;
	}
	PersonalTransport(int numberofwheels){
		this.numberofwheels=numberofwheels;
	}
	PersonalTransport(int numberofwheels, int numberofseats){
		this.numberofwheels=numberofwheels;
		this.numberofseats=numberofseats;
	}
	PersonalTransport(String owner){
		this.owner=owner;
	}
	PersonalTransport(int numberofwheels, int numberofseats,String owner){
		this.numberofwheels=numberofwheels;
		this.numberofseats=numberofseats;
		this.owner=owner;
	}
	public void getIn(int quantityOfPassengers, String driver)
	{
		super.getIn(quantityOfPassengers);
		if (super.getQuantityOfPassengers()>numberofseats){
			System.out.println("Не влазим ))))))");
		}
		this.driver=driver;	
	}
	public int getNumberofwheels() {
		return numberofwheels;
	}
	public void setNumberofwheels(int numberofwheels) {
		this.numberofwheels = numberofwheels;
	}
	public int getNumberofseats() {
		return numberofseats;
	}
	public void setNumberofseats(int numberofseats) {
		this.numberofseats = numberofseats;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
}
