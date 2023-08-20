package com.jsp.array;

public class InsertionSort {

	public static void main(String[] args) {
     int arr[]={7,8,1,3,5,6};
          System.out.println("Elements in original order");
      for(int i=0; i<arr.length;i++) {
          System.out.print(arr[i]+ " ");
     }
        int res[]=SortedArray(arr);
           System.out.println();
           System.out.println("Elements in ascending order");
       for(int i=0;i<res.length;i++) {
    	   System.out.print(res[i]+ " "); 
       }
	}
	public static int[] SortedArray(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int current=arr[i];
			int j=i-1;
		while(j>=0 && current<arr[j]) {
			arr[j+1]=arr[j];
			j--;
		 }
		arr[j+1]=current;
		}
		return arr;
	}

}
