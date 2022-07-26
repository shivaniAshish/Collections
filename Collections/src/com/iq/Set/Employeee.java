package com.iq.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employeee {
	int eId;
	String eName;
	double salary;
	public Employeee(int eId, String eName, double salary) {
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
//	public int hashCode() {
//		//return Objects.hash(eId, eName, salary);
//		return eId;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employeee other = (Employeee) obj;
//		return eId == other.eId && Objects.equals(eName, other.eName)
//				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
//	}
//	
	
	
}

