package ExamTest;

import java.util.Scanner;

public class InitializeArray {
	
	static int  countBorderIndex(int arr[][]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==0 ||i==arr[0].length-1||j==0||j==arr[0].length-1) {
					count++;
				}
			}
		}
		return count;
	}
	
	static int sumBorderIndex(int arr[][]) {
		int count =0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				if(i==0||i==arr[0].length-1||j==0||j==arr[0].length-1) {
					count+=arr[i][j];
				}
			}
		}
		
		return count;
		
	}
	
	static void MaxMin(int arr[][]) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==0||i==arr[0].length-1||j==0||j==arr[0].length-1) {
				    
				}
			}
		}
		
		System.out.println("maximum number is:"+max);
		System.out.println("minimum number is:"+min);
	}
	
	
	
	
//    
//	static void printArray(int [][]arr) {
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0;  j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+ " ");
//			}
//			System.out.println();
//		}
//	}
//	

	public static void main(String[] args) {
		
//      int [][]arr = {
//    		  {1,2,3},
//    		  {7,5,6},
//    		  {10,11,9} };
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter row in array");
		int r= sc.nextInt();
		System.out.println("Enter column in array");
		int c= sc.nextInt();
		
		int arr[][]= new int [r][c];
		System.out.println("Enter "+r*c+"Element ");
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	//	System.out.println("_____________");
		
		
		
		
//    printArray(arr);
	int ans=	countBorderIndex(arr);
	System.out.println("Total count  number is: "+ans);
    System.out.println("Total sum of number is"+sumBorderIndex(arr));
    MaxMin(arr);
   
	}

	
}
