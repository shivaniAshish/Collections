package com.iq.HasARelationship;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeMapTest {
	public static void main(String[] args) {
		Department deptHR = new Department(100, "HR", "Hyd");
		Department deptIT = new Department(101, "IT", "Hyd");
		Department deptHR2 = new Department(102, "HR", "Pune");
		Department deptIT2 = new Department(103, "IT", "Chennai");

		EmployeeMap admin = new EmployeeMap(101, "anil", 155000.00, deptIT);
		EmployeeMap lead = new EmployeeMap(101, "anil", 155000.00, deptIT);
		EmployeeMap Manager = new EmployeeMap(101, "anil", 155000.00, deptIT);
		EmployeeMap developer = new EmployeeMap(101, "anil", 155000.00, deptIT);
		EmployeeMap sd = new EmployeeMap(101, "anil", 155000.00, deptIT);
		EmployeeMap recruiter = new EmployeeMap(101, "rakesh", 60000.00, deptHR);
		EmployeeMap hr = new EmployeeMap(102, "mahesh", 85000.00, deptHR);
		EmployeeMap recruiter2 = new EmployeeMap(103, "sachin", 65000.00, deptHR2);
		EmployeeMap hr2 = new EmployeeMap(104, "usha", 75000.00, deptHR2);
		EmployeeMap developer2 = new EmployeeMap(105, "vinnu", 35000.00, deptIT2);
		EmployeeMap developer3 = new EmployeeMap(106, "radha", 25000.00, deptIT2);
		EmployeeMap sd2 = new EmployeeMap(107, "balu", 66000.00, deptIT);

		Map<EmployeeMap, String> employees = new HashMap<>();
		employees.put(recruiter, " Hr Recruiter");
		employees.put(recruiter2, "Hr Recruiter from Pune");
		employees.put(Manager, " It Manager");
		employees.put(admin, "Technical Admin");
		employees.put(lead, "Technical Lead");
		employees.put(sd, "Senior Developer");
		employees.put(developer, " Developer");
		employees.put(hr, "Hr Administration");
		employees.put(hr2, "Hr Administration FRom Pune");
		employees.put(sd2, "Senior Developer");
		employees.put(developer2, " Developer");
		employees.put(developer3, " Developer ");
//		System.out.println(employees);

//		for (EmployeeMap employee : employees.keySet()) {
//			if (employee.getDepartment().getLocation().equals("Pune")) {
//				System.out.println(employee);
//			}

//		Iterator<Map.Entry<EmployeeMap, String>> iterator = employees.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Entry entry = (Entry) iterator.next();
//			String list = ((java.util.Map.Entry<EmployeeMap, String>) entry).getValue();
//			for (EmployeeMap emp : list) {
//				if (emp.getDepartment().getDeptName().equals("HR")) {
//					System.out.println(emp);
//				}
//			}
		Set s1 = employees.entrySet();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			List<EmployeeMap> l1 = (List) m1.getKey();
			for (EmployeeMap emp : l1) {
				System.out.println("Anil role------");
				if (emp.name.equals("anil")) {
					System.out.println(m1.getValue());
				}
			}

		}
	}

}
