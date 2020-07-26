package com.pratmodi.searchlinkedlist;

public class LinkedList {

	Node head;
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public boolean search(Node head, int x) {
		if(head==null)
			return false;
		if(head.data==x) 
		{ 
			return true;
		}
		return search(head.next, x);
	}
	
	public static void main(String[] args) {

LinkedList list = new LinkedList();
		
		/*Use push() to construct below list:
		 14->21->11->30->10 */
		list.push(10);
		list.push(30);
		list.push(11);
		list.push(21);
		list.push(14);
		
		if(list.search(list.head, 11))
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
