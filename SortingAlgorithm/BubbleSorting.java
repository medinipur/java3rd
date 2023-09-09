package SortingAlgorithm;

import java.util.Scanner;

public class BubbleSorting {
	
    public void print(int arr[]) {
    	for(int i=0; i<arr.length;i++) {
    		System.out.println(arr[i]+" ");
    	}
    	System.out.println();
    }
	public void doBubbleSort(int arr[]) {
		int temp;
		if(arr.length==1) {
			arr[0]=arr[0];
			return;
		}
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length-1-1; j++) {
				if(arr[j]>arr[j+1]) {
					
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        System.out.println("Enter"+size+"element");
        int arr[]=new int[size];
        for(int i=0; i<size; i++) {
        	arr[i]=sc.nextInt();
        }
        	BubbleSorting obj=new BubbleSorting();
           System.out.println("original array");
           obj.print(arr);
           System.out.println("After sorting array");
           obj.doBubbleSort(arr);
           obj.print(arr);
        
        
	}

}
