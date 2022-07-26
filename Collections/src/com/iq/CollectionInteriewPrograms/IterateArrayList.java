package com.iq.CollectionInteriewPrograms;

import java.util.ArrayList;

//Write a program to traverse (or iterate) ArrayList? (Solution)

// As I already mentioned,you can traverse ArrayList using 
//for loop, while loop, advance for loop and iterator. 
//This question tests knowledge of add() method of 
//ArrayList and looping concept. Below example traverses
//ArrayList using advance for loop:
public class IterateArrayList {
	public static void main(String[] args) {
		// initialize ArrayList  
        ArrayList<Integer> al = new ArrayList<Integer>();
        // add elements to ArrayList object
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        System.out.println("Using Advanced For Loop");   
        // printing ArrayList 
        for (Integer integer : al) {
			System.out.println(integer);
		}
	}

}
