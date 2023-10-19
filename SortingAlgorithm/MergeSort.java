  package SortingAlgorithm;

import java.util.Scanner;

public class MergeSort {
	

/*
 * Merge sort logic
 */

public void doMargeSort(int []number) {
	int n=number.length;
	if(n<=1) {
		return ;
	}
	
	
	int mid=n/2;
	int[]leftHalf= new int [mid];
	int []rightHalf=new int[n-mid];
	
	for(int i=0; i<mid; i++) {
		leftHalf[i]=number[i];
	}
	
	for(int i=mid; i<n; i++) {
		rightHalf[i-mid]=number[i];
	}
	
	doMargeSort(leftHalf);
	doMargeSort(rightHalf);
	
	mergeSort(number, leftHalf, rightHalf);
	
	
}
public void mergeSort(int []arr, int[]leftHalf, int[]rightHalf) {

	
	int leftSize=leftHalf.length;
	int rigthSize=rightHalf.length;
	int i=0,j=0,k=0;
	
	while(i<leftSize && j<rigthSize) {
		if(leftHalf[i]<=rightHalf[j]) {
		 arr[k++]=leftHalf[i++];
		}else {
			arr[k++]=rightHalf[j++];
		}
}

	while(i<leftSize) {
		arr[k++]=leftHalf[i++];

	}
		
	while(j<rigthSize) {
		arr[k++]=rightHalf[j++];
	}
	
}	
public void print(int[]number) {
	for(int i=0; i<number.length;i++) {
		System.out.print(number[i]+" ");
	}
	System.out.println();
}
	

public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
       System.out.println("Enter size of array");
       int size=sc.nextInt();
       System.out.println("Enter"+size+"element");
       int number[]=new int[size];
       for(int i=0; i<size; i++) {
       	number[i]=sc.nextInt();
       }
       MergeSort obj=new  MergeSort();
          System.out.println("original array");
          obj.print(number);
          System.out.println("After sorting array");
          obj.doMargeSort(number);
          obj.print(number);
	}

}
