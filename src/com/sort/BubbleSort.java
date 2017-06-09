package com.sort;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 
 * @author gayathri.guttikonda
 * 
 * Bubble sort algorithm is comparison based algorithm in which each pair of adjacent elements is compared and elements are swapped if they are not in order 
	Logic for Bubble Sort Algorithm
		1. Compare adjacent elements (n) and (n+1), starting with n=1.  
		2. If the first is greater than the second, swap them
		3. Repeat this for each pair of adjacent elements, starting with the “first two elements”, and ending with the “last two elements”
		4. At any point, the last element should be the largest
		5. Repeat the steps for all elements except the last one
		6. Keep repeating for one fewer element each time, until you have no more pairs to compare

 *
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int n = scan.nextInt();
		System.out.println("Enter the elements");
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();
		
		System.out.println(Arrays.toString(arr));
		
		int temp;
		
		for(int i=0; i<n; i++){
			for(int j=n-1; j>0; j--){
				if(arr[j] < arr[j-1]){
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		System.out.println("Array after sorting:");
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
