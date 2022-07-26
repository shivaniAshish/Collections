package com.iq.vector;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push("sam");
		stack.push(" kamal");
		stack.push(47845);
		stack.push('S');
		stack.push(453631.00);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.empty());
	}

}
