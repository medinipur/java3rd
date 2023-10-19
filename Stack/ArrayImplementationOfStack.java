package Stack;

public class ArrayImplementationOfStack {
	public static  class Stack{
		 private int arr[]=new int[50];
         private int index=0;
         public void push(int x) {
        	 if(isFull()) {
        		 System.out.println("Stack is full");
        		 return;
        	 }
        	 arr[index]=x;
        	 index++;
         }
         
         public int peek() {
        	 if(index==0) {
        		 System.out.println("Stack is empty");
        		 return -1;
        	 
         }
        	 return arr[index-1];
		
		
	}
         public int pop() {
        	 if(index==0) {
        		 System.out.println("Stack is empty");
        		 return -1;
        	 
         }
        	 int top=arr[index-1];
        	 arr[index]=0;
        	 index--;
        	 return top;
         }
         public void display() {
        	 for(int i=0; i<=index-1; i++) {
        		 System.out.print(arr[i]+" ");
        	 }
        	 System.out.println();
         }
         
         public int size() {
        	 return index;
         }
         
         boolean isEmpty() {
        	 if(index==0)return true;
        	 else return false;
        		 
        	 
         }
         boolean isFull() {
        	 if(index==arr.length)return true;
        	 
        	 else return false;
         }
	}
	public static void main(String[] args) {
		Stack st=new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(7);
        st.push(0);
        System.out.println(st.isFull());
        st.push(100);
        
      
	}


}