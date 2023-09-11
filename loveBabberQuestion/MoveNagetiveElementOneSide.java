package loveBabberQuestion;

import java.util.Arrays;

public class MoveNagetiveElementOneSide {
	
	public static void movenegative(int arr[]) {
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			while(arr[left]<0)left++;
			while(arr[right]>0)right--;
			
			if(left>=right)break;
			
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
		}
		}
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

	public static void main(String[] args) {
		int arr[]= {-12,11,-13,-5,6,-7,5,-3,-6};
		
		//printArray(arr);
		movenegative(arr);
		System.out.println("negative array one side");
		printArray(arr);
		

	}

}
