package p4;

public class Password {
	private int counter;
	private String password;
	Password(String password){
		this.password=password;
		counter=1;
	}
	public void increaseCounter(){
		counter++;
	}
	public int getCounter() {
		return counter;
	}
	public String getPassword() {
		return password;
	}
	
}
