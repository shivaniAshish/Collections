package com.iq.Generies;

public class MyArrayList <E>{

	private int size;
	private Object[] elements;

	public MyArrayList() {
		this.elements = new Object[10];
		this.size = 0;
	}
	public void add(E obj) {
		if(size>=elements.length) {
			throw new ArrayIndexOutOfBoundsException("Sixe is more than Elements");
		}
		for(int i=0;i<elements.length;++i) {
			Object[] newElements=new Object[size+10];
			newElements[i]=elements[i];
			elements[i]= obj;
		}
		++ size;
	}
	public static void main(String[] args) {
		MyArrayList<Integer> arrayList=new MyArrayList();
		arrayList.add(1234);
//		arrayList.add("Kamal");
		arrayList.add(4321);
	}

}
