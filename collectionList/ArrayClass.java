package collectionList;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
//		int a[]= {1,2,3,4,5,6};
//		int index=Arrays.binarySearch(a, 4);
//		System.out.println("The index of element 4 in the array:"+index);

		
		Integer[]number= {12,3,2,45,30,10};
		Arrays.sort(number);
		
		//Arrays.fill(number, 12);
		for(int i:number) {
			System.out.print(i+" ");
		}
	}

}
