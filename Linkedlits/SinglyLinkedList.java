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
	Node head;  //head1 head2
	//object head 
	
	public SinglyLinkedList() {
		head = null; //head1 =null head =null
	
	}
	
   public Node insertNode(int data) {
	   //using constructor to create memory and value
	   Node new_node=new Node(data);                      //head1  same to head2
	   
	   //current head become this new_node next
	   new_node.next=head;
	   
	   //changing head to this newly created node
	   head=new_node;						
	   
	   return head;
   }

	public void delate(Node head) {
	
		
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
	
   
   public Node insertNodeAtLast(int data) {
	   Node new_node= new Node(data);
	   
	   if(head==null) {
		   head=new_node;
	   }
	   else {
		   Node temp=head;
		  
		   while(temp.next!=null)
			   temp=temp.next;
		   
		   temp.next=new_node;
	   }
	   return head;
   }
  
   
   
   public void insertAfter(int position, int data) {
	   int size=size(head);
	   
	   if(position <1 || position > size) {
		   System.out.println("you can insert this node at the desired position");
	   }
	   else{
		   Node new_node =new Node(data);
		   Node temp=head;
		   
		   while(--position>1) {
			   temp=temp.next;
		   }
		   new_node.next=temp.next;
		   temp.next=new_node;
	   }
   }
   
   
//   public void connectTheList() {
//	   Node temp=head1;
//	   while(temp.next!=null) {
//		   temp=temp.next;             //connect multiple thread
//	   }
//	   
//	   temp.next=head2;
//   }
//   
   
   public void reverseLinkedList() {
	   if(this.head!=null) {
		   Node prevNode=this.head;
		   Node tempNode=this.head;
		   Node curNode=this.head.next ;
	
		 
		   
		   prevNode.next=null;
//		   System.out.println(prevNode.data);
//		   
//		   System.out.println();
//		   System.out.println(prevNode.data + " - " + tempNode.data + " - " + curNode.data);
//		   System.out.println();
//		   
		//   prevNode.next=null;
		   
		   while(curNode!=null) {
			   tempNode=curNode.next;
			   curNode.next=prevNode;
			   
			   prevNode=curNode;
			   curNode=tempNode;
			   
		   }
		   this.head=prevNode;
	   }
   }
   
  
   
   
   
   
   
	public void display() {
		Node temp= head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
	        temp=temp.next;

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
     obj.insertNodeAtLast(30);
      
       
//       obj.insertAfter(3, 100);
       obj.display();
       obj.delate();
      //obj.reverseLinkedList();
       
       
       
	}

	private void delate() {
		// TODO Auto-generated method stub
		
	}

}
