package StackInterviewQuestion;

import java.util.Stack;

public class prefixToPostfixExpression {

	public static void main(String[] args) {
	   
		String prefix= "-9/*+5346";
		System.out.println(prefix);
	
	Stack<String>val = new Stack<>();
	for(int i=prefix.length()-1; i>=0; i--) {
		char ch=prefix.charAt(i);
		int ascii=(int)ch;
		if(ascii>=48 && ascii<=57) {
			String s=""+ch;
			val.push(s);
		}
		else {
			String v1=val.pop();
			String v2=val.pop();
			char op= ch;

			String t=v1+v2+op;
			val.push(t);
			
			
		}
	}
	String postfix=val.pop();
	System.out.println(postfix);
	
	
	
       
	}

}
