package Stack;

import java.util.Scanner;
import java.util.Stack;

public class copyStackOnSameOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in) ;
		Stack<Integer> st= new Stack<>();
//		int n;
//		System.out.println("Enter the number element inser");
//		
//		n=sc.nextInt();
//		System.out.println("Enter the element : ");
//		for(int i=0; i<n; i++) {
//			int x=sc.nextInt();
//			st.push(x);
//		}
//	  System.out.println(st);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		System.out.println(st);
		
		//System.out.println(st.size());
		
		//reverse order
		Stack<Integer>gt=new Stack<>();
		while(st.size()>0) {
			gt.push(st.pop());
		}
		Stack<Integer>rt=new Stack<>();
		while(gt.size()>0) {
			rt.push(gt.pop());
		}
		System.out.println(gt);
	}

}
