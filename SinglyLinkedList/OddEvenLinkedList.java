package SinglyLinkedList;

public class OddEvenLinkedList {
	
	public static class Node{
		int data;
		Node head;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
public static Node oddeven(Node head) {
	Node odd=new Node(0);
	Node even=new Node(0);
	
	Node tempodd=odd;
	Node tempeven=even;
	
	Node temp=head;
	
	while(temp!=null) {
		//odd case
		tempodd.next=temp;
		temp=temp.next;
		tempodd=tempodd.next;
		
		//even case;
		tempeven.next=temp;
		if(temp==null)break;
		temp=temp.next;
		tempeven=tempeven.next;
		
	}
	odd=odd.next;
	even=even.next;
	tempodd.next=even;
	return odd;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
