package com.jsp.array;
import java.util.Scanner;

public class BubbleSort {
	
   public static void main(String args[]) {
	   
	   int arr[]= {45,23,5,76,32,13};
		int temp=0;
		
		//Displaying the array in original order
		System.out.println("Element of array in original order");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
      //sort the array in ascending order
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		//Displaying elements of array after sorting
		System.out.println("Element of array in ascending order");
		for(int i =0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
   }
}


			
		



