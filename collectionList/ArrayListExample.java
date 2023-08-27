package collectionList;

import java.util.ArrayList;



public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> _arrayList = new ArrayList<String>();
		
		_arrayList.add("pabitra");
		
		_arrayList.add("subha");
		_arrayList.add("Rurdra");
		_arrayList.add("lucy");
		
		
	  System.out.println("Arralist is :"+_arrayList);
	  
	  // Adding "pabitra"  at the fourth position 
	  _arrayList.add(3,"pabitra"); 
	  System.out.println("Adding value of fourth position: "+_arrayList);
	  
	  //Removing element 
	  _arrayList.remove("pabitra");
	  _arrayList.remove("lucy");
	  System.out.println("Remove value:"+_arrayList);
	  
	  _arrayList.remove(2);
	  System.out.println(_arrayList);
	  
	  _arrayList.set(1, "Tom");
	  System.out.println("SET:"+_arrayList);
	  
	  String str =_arrayList.get(1);
	  System.out.println(":::::"+str);
	  
	  int pos = _arrayList.indexOf("Tom");
	  System.out.println("pos :"+pos);
	  
	  int numberofitems=_arrayList.size();
	  System.out.println("Number of Items:"+numberofitems);
	  
	  
	  
	  boolean isValueAvailable =_arrayList.contains("Tom");
	  
	  if(isValueAvailable) 
		  System.out.println("Yes,I do have it.");
		  else 
			  System.out.println("pardon me. I will get tomorrow");
		  
	  _arrayList.clear();
	  
	  System.out.println(_arrayList);

	  }
	  
	}
