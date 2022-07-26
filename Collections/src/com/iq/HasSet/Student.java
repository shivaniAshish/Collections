package com.iq.HasSet;

import java.util.Objects;

public class Student {
	int stdId;
	String stdName;
	String course;
	public Student(int stdId, String stdName, String course) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.course = course;
	}
	
	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, stdId, stdName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && stdId == other.stdId && Objects.equals(stdName, other.stdName);
	}
	
	

}
