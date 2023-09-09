package SortingAlgorithm;

import java.util.Scanner;

public class QuickSort {
//  private int n;
//  private int[]number;
//  
//  public QuickSort(int n) {
//	  this.n=n;
//  }
	
	public void doquickSort(int[]number, int lowIndex, int highIndex) {
		if(lowIndex>=highIndex){
			return;
		}
		
		int pivot =number[highIndex];
		
		int leftPointer=lowIndex;
		int rightPointer=highIndex;
		
		while(leftPointer<rightPointer) {
		while(number[leftPointer] <=pivot && leftPointer < rightPointer) {
				leftPointer ++;
			}
			while(number[rightPointer] >=pivot && rightPointer > leftPointer) {
				rightPointer --;
			}
			swap(number, leftPointer, rightPointer);
		}
		swap(number, leftPointer , highIndex);
		
		doquickSort(number, lowIndex, leftPointer-1);
		doquickSort(number,leftPointer+1, highIndex);
	}
	
	
	
	public void swap(int []number, int index1, int index2) {
		int temp= number[index1];
		number[index1]=number[index2];
		number[index2]=temp;
	}
	
	
	public void print(int []number) {
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i]+" ");
		}
			System.out.println();
	
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter size of array");
     int size=sc.nextInt();
     System.out.println("Enter"+size+"element");
     int number[]=new int[size];
     for(int i=0; i<size; i++) {
     	number[i]=sc.nextInt();
     }
     QuickSort obj=new  QuickSort();
        System.out.println("original array");
        obj.print(number);
        System.out.println("After sorting array");
        obj.doquickSort(number,0,size-1);
        obj.print(number);

	}

}
