package p1;

import java.util.ArrayList;

public class University {
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Exam> exams = new ArrayList<Exam>();

	public void newStudent(Student student) {
		students.add(student);
		System.out.println("Студент " + student.getName() + " принят");
	}

	public void studentPathExam(Student student, Exminator exminator, int mark) {
		Exam exam = new Exam(student, exminator, mark);
		exams.add(exam);
	}

	public boolean checkStudent(Student student, int rating) {
		if (student.getAvaregeRating() > rating) {
			return true;
		}
		return false;
	}
}
