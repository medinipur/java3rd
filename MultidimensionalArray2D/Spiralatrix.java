package MultidimensionalArray2D;

import java.util.Scanner;

public class Spiralatrix {
	
	

	static void printMatrix(int [][]arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void printSpiralOrder(int [][]arr, int row, int col) {
		int toprow=0, buttonrow=row-1, leftcol=0, rightcol=col-1;
		int totalElement=0;
		while( totalElement<row*col) {
			
			
			/*
			 * row=i;
			 * column=j;
			 */
			//top row->left column to right  column
			for(int i=leftcol ;i<=rightcol &&  totalElement<row*col; i++ ) {
				System.out.println(arr[toprow][i]+" ");
				 totalElement++;
			}
			toprow++;
			
			//right column->top row to button row
			for(int j=toprow; j<=buttonrow && totalElement<row*col;j++) {
				System.out.println(arr[j][rightcol]+" ");
				 totalElement++;
			}
			rightcol--;
			
			//button row-> right column to left column
			for(int i=rightcol;i>=leftcol&&  totalElement<row*col; i--) {
				System.out.println(arr[buttonrow][i]+" ");
				 totalElement++;
			}
			buttonrow--;
			//left column->button row to top row
			for(int j=buttonrow;j>=toprow&&  totalElement<row*col;j--) {
				System.out.println(arr[j][leftcol]+" ");
				 totalElement++;
			}
			leftcol++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row  and col sprial matrix");
		
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][]arr=new int [row][col];
		int total=row*col;
		System.out.println("Enter" +total+ "value");
		for(int i=0; i<row;i++) {
			for(int j=0; j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		
	System.out.println("Input matrix");
	printMatrix(arr);
	
	System.out.println("spiral order");
	printSpiralOrder(arr, row, col);
	}

}
