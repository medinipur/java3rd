package SlidingWindow;

public class SlidingWindows {
	

	 public static int maxSubarraySum(int []arr,int k) {
		 if(arr==null|| arr.length==0||k>arr.length) {
			 return -1;
		 }
		 int maxSum=0;
		 int currentSum=0;
		 
		 for(int i=0;i<k;i++ ) {
			 currentSum+=arr[i];
		 }
		 maxSum=currentSum;
		 
		 for(int i=k; i<arr.length;i++) {
			 
			 currentSum-=arr[i-k];
	
			 currentSum+=arr[i];
			 
			 if(currentSum>maxSum) {
				 maxSum=currentSum;
			 }
		 }
		 return maxSum;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {2,1,5,6,8,9};
    int k=3;
   System.out.println(maxSubarraySum(arr,k));
	}

}
