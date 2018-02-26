package hw7;

public class Student extends Person {

	private int idNumber;
	private double gpa;

	Student(String name, int age, String gender, int idNumber, double gpa) {
		super(name, age, gender);
		this.idNumber = idNumber;
		this.gpa = gpa;
	}

	Student() {
		super();
		this.idNumber = 0;
		this.gpa = 0;
	}

	public String toString() {
		return super.toString() + ", idNumber: " + idNumber + ", gpa: " + gpa;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
