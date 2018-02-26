package hw7;

public class Main {

	public static void main(String[] args) {

		Person[] academy = new Person[5];

		Person man = new Person("Bob", 25, "male");

		academy[0] = man;
		academy[1] = new CollegeStudent();
		academy[2] = new Student("Kolia", 19, "female", 2398754, 23.4214);
		academy[3] = new Teacher("Ivan Petrovich", 81, "male", "History", 3700.45);
		academy[4] = new CollegeStudent("Vasia", 20, "male", 123456, 12.21, 2, "Astronomy");

		for (Person person : academy) {
			System.out.println(person.toString());
		}
	}

}
