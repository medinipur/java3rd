package Linkedlits;

public class SinglyLinkedList {
	
	class Node{
		int data;
		Node next;
		//constructor of node 
		Node(int d){
			data=d;
			next=null;
		}
	}
	Node head;
	
	public SinglyLinkedList() {
		head = null;
	}
   public Node insertNode(int data) {
	   //using constructor to create memory and value
	   Node new_node=new Node(data);
	   
	   //current head become this new_node next
	   new_node.next=head;
	   
	   //changing head to this newly created node
	   head=new_node;
	   
	   return head;
   }
	public void delate() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		System.out.println("Deleted:"+head.data);
		head=head.next;
	}
	
	public Node insertBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next=head;
		
		return head=newNode;
		
	}
	
	
	
	
	public int size(Node node) {
		int size=0;
		while(node!=null) {
			node= node.next;
			size++;
		}
		return size;
	}
	
	
	public void display() {
		Node node= head;
		
		while(node!=null) {
			System.out.print(node.data+" ");
			node=node.next;

		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SinglyLinkedList obj= new SinglyLinkedList();
       obj.insertNode(25);
       obj.insertNode(20);
       obj.insertNode(15);
       obj.insertNode(10);
       obj.insertNode(5);
       
       obj.display();
       
       
       
	}

}
