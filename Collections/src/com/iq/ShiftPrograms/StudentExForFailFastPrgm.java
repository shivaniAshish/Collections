package com.iq.ShiftPrograms;

public class StudentExForFailFastPrgm {
	int rollno;
	String name;
	String course;
	public StudentExForFailFastPrgm(int rollno, String name, String course) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "StudentExForFailFastPrgm [rollno=" + rollno + ", name=" + name + ", course=" + course + "]";
	}
	
	

}
