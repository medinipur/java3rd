package collectionList;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String>_objHashset = new HashSet<String>();
		
		
		_objHashset.add("Apple");
		_objHashset.add("Mango");
		_objHashset.add("orange");
		_objHashset.add("chokolet");
		_objHashset.add("Biskut");
		
		//Adding duplicate value
		_objHashset.add("Mango");
		_objHashset.add("orange");
		
		//Adding null value
		_objHashset.add(null);
		_objHashset.add(null);
		
		//1)Using iterator
		Iterator<String> it=_objHashset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//without using iterator
		for(String temp:_objHashset) {
			System.out.println(temp);
		}
		
		_objHashset.remove(0);
		_objHashset.clear();

		
		System.out.println(""+_objHashset);
		
		

	}

}
