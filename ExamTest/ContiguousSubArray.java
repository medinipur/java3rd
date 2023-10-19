package ExamTest;

public class ContiguousSubArray {
	
	
	
	public int getMaximumSumOfSubarray() {
		for(int i=0;i<N; i++) {
			local_maximum=Math.max(arr[i], arr[i]+local_maximum);
			System.out.print(local_maximum+ " ");
			
			if(local_maximum > global_maximum) {
				global_maximum=local_maximum;
			}
		 System.out.println();
		}
		return global_maximum;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
