package com.iq.HasSet;

import java.util.HashSet;

public class StudentTest {
	public static void main(String[] args) {
		Student student1=new Student(1003,"Sai" , "MBA");
		Student student2=new Student(1004, "Ramu", "MCA");
		Student student3=new Student(1001, "Mahi", "Bsc");
		Student student4=new Student(1002, "Kamal", "Bcom");
		Student student5=new Student(1002, "Kamal", "Bcom");
		Student student6=new Student(1002, null, null);
		HashSet<Student>  hashSet=new HashSet<Student>();
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		hashSet.add(student5);
		hashSet.add(student6);
//		System.out.println(hashSet+"\n");
		for (Student student : hashSet) {
			System.out.println(student+" ");
		}
	}

}
