
public class ArraySum {
      void ArraySum() {
    	  int []arr= {1,5,3};
    	  int sum=0;
    	  
    	  for(int i=0; i<3 ;i++) {
    		  sum =sum+arr[i];
    		  
    	  }
    	 System.out.println(sum);
      }
	 
	public static void main(String[] args) {
		ArraySum obj=new ArraySum();
		obj.ArraySum();

	}

}
