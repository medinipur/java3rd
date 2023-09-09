package SortingAlgorithm;

import java.util.Scanner;

public class SelectionSort {
	/*
	 * print the result
	 */
	 public void print(int arr[]) {
	    	for(int i=0; i<arr.length;i++) {
	    		System.out.println(arr[i]+" ");
	    	}
	    	System.out.println();
	    }
	 
	 /*
	  * selection sort logic 
	  */
	 public void doselectionSort(int n[]) {
		 if(n.length==1) {
			 n[0]=n[0];
			 return;
		 }
		 for(int i=0; i<n.length; i++) {
			 int index=i;
			 for(int j=i+1; j<n.length;j++) {
				
				if(n[j] <n[index]) {
					 index=j;
					 
				 }
			 }
			
			int temp=n[index];
			 n[index]=n[i];
			 n[i]=temp;
		 }
	 }
	 
	 public static void main(String[]args) {
		 Scanner sc= new Scanner(System.in);
	        System.out.println("Enter size of array");
	        int size=sc.nextInt();
	        System.out.println("Enter"+size+"element");
	        int arr[]=new int[size];
	        for(int i=0; i<size; i++) {
	        	arr[i]=sc.nextInt();
	        }
	        SelectionSort obj=new SelectionSort();
	           System.out.println("original array");
	           obj.print(arr);
	           System.out.println("After sorting array");
	           obj.doselectionSort(arr);
	           obj.print(arr);
	 }

	
}
