package MultidimensionalArray2D;

import java.util.Scanner;

public class InitializeArray {
    
	static void printArray(int [][]arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;  j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	

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
		System.out.println("_____________");
		
		
		
		
      printArray(arr);
      
	}

	
}
