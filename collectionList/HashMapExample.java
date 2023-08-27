package collectionList;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public HashMapExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	 HashMap<Integer, String>data = new HashMap<>();
	   
	     data.put(101, "Mercury");
	     data.put(102, "Venus");
	     data.put(103, "Earth");
	     data.put(104, "Mars");
	     data.put(105, "jupitar");
	     data.put(106, "Saturn");
	     data.put(107, "Uranus");
	     
	     data.put(108, "pluto");
	     
	     System.out.println(data.size());
	     
	     System.out.println(data.get(103));
	     
	     System.out.println(data.containsKey(103));
	     
	     System.out.println(data.remove(103));
	     
	     System.out.println(data);
	     System.out.println("__________________________________");
	     
			 
        //entryset() method
	     
	     for(Map.Entry<Integer, String> entry :data.entrySet()) {
	    	 System.out.println(entry.getKey()+":"+entry.getValue());
	     }
	     System.out.println("__________________________________");
	     
	     for(Integer key: data.keySet()) {
	    	 System.out.println(key);
	     }
	     System.out.println("__________________________________");
	     for(String value: data.values()) {
	    	 System.out.println(value);
	     }
	     System.out.println("__________________________________");
	     
	     /*
	      * get the hashcode of the keys with the help of a method "hashcode()"from the object
	      */
	     
	     
	}

}
