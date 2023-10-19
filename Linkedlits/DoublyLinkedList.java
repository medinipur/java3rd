package Linkedlits;

public class DoublyLinkedList {
          
	class Node{
		int data;
		Node next,prev;
		
		Node(int x){
			data=x;
			next=prev=null;
		}
	}
	Node head;
	
	public DoublyLinkedList() {
		head=null;
	}
	
	//insert node at start
 public Node insertNodeAtStart(int data) {
	 Node new_node= new Node(data);
	 
	 //current head becomes  this new node next
	 
	 new_node.next=head;
	 new_node.prev=null;
	 
	 if(head!=null) {
		 head.prev=new_node;
	 }
	 head=new_node;
	 return head;
 }
  
 
 //delete node
 
      public void delateNode() {
    	 Node temp=head;
    	 
     	 if(head==null) {
   		 System.out.println("Nothing delete , the doubly linked list is empty");
		 return;
	 }
     	 
     	 if(temp.next==null) {
		 System.out.println(temp.data+" deleted");
		 head=null;
		 return;
		 
     	 }

	 head=head.next;
	 head.prev=null;
	 
	 System.out.println(temp.data+" deleted");
 }
 
 
// show LinkedList
      
 public void showLinkedList() {
	 Node head_node=head;
	 Node tail_node=null;
	 
	 System.out.print("\nIn Forward Direction");
	 while(head_node!=null) {
		 System.out.print(head_node.data+ " ");
	     tail_node=head_node;
		 head_node=head_node.next;
	 }
	 
	 //BackWord means(reverse) 
	 
	 System.out.print("\nIn Backword Direction");                                                      
	 while(tail_node!=null) {
		 System.out.print(tail_node.data+ " ");
		 tail_node=tail_node.prev;
	 }
	 
	 System.out.println("\n");
 }
 
 

 
   public static void main(String[] args) {
		DoublyLinkedList  obj= new DoublyLinkedList ();
		for( int i=0; i<100; i+=10){
			obj.insertNodeAtStart(i);
		}
		
		obj.delateNode();
		obj. showLinkedList();

	}

}
