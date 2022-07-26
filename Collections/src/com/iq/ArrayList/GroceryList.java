package com.iq.ArrayList;

import java.util.ArrayList;

public class GroceryList {
	ArrayList<String> gl = new ArrayList<String>();

	public void add(String item) {
		gl.add(item);
	}

	public void printGroceryList() {
		System.out.println(" you hava  " + gl.size() + " list of items");
		for (int i = 0; i < gl.size(); i++) {
			System.out.println((i + 1) + "." + gl.get(i));
		}
}
	public int searchItem(String currentItem) {
		return gl.indexOf(currentItem);
	}

	public void modifyItem(String currentItem, String newItem) {
		int position = searchItem(currentItem);
		if (position >= 0) {
			modifyItem(position, newItem);
		}

	}

	public void modifyItem(int position, String newItem) {
		position = searchItem(newItem);
		if (position >= 0) {
			gl.set(position, newItem);
			System.out.println((position + 1) + " " + newItem);
		}
	}

	public String remove(int position) {
		return gl.remove(position);
	}

	public static void main(String[] args) {
		GroceryList gorList = new GroceryList();
		gorList.add("butter");
		gorList.add("milk");
		gorList.add("cheese");
//		gorList.printGroceryList();
//		System.out.println(gorList.searchItem("ghee"));
		gorList.modifyItem(0, "Amul butter");
		gorList.printGroceryList();
	}

}

 

