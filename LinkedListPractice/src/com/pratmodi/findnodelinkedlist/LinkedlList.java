package com.pratmodi.findnodelinkedlist;

public class LinkedlList {

	Node head;
	
	public int getNth(int index) {
		Node current = head;
		int count =0;
		
		while(current!=null) 
		{
			if(count==index) 
			{
				return current.data;
			}
			count++;
			current=current.next;
		}
		assert(false);
		return 0;
	}
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	public static void main(String[] args) {

		LinkedlList list = new LinkedlList();
		
		list.push(1);
		list.push(4);
		list.push(1);
		list.push(12);
		list.push(1);
		
		System.out.println("element at index 3 is: "+list.getNth(3));
	}

}
