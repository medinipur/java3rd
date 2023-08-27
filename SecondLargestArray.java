import java.util.Scanner;

public class SecondLargestArray {
	static int findmax(int[]arr) {
		int mx=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i]>mx) {
				mx=arr[i];
			}                         //Find the first maximum value of array;
		}
		return mx;
	}
	
	static int secondmax(int []arr) {
		int mx=findmax(arr);
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i]==mx) {                //all maximum value as min_value
				arr[i]=Integer.MIN_VALUE;
			}
		}
		int secondmax=findmax(arr);
		return  secondmax;            //then the finde second maximum value
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
            System.out.println("Second maximum element" +secondmax(arr));    

	}

}
