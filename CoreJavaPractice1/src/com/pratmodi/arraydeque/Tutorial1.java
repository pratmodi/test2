package com.pratmodi.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Tutorial1 {

	public static void main(String[] args) {

		Deque<Integer> de_que = new ArrayDeque<Integer>(10);

		// add() method to insert
		de_que.add(10);
		de_que.add(20);
		de_que.add(30);
		de_que.add(40);
		de_que.add(50);
		for (Integer element : de_que) {
			System.out.println("Element : " + element);
		}

		System.out.println("Using clear() ");

		// clear() method
		de_que.clear();

		// addFirst() method to insert at start
		de_que.addFirst(564);
		de_que.addFirst(291);

		// addLast() method to insert at end
		de_que.addLast(24);
		de_que.addLast(14);

		System.out.println("Above elements are removed now");

		// Iterator() :
		System.out.println("Elements of deque using Iterator :");
		
		for(Iterator itr = de_que.iterator(); itr.hasNext();)
		{
			System.out.println(itr.next());
		}

	}

}
