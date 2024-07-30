package com.mvc;

public class StudentController {

	private Student s;
	private StudentView v;

	public StudentController(Student s, StudentView v) {
		this.s = s;
		this.v = v;
	}

	public void setStudentName(String name) {
		s.setName(name);
	}

	public String getStudentName() {
		return s.getName();
	}

	public void setStudentId(int id) {
		s.setId(id);
	}

	public int getStudentId() {
		return s.getId();
	}

	public void setStudentGrade(String grade) {
		s.setGrade(grade);
	}

	public String getStudentGrade() {
		return s.getGrade();
	}

	public void updateView() {
		v.displayStudentDetails(s.getName(), s.getId(), s.getGrade());
	}

}
