package Stack;

import java.util.Iterator;
import java.util.Stack;


public class Example01 {

	public Example01() {
		
	}

	public static void main(String[] args) {
		//Creating a Stack
		 Stack<String> stackOfCards = new Stack<>();
		 
         //Pushing new item to the stack
		 stackOfCards.push("Jack");
		 stackOfCards.push("Queen");
		 stackOfCards.push("King");
		 stackOfCards.push("Ace");
		 
		 System.out.println("Stack =>"+ stackOfCards);
		 
		 //Check if the Stack is empty
		 System.out.println("is Stack empty?:"+ stackOfCards.isEmpty());
		 //Find the size of stack
		 System.out.println("Size of stack:"+ stackOfCards.size());
		 //Popping items from the stack 
		 String cardAtTop= stackOfCards.pop();
		 //Throws Empty StackException if the stack is empty
		 System.out.println("Stack.pop()=>"+cardAtTop);
		 System.out.println("Current Stack =>"+stackOfCards);
		 
		 System.out.println();
		 
		 //get the item at the top of the stack without removing it
		 cardAtTop=stackOfCards.peek();
		 System.out.println("stack.peek()=>"+cardAtTop);
		 System.out.println("Current Stack =>"+stackOfCards);
		 
		 
		 //Search for an element 
		 //The search()method returns the 1-based position of the element from the top of the stack
		 //it returns -1 if the element was not found in the stack
		 
		 int positon =stackOfCards.search("Queen");
		 
		 if (positon !=-1) {
			 System.out.println("Found the element \"queen\"at positon :"+positon);
		 }
		 else {
			 System.out.println("Element not found ");
		 }
		 
		 /*
		  * iterating over a Stack
		  */
		 
		   Iterator<String> cardsIterator = stackOfCards.iterator();
		   
		  
		   while(cardsIterator.hasNext()) {
			   String card = cardsIterator.next();
			   System.out.println(card);
			   
		   }


	}

}
