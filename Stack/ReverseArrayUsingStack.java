package Stack;

import java.util.Stack;

public class ReverseArrayUsingStack {

	public ReverseArrayUsingStack() {
		
	}

	public static void main(String[] args) {
		  Stack<Integer>st =new Stack<>();
		  int []array= {1,2,3,4,5};
	         for(int i=0; i<array.length;i++) {
	        	 st.push(array[i]); 
	         }
	        System.out.println(st);
       
	       Stack<Integer>rt=new Stack<>();
	       while(st.size()>0) {
	    	   int x= st.peek(); //called the old stack
	    	   rt.push(x);// push the new stack in old stack
	    	   st.pop();// pop the old stack
	       }
	       
	     System.out.println(rt);  //last print the new stack
	       
	}

}
