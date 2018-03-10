package p1;

public class Student {
	private String name;
	private String surname;
	private double avaregeRating = 0;
	private int	numberOfExams = 0;
	private Faculties faculty;

	Student(String name, String surname, Faculties faculty) {
		this.name = name;
		this.surname = surname;
		this.faculty = faculty;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public void putMark(int mark) {
		avaregeRating = (avaregeRating * numberOfExams + mark) / (numberOfExams + 1);
		numberOfExams++;
	}

	public double getAvaregeRating() {
		return avaregeRating;
	}

	public Faculties getFaculty() {
		return faculty;
	}
}
