package Leetcode;

import java.util.Arrays;


public class sortThePeople {
	 public static String[] sortPeople(String[] names, int[] heights) {
		 for(int i=0; i<names.length; i++) {
			 for(int j=i+1; j<heights.length;j++) {
				 if(heights[i]<heights[j]) {
					 int temp=heights[i];
					 heights[i]=heights[j];
					 heights[j]=temp;
					 String temp1=names[i];
					 names[i]=names[j];
					 names[j]=temp1;
				 }
				
			 }
		 }
		return names;
	 }
	public static void main(String[] args) {
		  String[] names = {"Alice", "Bob", "Charlie", "David"};
	        int[] heights = {165, 180, 170, 175};

	        String[] sortedNames = sortPeople(names, heights);

	        System.out.println("Sorted names based on heights:");
	        System.out.println(Arrays.toString(sortedNames));

	}

}
