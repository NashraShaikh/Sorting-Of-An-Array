package com.jsp.array;

public class SortAsc {

	public static void main(String[] args) {
		
		int arr[]= {5,45,12,64,76,84,35,32,65,97,26};
		int temp=0;
		
		//Displaying the array in original order
		System.out.println("Element of array in original order");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
       //sort the array in ascending order
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
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