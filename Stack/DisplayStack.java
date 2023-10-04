package Stack;

import java.util.Stack;

public class DisplayStack {
	
	public static void reverseDisplay(Stack<Integer> st) {
		if(st.size()==0)return;
		int top=st.pop();
		System.out.println(top+"");
		reverseDisplay(st);
		st.push(top);
	}
	public static void Displayrec(Stack<Integer> st) {
		if(st.size()==0)return;
		int top=st.pop();
		Displayrec(st);
		System.out.println(top+"");
		
		st.push(top);
	}

	public static void main(String[] args) {
		
Stack<Integer>st=new Stack<>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		Displayrec(st);
//		Stack<Integer>rt=new Stack<>();
//		while(rt.size()>0) {
//			rt.push(st.pop());
//		}
//		while(rt.size()>0) {
//			int x=rt.pop();
//			System.out.print(x+" ");
//			st.push(x);
//		}
//		System.out.println(st);
		
		
//		int n=st.size();
//		int arr[]=new int[n];
//		for(int i=n-1; i>=0; i--) {
//			int x=st.pop();
//			arr[i]=x;
//		}
//		for(int i=0; i<n; i++) {
//			int x=arr[i];
//			st.push(x);
//		}
//    System.out.println(st);
	}

}
