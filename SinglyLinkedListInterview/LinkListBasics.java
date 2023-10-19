package SinglyLinkedListInterview;

public class LinkListBasics {
	
	public static class Node{
		int data; //value
		Node next; //address of next node
		
		Node(int data){
			this.data=data;
		}
	}
	

	public static void insertAtEnd(Node head, int val) {
		Node temp=new Node(val);
		Node t=head;
		
		while(t.next!=null) {
			t=t.next;
		}
		t.next=temp;
	}
	
	
	public static void display(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	  // Display recursively
	public static void displayre(Node head) {
		if(head==null) 
			return;
		displayre(head.next);
	    System.out.print(head.data+" ");
	
		
	
	}
//	public static int length(Node head) {
//		int count=0;
//		while(head!=null) {
//			count++;
//		head=head.next;
//		}
//		return count;
//	}
//	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(5);
		Node b=new Node(3);
		Node c=new Node(9);
		Node d=new Node(8);
		Node e=new Node(16);
		
     
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
//		System.out.println(a.data);
//		System.out.println(a.next.data);
//		System.out.println(a.next.next.data);
//		System.out.println(a.next.next.next.data);
//		System.out.println(a.next.next.next.next.data);
//		
//	
//		display(a);
//		System.out.println();
//		System.out.println("Reverse order:");
//		displayre(a);
		
		//System.out.println(length(a));
		insertAtEnd(a,87);
		
		display(a);
	}

}
