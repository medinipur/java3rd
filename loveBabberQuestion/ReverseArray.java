package loveBabberQuestion;

public class ReverseArray {
     
	static void reverse(int []arr, int start, int end) {
		 int temp;
		 
		 while(start<end) {
			 temp=arr[start];
			 arr[start]=arr[end];
			 arr[end]=temp;
			 start++;
			 end--;
			 
			 
		 }
	}
	
	static void printArray(int arr[]) {
	
		for(int i=arr.length-1; i>=0;i--) 
			System.out.print(arr[i]+" ");
		
		System.out.println();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		
		printArray(arr);
		reverse(arr,0,4);
		System.out.println("revrese array");
		printArray(arr);

	}

}
