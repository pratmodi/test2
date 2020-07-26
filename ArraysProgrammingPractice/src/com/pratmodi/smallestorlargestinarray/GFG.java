package com.pratmodi.smallestorlargestinarray;

import java.util.Arrays;

public class GFG {

	public static int kthSmallest(Integer[] arr, int k) {
		Arrays.sort(arr);
		
		return arr[k-1];
	}
	
	public static void main(String[] args) {

		Integer arr[] = {12,3,5,7,19};
		int k=2;
		System.out.println("Kth smallest element is: "+kthSmallest(arr, k));
		
	}

}
