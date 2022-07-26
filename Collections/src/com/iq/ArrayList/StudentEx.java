package com.iq.ArrayList;

public class StudentEx implements Comparable<StudentEx>  {
	int stdId;
	String stdName;
	String stdCourse;
	public StudentEx(int stdId, String stdName, String stdCourse) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdCourse = stdCourse;
	}
//	@Override
//	public int compareTo(StudentEx o) {
//		if(stdId==o.stdId) {
//			return 0;
//			}else if(stdId>o.stdId) {
//				return 1;
//			}else {
//				return -1;
//			}
//	}
//	@Override
//	public int compareTo(StudentEx o) {
//		return stdName.compareTo(o.stdName);
//		
//		}
	
	@Override
	public int compareTo(StudentEx o) {
		return stdCourse.compareTo(o.stdCourse);
	}

//	public int getStdId() {
//		return stdId;
//	}
//
//	public void setStdId(int stdId) {
//		this.stdId = stdId;
//	}
//
//	public String getStdName() {
//		return stdName;
//	}
//
//	public void setStdName(String stdName) {
//		this.stdName = stdName;
//	}
//
//	public String getStdCourse() {
//		return stdCourse;
//	}
//
//	public void setStdCourse(String stdCourse) {
//		this.stdCourse = stdCourse;
//	}

	
	@Override
    public String toString() {
		return "StudentEx [stdId=" + stdId + ", stdName=" + stdName + ", stdCourse=" + stdCourse + "]";
	}

	
}
