package com.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author gayathri.guttikonda
 * 
 * In-place comparison based algorithm in which the list is divided into two parts, sorted part at left end and unsorted part at right end
	1. Find the smallest element in the array
	2. Exchange it with the element in the first position
	3. Find the second smallest element and exchange it with the element in the second position
	4. Continue until the array is sorted

 *
 */
public class SelectionSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scan.nextInt();
		System.out.println("Enter the elements");
		
		int[] arr = new int[n];
		
		for(int i=0; i< n; i++)
			arr[i] = scan.nextInt();
		
		System.out.println(Arrays.toString(arr));
		int temp;
		
		for(int i=0; i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[j] < arr[i]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Array after sorting:");
		System.out.println(Arrays.toString(arr));

	}

}
