package SinglyLinkedListInterview;

public class ReverseLinkedList {
	
	public static class Node{
		
		int data;
		Node head;
		 Node next;
		 Node(int data){
			 this.data=data;
		 }
	}
	public static Node reverse(Node head) {
		if(head.next==null) return head;
			Node newhead=reverse(head.next);
			head.next.next=head;
			head.next=null;
			return newhead;
		
	}
	public static void display(Node head) {
		if(head==null) {
			System.out.println();
			return;
		}
		System.out.print(head.data+" ");
		display(head.next);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Node a=new Node(3);
       Node b=new Node(5);
       Node c=new Node(1);
       Node d=new Node(2);
       Node e=new Node(4);
        
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       e.next=null;
        display(a);
       Node r=reverse(a);
       display(r);
	}

}
