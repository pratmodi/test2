package com.pratmodi.rightrotate;

public class GFG {

	static void reverseArray(int[] arr, int start, int end) {
		
		int temp;
		
		while(start<end) 
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	static void rightrotate(int[] arr, int d, int n) {
		reverseArray(arr, 0, n-1);
		reverseArray(arr, n-1, d-1);
		reverseArray(arr, d, n-1);
	}
	
	static void printArray(int[] arr,int size) {
		for(int i=0;i<size;i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		int n =arr.length;
		int d=3;
		
		rightrotate(arr, d, n);
		printArray(arr, n);
		
	}

}
