  package SortingAlgorithm;

import java.util.Scanner;

public class MergeSort {
	



public void doMargeSort(int []number) {
	int inputLength=number.length;
	if(inputLength<=1) {
		return ;
	}
	
	
	int midIndex=inputLength/2;
	int[]leftHalf= new int [midIndex];
	int []rightHalf=new int[inputLength-midIndex];
	
	for(int i=0; i<midIndex; i++) {
		leftHalf[i]=number[i];
	}
	
	for(int i=midIndex; i<inputLength; i++) {
		rightHalf[i-midIndex]=number[i];
	}
	
	doMargeSort(leftHalf);
	doMargeSort(rightHalf);
	
	mergeSort(number, leftHalf, rightHalf);
	
	
}
public void mergeSort(int []inputArray, int[]leftHalf, int[]rightHalf) {

	
	int leftSize=leftHalf.length;
	int rigthSize=rightHalf.length;
	int i=0,j=0,k=0;
	
	while(i<leftSize && j<rigthSize) {
		if(leftHalf[i]<=rightHalf[j]) {
		 inputArray[k++]=leftHalf[i++];
		}else {
			inputArray[k++]=rightHalf[j++];
		}
}

	while(i<leftSize) {
		inputArray[k++]=leftHalf[i++];

	}
		
	while(j<rigthSize) {
		inputArray[k++]=rightHalf[j++];
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
