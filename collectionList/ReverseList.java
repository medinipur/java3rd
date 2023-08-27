package collectionList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {

	//static void arrayreverseList(ArrayList<Integer>obj){
		
		//int i=0, j=obj.size()-1;
		
		
		// while(i<j) {
			/*
			 * int temp=a;
			 * a=b;
			 * b=temp;
			 * 
			 * Swap the element with arraylist
			 */
			// Integer temp = Integer.valueOf(obj.get(i));
		 //    obj.set(i, obj.get(j));
		 //    obj.set(j, temp);
		 //    i++;
		 //    j--;
			 
			
	//	}
		
	// }

	public static void main(String[] args) {
	
		
		ArrayList<Integer> obj =new ArrayList<>();
		
		obj.add(0);
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		
		System.out.println("Original List: "+obj);
		Collections.reverse(obj);
		System.out.println("Reverse List:"+obj);
		
		
		Collections.sort(obj);
		System.out.println("Ascending order "+obj);
		
		Collections.sort(obj,Collections.reverseOrder());
		System.out.println("Desc order:"+obj);
		
		

	}

}
