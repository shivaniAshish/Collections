package com.iq.HasARelationship;

public class Employee {
	int id;
	String name;
	double salary;
	Address address1;
	Address address2;
	public Employee(int id, String name, double salary, Address address1,Address address2) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address1 = address1;
		this.address2=address2;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ",\n address1=" + address1 + ",\n address2="
				+ address2 + "]";
	}
	
	
	
	
	
	
	
	

}
