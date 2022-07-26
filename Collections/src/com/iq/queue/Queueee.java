package com.iq.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queueee {
	public static void main(String[] args) {
		Queue<Object> queue=new PriorityQueue<Object>();
		System.out.println(queue.add("Sam"));
		System.out.println(queue.offer(queue));
//		queue.add("Kiran");
//		queue.add(55455.00);
//		queue.add('A');
//		queue.add("Sam");
//		queue.add(null);
//		System.out.println(queue.offer(queue));
//		for (Object object : queue) {
//			System.out.println(object);
//		}
	}

}
