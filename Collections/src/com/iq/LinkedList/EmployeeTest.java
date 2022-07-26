package com.iq.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1=new Employee(1002, "Raghu", 15000.00);
		Employee emp2=new Employee(1001, "Pawan", 25000.00);
		Employee emp3=new Employee(1003, "Madavan", 50000.00);
		LinkedList<Employee> linkedList=new LinkedList<Employee>();
		linkedList.add(emp1);
		linkedList.add(emp2);
		linkedList.add(emp3);
	
//		Collections.sort(linkedList);
//		for (Employee employee : linkedList) {
//		System.out.println(employee);
//			}
		Employee employeeName=searchEmp("Madavan",linkedList);
		if(employeeName==null) {
			System.out.println("Employee Not Found");
		}else {
			System.out.println(employeeName);
		}
		Employee employeeId=searchEmp(1001,linkedList);
		if(employeeId==null) {
			System.out.println("Employee Not Found");
		}else {
			System.out.println(employeeId);
		}
	}

	private static Employee searchEmp(String string, LinkedList<Employee> linkedList) {
		for(Employee emp:linkedList) {
			if(emp.name.equals(string)) {
				System.out.println("Employee Found");
				return emp;
			}
		}
		return null;
	}

	public static Employee searchEmp(int i, LinkedList<Employee> linkedList) {
		for(Employee emp:linkedList) {
			if(emp.id==i) {
				System.out.println("Employee Found");
				return emp;
			}
		}
		return null;
	}

}
