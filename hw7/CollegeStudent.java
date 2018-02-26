package hw7;

public class CollegeStudent extends Student {
	int year;
	String major;

	CollegeStudent(String name, int age, String gender, int idNumber, double gpa, int year, String major) {
		super(name, age, gender, idNumber, gpa);
		this.year = year;
		this.major = major;
	}

	CollegeStudent() {
		super();
		this.year = 0;
		this.major = "Uknown";
	}

	public String toString() {
		return super.toString() + ", year: " + year + ", major: " + major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
