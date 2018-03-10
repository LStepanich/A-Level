package p1;

public class Main {

	
	
	public static void main(String[] args) {
		University university = new University();
		int ratingForPath = 5;
		Student vasiya = new Student("Vasia","Petrov",Faculties.MATH);
		Exminator vn = new Exminator("Vladimir Nikolayevich", "Petrov");
		university.studentPathExam(vasiya, vn, 5);
		university.studentPathExam(vasiya, vn, 4);
		university.studentPathExam(vasiya, vn, 6);
		university.studentPathExam(vasiya, vn, 50);
		if (university.checkStudent(vasiya, ratingForPath)) {
			university.newStudent(vasiya);
		}
		
	}

}
