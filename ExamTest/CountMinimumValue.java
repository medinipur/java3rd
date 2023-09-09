package ExamTest;

import java.util.Arrays;
import java.util.Scanner;

public class CountMinimumValue {
	
	public void CountValue(int[]arr) {
		Arrays.sort(arr);
		int ans=0;
		int min=arr[0];
		
		
		for(int i=0; i<arr.length;i++) {
			if(min<arr[i]) {
				break;
			}
			if(min==arr[i]) {
				ans++;
			}
		}
		System.out.println(min+ "frequency value :"+ans);
		
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
	CountMinimumValue obj=new CountMinimumValue();
	obj.CountValue(arr);
	}
	
}

//find max 
