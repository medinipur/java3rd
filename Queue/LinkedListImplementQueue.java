package Queue;
public class LinkedListImplementQueue {
	public static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
	}
	public static class queuell{
		Node head=null;
		Node tail =null;
		int size=0;
		
		public void add(int x) {
			Node temp=new Node(x);
			if(size==0) {
				head=tail=temp;
			}
			else {
			tail.next=temp;
			tail=temp;
			}
			size++;
		}
		public int remove() {
			if(size==0) {
				System.out.println("Queue is empty!");
				return -1;
			}
			int x=head.data;
			head=head.next;
			size--;
			return x;
		}
		public int peek() {
			if(size==0) {
				System.out.println("Queue is empty!");
				return -1;
			}
			return head.data;
		}
		public void display() {
			if(size==0) {
				System.out.println("queue is empty");
				return;
			}
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
				
			}
			System.out.println();
		}
		public boolean isEmpty() {
			if(size==0)return true;
			return false;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		queuell ll= new queuell();
		ll.display();
		System.out.println(ll.isEmpty());
		ll.add(1);
		ll.add(2);
		System.out.println(ll.isEmpty());
		ll.add(3);
		ll.add(5);
		ll.display();
		
		

	}


	

}
