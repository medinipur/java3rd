package collectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class TraverseExample {

	public static void main(String[] args) {
		ArrayList<String>_traverse = new ArrayList<>();
		_traverse.add("Durgesh");
		_traverse.add("subha");
		_traverse.add("Moumita");
		_traverse.add("pabitra");
		_traverse.add("Rurdra");
		
		// using for-each loop 
		for(String str: _traverse) {
			System.out.print(str +"\t"+str.length()+"\t");
			
			StringBuffer br=new StringBuffer(str);
			System.out.println(br.reverse());
		}
		
		System.out.println("_________________________________");
		//
		Iterator<String> itr= _traverse.iterator();
		while(itr.hasNext()) {
			String next=itr.next();
			System.out.println(next);
		}
		
		
		
	}

}
