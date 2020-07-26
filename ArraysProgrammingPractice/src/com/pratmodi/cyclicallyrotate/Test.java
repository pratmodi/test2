package com.pratmodi.cyclicallyrotate;

import java.util.Arrays;

public class Test {

	 static int[] arr = {1,2,3,4,5};
	
	static void rotate() {
		int x = arr[arr.length-1];
		int i;
		for(i=arr.length-1;i>0;i--) 
		{
			arr[i]=arr[i-1];
		}
		arr[0]=x;
	}
	
	public static void main(String[] args) {

		System.out.print("Given array is:");
		System.out.println(Arrays.toString(arr));
	
		rotate();
		
		System.out.print("Rotated array is: ");
		System.out.println(Arrays.toString(arr));
		
	}

}
