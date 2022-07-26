package com.iq.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayyList {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1001, "Sam", 80000.00);
		Employee employee2 = new Employee(1002, "Vam", 50000.00);
		Employee employee3 = new Employee(1003, "Kanna", 69960.00);
		Employee employee4 = new Employee(1004, "Vamshi", 25000.00);
//		Employee employee5=new   Employee(1004, null, 25000.00);
//		Employee employee6=new   Employee(1004, null, 25000.00);
		Employee employee7=new   Employee(1005, "Vamshi", 25000.00);
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(employee1);
		arrayList.add(employee2);
		arrayList.add(employee3);
		arrayList.add(employee4);
		arrayList.add(employee4);
//		arrayList.add(employee5);
//		arrayList.add(employee6);
//		arrayList.add(employee7);
		Collections.binarySearch(arrayList, employee2);
		System.out.println(arrayList.get(2));
//		Collections.sort(arrayList);
//		for (Employee employee : arrayList) {
//			System.out.println(employee);
//		}
		
//		for (Employee employee: arrayList) {
//			if (employee.geteName().charAt(0) == 'K') {
//				System.out.println(employee);
//			}
//		}
//		for (Employee employee : arrayList) {
//			if(employee.getSalary()>=25000 && employee.getSalary()<80000) {
//				System.out.println(employee);
//			}
//			
//		}
//		for (Employee employee : arrayList) {
//			if(employee.getSalary()>=25000 && employee.getSalary()<=25000) {
//				System.out.println(employee);
//			}
//			
//		}
//		for (Employee employee : arrayList) {
//			if(employee.getSalary()>=80000 && employee.getSalary()<=80000) {
//				System.out.println(employee);
//			}
//			
		}

	}
