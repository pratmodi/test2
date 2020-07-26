package com.pratmodi.lengthoflinkedlist;

public class LinkedList {

	Node head;
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next=head;
		head = new_node;
	}
	
	public int getCount() {
		Node temp = head;
		int count=0;
		
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public static void main(String[] args) {

	}

}
