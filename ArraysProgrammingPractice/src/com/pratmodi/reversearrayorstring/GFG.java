package com.pratmodi.reversearrayorstring;

public class GFG {

	public static void reverseArray(int[] arr, int start, int end) {
		int temp;
		
		while(start<end) 
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void printArray(int[] arr, int size) {
		
		for(int i=0;i<size;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {

		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		System.out.println("The array is: ");
		printArray(arr, arr.length);
		reverseArray(arr,0, 9);
		printArray(arr, arr.length);
		
	}

}
