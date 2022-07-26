package com.iq.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class StudentDataTest {
	public static void main(String[] args) {
		StudentData s1=new StudentData(1001, "Sam", 25000.00);
		StudentData s2=new StudentData(1003, "Kiran", 20000.00);
		StudentData s3=new StudentData(1002,"Kamal", 22000.00);
		StudentData s4=new StudentData(1004, "Arjun", 25000.00);
		LinkedList< StudentData> linkedList=new LinkedList<StudentData>();
		linkedList.add(s1);
		linkedList.add(s2);
		linkedList.add(s3);
		linkedList.add(s4);
		Collections.sort(linkedList);
		for (StudentData studentData : linkedList) {
			System.out.println(studentData);
		}
	}

}
