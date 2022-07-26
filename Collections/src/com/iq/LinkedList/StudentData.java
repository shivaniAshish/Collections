package com.iq.LinkedList;

public class StudentData implements Comparable<StudentData> {
	int id;
	String name;
	double fee;
	public StudentData(int id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
//	@Override
//	public int compareTo(StudentData o) {
//		if(id==o.id) {
//			return 0;
//		}else if(id>=o.id) {
//			return 1;
//		}else {
//			return -1;
//		}
//	}
//	
	@Override
	public int compareTo(StudentData o) {
		if(fee==o.fee) {
			return 0;
		}else if(fee>=o.fee) {
			return 1;
		}else {
			return -1;
		}
		
	}




}
