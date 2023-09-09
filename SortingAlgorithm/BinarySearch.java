package SortingAlgorithm;

import java.util.Scanner;

public class BinarySearch {
	
	




	public int getSearchValue(int serachvalue,int data[]) {
		
		int start=0;
		int end=data.length-1;
		
		while(start<=end) {
			int mid= start+(end-start);
			
			if(serachvalue>data[data.length-1]) {
				System.out.println("data not found");
				return -1;
			}
			if(serachvalue<data[mid]) {
				end=mid-1;
			}
			else if(serachvalue>data[mid])
				start=mid+1;
		
		else {
			return mid;
		}
		
		}
	
		return data[start];
		
	}	
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
	       System.out.println("Enter size of array");
	       int size=sc.nextInt();
	      
	       int number[]=new int[size];
	       for(int i=0; i<size; i++) {
	       	number[i]=sc.nextInt();
	       }
          System.out.println("Enter the number search");
          int n=sc.nextInt();
          BinarySearch obj= new BinarySearch();
        // obj.getSearchValue(),number);
         
	}

}
