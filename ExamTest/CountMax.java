package ExamTest;

import java.util.Arrays;
import java.util.Scanner;

public class CountMax {
	public void maxvalue(int []arr) {
		Arrays.sort(arr);
		//int max=0
		int ans=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[arr.length-1]>arr[i]) {
				break;
			}
			
			if(arr[arr.length-1]==arr[i]) {
				ans++;
			}
		}
		System.out.println(arr[arr.length-1]+ "value is: "+ans);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		System.out.println("Enter the number of element");
		int arr[]=new int[size];
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		CountMax obj=new CountMax();
	obj.maxvalue(arr);
	}
	
}
