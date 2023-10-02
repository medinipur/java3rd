package SinglyLinkedList;



public class InsertAtBegning {

	public static class Node{
		int data;
		Node head;
		Node next;
		
		Node(int data){
			data=this.data;
		}
	}
	
	public static class linkAtbeging{
		Node head=null;
	    Node tail=null;
	    
	    void InsertatBeging(int val) {
	    	Node temp=new Node(val);
	    	
	    	if(head==null) {
	    		head=temp;
	    		tail=temp;
	    	}
	    	else {
	    		temp.next=head;
	    		head=temp;
	    	}
	    	
	    }
	
	    
	    void display() {
	    	   Node temp=head;
	    	   while(temp!=null) {
	    		   System.out.print(temp.data+" ");
	    		   temp=temp.next;
	    	   }
	    	   System.out.println();
	       }
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkAtbeging ll=new linkAtbeging();
		ll.InsertatBeging(4);
		ll.InsertatBeging(10);
	    ll.display();
		
		
	}

}
	
