package SinglyLinkedListInterview;

public class InsertAt02 {
	
	public static class Node{
		int data;
		Node head;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	public static class linkedList{
		
		Node head=null;
		Node tail=null;
		
		void insertAt(int index, int val) {
			Node t=new Node(val);
			Node temp=head;
			
			for(int i=0; i<index-1;i++) {
				temp=temp.next;
			}
			t.next=temp.next;
			temp.next=t;
		}
		
		void display() {
			Node temp=head;
			if(temp!=null) {
				System.out.println(temp.data+" ");
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList obj=new linkedList();
		obj.insertAt(2,10);
		obj.display();
		
	}

}
