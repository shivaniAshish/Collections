package com.iq.LinkedList;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (salary == o.salary) {
			return 0;
		} else if (salary >= o.salary) {
			return 1;
		}else {
			return -1;
		}
	}

	
	}

//	@Override
//	public int compareTo(Employee o) {
//		return name.compareTo(o.name);
//	}

//	@Override
//	public int compareTo(Employee o) {
//		if (id == o.id) {
//			return 0;
//		} else if (id >= o.id) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}


