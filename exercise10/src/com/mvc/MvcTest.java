package com.mvc;

public class MvcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = retrieveStudentFromDatabase();

		StudentView v = new StudentView();

		StudentController sc = new StudentController(s, v);

		sc.updateView();

		sc.setStudentName("John Doe");
		sc.setStudentGrade("A");

		sc.updateView();
	}

	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setId(1);
		student.setGrade("B");
		return student;

	}

}
