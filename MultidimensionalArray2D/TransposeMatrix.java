package MultidimensionalArray2D;

import java.util.Scanner;

public class TransposeMatrix {
	static void Matrix(int [][]matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
		
		System.out.println();
}
	}

	static int [][]findTranspose(int [][]matrix, int r, int c){
		int [][] ans= new int [c][r];
		for(int i=0; i<c; i++) {
			for(int j=0; j<r; j++) {
				ans[i][j]=matrix[j][i];
			}
		}
		return ans;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column of matrix");
		int r=sc.nextInt();
		int c= sc.nextInt();
		int [][]matrix=new int [r][c];
		int totalElement=r*c;
		System.out.println("Enter"+totalElement+"Element");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("input matrix");
		Matrix(matrix);
         System.out.println("Transpose matrix");
         int [][]ans =findTranspose(matrix, r, c);
         Matrix(ans);
	}

}
