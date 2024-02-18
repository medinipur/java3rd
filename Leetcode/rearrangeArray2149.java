package Leetcode;

import java.util.Scanner;

public class rearrangeArray2149 {
	public static int[]rearrangeArray(int[] nums) {
		int ans[]=new int[nums.length];
		int positive=0, negative=1;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>0) {
				ans[positive]=nums[i];
				positive+=2;
			}else {
				ans[negative]=nums[i];
				negative+=2;
			}
		}
		return ans;
		
		}

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the size of Array");
	   int size=sc.nextInt();
	   
      int arr[]=new int[size];
      for(int i=0; i<size; i++) {
    	  arr[i]=sc.nextInt();
      }
       for(int val:rearrangeArray(arr)) {
    	   System.out.print(val+" ");
       }
	}

}
