package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StackExample {

	private static Scanner input;
	private int N;

	private int[] data;

	private List<Integer> iListData;

	
	private Stack<Integer> stack;

	private boolean isStackCreated;
	private boolean isDataEntered;
	
	
	static {
		input = new Scanner(System.in);
	}
	
	
	public StackExample(int N) {
	
		N = input.nextInt();
		this.N = N;
		
		//List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
	}
	
	
	public int getN() {	return N;	}
	
	public int[] getData() {	return data;	}

	public List<Integer> getListData() {	return iListData;	}
	
	
	
	
	public void createStack() {
		
		stack = new Stack<>();
		System.out.println(stack.capacity());		//DEFAULT 10
		System.out.println(stack.size());			//INITIAL 0
		
		this.isStackCreated = true;

	}
	public boolean isStackCreated() {	return isStackCreated;	}
	
	
	
	public void addData(int[] data) {
		
		//Enter data to an Array then pass to a List		
		data = new int[N];
		iListData = new ArrayList<>();
		
		
		System.out.print("Data: ");
		System.out.println(getN());
		
		for(int i=0; i<getN(); i++) {
			data[i] = input.nextInt();
		}
		
		this.data = data;
		
		for (int value : data) {
			iListData.add(Integer.valueOf(value));
	    }
		
		
		this.isDataEntered = true;

		
	}
	public boolean isDataEntered() {	return isDataEntered;	}
	
	
	
	
	public void addDataToStack(List<Integer> data) {
		
		this.isDataEntered = false;
		
		stack.addAll(data);

		this.isDataEntered = true;

		
	}
	
	
	//OPERATIONS
	/*
	 * pop()
	 * push(i)
	 * peek()
	 * 
	 * isEmpty()
	 * 
	 * search(i)			- to search for an element and get its distance from the top. If the object is not found, search() will return -1.
	 * 
	 * indexOf(i)			- it will always find the index of the element that's closest to the top of the stack.
	 * lastIndexOf(i)
	 * 
	 * removeElement(i)		- to remove the first occurrence of the given element.
	 * removeElementAt(i)	- to delete elements under a specified index in the Stack.
	 * 
	 * removeAll(iList)		- it will take a Collection as an argument and remove all matching elements from the Stack.
	 * clear()				- same as removeAll(iList)
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	private int pop() {
		return stack.pop();
	}
	
	private void push() {
		System.out.print("PUSH: ");
		int value = input.nextInt();
		stack.push(Integer.valueOf(value));
	}
	
	private Integer peek() {
		return stack.peek();
	}
	
	
	
	public void showAllValuesInStack() {
		
		System.out.println("Size: " + stack.size());
		while(stack.size() != 0 ) {
			System.out.println("PEEK: " + peek());			
			pop();
		}
		
	}
	
	
	
	
	
	//DRIVER CODE
	public static void main(String[] args) {
	System.out.println("code run and ready");
		int N = 0;
		int[] data = {};
		
		StackExample obj = new StackExample(N);
		

		
		obj.createStack();
		
		if(obj.isStackCreated()) {
			
			System.out.println("Stack is created.");

			obj.addData(data);
			
			if(obj.isDataEntered()) {
			
				System.out.println("Data is entered successfully.");
				
				obj.addDataToStack(obj.getListData());
				
				if(obj.isDataEntered()) {
					

					obj.showAllValuesInStack();
					
					
					
				}
				
				
			}else {
				
				System.out.println("Error: Data was not entered in the list.");
				
			}
			
			
			
		}else {
			
			System.out.println("Stack is not created.");

		}
		
		
		
		
	}

}




/*

12
10
0
Stack is created.
Data: 12
1 2 3 4 5 1 2 3 4 5 1 2 3 4 5
Data is entered successfully.
Size: 12
PEEK: 2
PEEK: 1
PEEK: 5
PEEK: 4
PEEK: 3
PEEK: 2
PEEK: 1
PEEK: 5
PEEK: 4
PEEK: 3
PEEK: 2
PEEK: 1

*/