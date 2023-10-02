package SinglyLinkedList;

public class MaximumTwinSum {
	public static class Node{
		int data;
		Node head;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
     
	public static Node reverse(Node head) {
	 Node curr=head;
	 Node prev=null;
	 Node after=null;
	 
	 while(curr!=null) {
		 after=curr.next;
		 curr.next=prev;
		 
		 prev=curr;
		 curr=after;
	 }
		return prev;
		
	}
	
	public  int pairsum(Node head) {
		Node slow=head;
		Node fast=head;
		
		while(fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		Node temp=reverse(slow.next);
		slow.next=temp;
		
		Node p1=head;
		Node p2=slow.next;
		int Maxsum=0;
		
		while(p2!=null) {
			int sum=p1.data+p2.data;
			if(Maxsum<sum) {
				Maxsum=sum;
				
				p1=p1.next;
				p2=p2.next;
			}
		}
		return Maxsum;
		
	}
//	public static void display(Node head) {
//		Node temp=head;
//		while(temp!=null) {
//			System.out.println(temp.data+ "");
//			temp=temp.next;
//		}
//		System.out.println();
//	}
	public static void main(String[] args) {
		
		Node a=new Node(1);
		Node b=new Node(10);
		Node c=new Node(13);
		Node d=new Node(4);
		Node e=new Node(2);
		Node f=new Node(7);
		Node g=new Node(6);
		Node h=new Node(5);
		
		
		
     a.next=b;
     b.next=c;
     c.next=d;
     d.next=e;
     e.next=f;
     f.next=g;
     g.next=h;
     h.next=null;
     
	}

}
