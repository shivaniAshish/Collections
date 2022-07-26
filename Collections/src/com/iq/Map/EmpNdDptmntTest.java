package com.iq.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmpNdDptmntTest {
	public static void main(String[] args) {
		EmployeeWithMap e1 = new EmployeeWithMap(101, "Sam", 25000.00);
		EmployeeWithMap e2 = new EmployeeWithMap(102, "Ram", 40000.00);
		DepartmentWithMap d1 = new DepartmentWithMap(2, "Developer");
		DepartmentWithMap d2 = new DepartmentWithMap(1, "Manager");
		Map<EmployeeWithMap, DepartmentWithMap> map = new HashMap<EmployeeWithMap, DepartmentWithMap>();
		map.put(e1, d1);
		map.put(e2, d2);
		System.out.println(map.get(e1));
		
//		System.out.println(map);
//		for (HashMap.Entry entry : map.entrySet()) {
//			System.out.println(entry.getValue());
//		}
//		Set set = map.entrySet();
//		Iterator itr = set.iterator();
//		while (itr.hasNext()) {
//			Map.Entry m1 = (Map.Entry) itr.next();
//			System.out.println(m1.getValue());
//		}
//
	}

}
