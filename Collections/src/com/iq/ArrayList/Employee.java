package com.iq.ArrayList;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	int eId;
	String eName;
	double salary;
	public Employee(int eId, String eName, double salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Empoyee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + "]";
	}
	
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	@Override
	public int compareTo(Employee o) {
	if(eId==o.eId) {
		return 0;
	}else if(eId>o.eId){
		return 1;
	}else {
		return -1;
	}
	
	}
	

}
