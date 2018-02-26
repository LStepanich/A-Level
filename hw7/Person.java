package hw7;

public class Person {
	private String name, gender;
	private int age;

	Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	Person() {
		this.name = "Unknown";
		this.age = 0;
		this.gender = "Unknown";
	}

	public String toString() {
		return name + ", age: " + age + ", gender: " + gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
