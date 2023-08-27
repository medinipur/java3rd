package Stack;

import java.util.Iterator;
import java.util.Stack;

public class ArrayToStack {

	public ArrayToStack() {
	
	}

	public static void main(String[] args) {
	//	ArrayToStack obj= new ArrayToStack();
		
         Stack<Integer> objs= new Stack<>();
         
         int []array= {1,2,3,4,5};
         for(int i=0; i<array.length;i++) {
        	 objs.push(array[i]); 
         }
        System.out.println(objs);
        
        
        
        //objs.pop();
        System.out.println(objs.size());
        int size=objs.size();
        for(int i=0;i<size;i++) {
        	objs.pop();
        }
        System.out.println(objs);
        if(!objs.isEmpty() ) {
        	System.out.println(objs.peek());
        }
        
       
        
        
  
        System.out.println(objs.isEmpty());
        
        for(int i=0; i<array.length;i++) {
        	objs.push(array[i]);
        }
       int position= objs.search(2);
        System.out.println(objs.search(2));
       if (position!=-1) {
    	   int result=0;
    	   for(int i=0;i<position; i++) {
    		  result= objs.pop();
    	   }
    	   System.out.println("result:"+result);
       }
       System.out.println(objs.peek());
       Iterator<Integer>objIte= objs.iterator();
       
       while(objIte.hasNext()) {
    	   Integer data=objIte.next();
    	   System.out.println(data);
       }
       
       
       
       
       
       
	}

}
