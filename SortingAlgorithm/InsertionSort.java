package SortingAlgorithm;

import java.util.Scanner;

public class InsertionSort {
	public void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public void doInsertionSort(int arr[]) {
		if(arr.length==1) {
			arr[0]=arr[0];
			return;
		}
		
		for(int i=1; i<arr.length; i++) {
			for(int j=i; j>0; j--) {
				
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
      System.out.println("Enter size of array");
      int size=sc.nextInt();
      System.out.println("Enter "+size+"Element");
      int arr[]=new int[size];
      for(int i=0; i<arr.length; i++) {
    	  arr[i]=sc.nextInt();
      }
      
     
      InsertionSort obj = new InsertionSort();
      System.out.println("original array");
      obj.print(arr);
      System.out.println("After sorting array");
      obj.doInsertionSort(arr);
      obj.print(arr);
      
	}

}
