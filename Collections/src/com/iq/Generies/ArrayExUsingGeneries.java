package com.iq.Generies;

import java.io.StreamCorruptedException;

public class ArrayExUsingGeneries {
	public static void main(String[] args) {
		String[] s = new String[4];
//For the String[ ], we can add only String type of Objects.
		s[0] = "Sam";
// By mistake if we are trying to add any other type we will get Compile time
// error.
//		s[1]='A';
//		s[2]=456;
		System.out.println(s);

	}

}
