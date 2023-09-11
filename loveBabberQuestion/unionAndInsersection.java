package loveBabberQuestion;

public class unionAndInsersection {
	
	public static void dounion(int arr1[],int arr2[],int n,int m) {
		int i=0;
		int j=0;
		
		while(i<m &&j<n) {
			if(arr1[i]<arr2[j]) {
				System.out.print(arr1[i++]+" ");
			}
			else if(arr1[i]>arr2[j]) {
				System.out.print(arr2[j++]+" ");
			}
			else {
				System.out.print(arr2[j++]+" ");
				i++;
			}	
				
		}
		while(i<m)
			System.out.print(arr1[i++]+" ");
		while(j<n)
			System.out.print(arr2[j++]+" ");
	           
		
	}
	
	public static void doinsection(int arr1[],int arr2[],int n,int m) {
		int i=0;
          int j=0;
		
		while(i<m &&j<n) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				j++;
			}
			else {
				System.out.print(arr2[j++]+" ");
				i++;
			}	
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int []arr1= {1,3,4,5,7};
         int []arr2= {2,3,5,6};
         
         int n=arr1.length;
         int m=arr2.length;
         System.out.println("Union are:");
         dounion(arr1,arr2,m,n);
         
         System.out.print("Intersection are:");
         doinsection(arr1,arr2,m,n);
         
         
         
	}

}
