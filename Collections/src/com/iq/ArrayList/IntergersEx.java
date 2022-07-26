package com.iq.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IntergersEx {
	public static void main(String[] args) {
		ArrayList<Integer> aList=new ArrayList<>();
		aList.add(2);
		aList.add(3);
		aList.add(1);
		aList.add(9);
		aList.add(11);
		aList.add(40);
		
		int sum=0;
		for(int i=0;i<aList.size();i++) {
			sum= sum + aList.get(i);
		}
		System.out.println("Sum Of the Numbers: "+sum);
		System.out.println("Even Numbers: ");
		for(int i=0;i<aList.size();i++) {
			if(aList.get(i)%2==0) {
				System.out.print(aList.get(i)+" ");
			}
		}
		System.out.println("\nOdd Numbers: ");
		for(int i=0;i<aList.size();i++) {
			if(aList.get(i)%2!=0) {
				System.out.print(aList.get(i)+" ");
			}
			
			
		}
		System.out.println("\nPrime Numbers: ");
		for (int i = 0; i <aList.size(); i++) {
			int count=0,j=1;
			while(j<=aList.get(i)) {
				if(aList.get(i)%j==0) {
					count++;
				}
				j++;
			}
			if(count==2) {
				System.out.print(aList.get(i)+" ");
		}
			
		}
//		Collections.sort(aList);
//		for (Integer integer : aList) {
//			System.out.print(integer);
//		}
	}

}
