
import java.util.Scanner;

public class SecondSmallestArray {
	static int findmin(int[]arr) {
		int min=Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
			}                         //Find the first minimum value of array;
		}
		return min;
	}
	
	static int secondmin(int []arr) {
		int mx=findmin(arr);
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i]==mx) {                //all minimum value as min_value
				arr[i]=Integer.MAX_VALUE;
			}
		}
		int secondmax=findmin(arr);
		return  secondmax;            //then the find second minimum value
	}
       
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter"+n+"Element");
		for(int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
            System.out.println("Second maximum element" +secondmin(arr));    

	}

}
