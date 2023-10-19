package SinglyLinkedListInterview;

import SinglyLinkedListInterview.InsertAt02.Node;

public class InsertAtEnd01 {
	public static class Node{
		 int data;
		 Node head;
		 Node next;
		
		 Node(int data){
			 this.data=data;
		 }
		
	}
	
	public static class linkedlist{
		Node head=null;
		Node tail=null;
		
	    void InsertatBeging(int val) {
	    	Node temp=new Node(val);
	    	
	    	if(head==null) {
	    		head=temp;
	    		head.next=null;
	    	}
	    	else {
	    		temp.next=head;
	    		head=temp;
	    	}
	    	
	    }
	     int getAt(int index) {
	    	 
	    	 Node temp=head;
	    	 for(int i=0; i<index; i++) {
	    		 temp=temp.next;
	    	 }
	    	 return temp.data;
	     }
		
       void insertAtend(int val) {
			Node temp=new Node(val);
			if(head==null) {
				head=temp;
				tail=temp;
			}
			else {
			tail.next=temp;	
			}
			tail=temp;
		}
       

		void insertAt(int index, int val) {
			Node t=new Node(val);
			Node temp=head;
			if(index==0) {
				InsertatBeging(val);
				return;
			}
		   //index(5)(5-1)=4 tail is point index4 but tail is index no 5
			if(index==size()) {
				insertAtend(val);
				return;
			}
			
			for(int i=0; i<index-1;i++) {
				temp=temp.next;
			}
			t.next=temp.next;
			temp.next=t;
		}
		
       
	   void deleteAt(int index) {
		   Node temp=head;
		   if(index==0)head=head.next;
		   for(int i=0; i<index-1; i++) {
			   temp=temp.next;
		   }
		   temp.next=temp.next.next;
		   tail=temp;
	   }
       void display() {
    	   Node temp=head;
    	   while(temp!=null) {
    		   System.out.print(temp.data+" ");
    		   temp=temp.next;
    	   }
    	   System.out.println();
       }
       
       
   public int size() {
    	  Node temp=head;
    	  int count=0;
    	  while(temp!=null) {
    		  count++;
    		  temp=temp.next;
    	  }
    	  return count;
      }
    	   
       }
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist ll= new linkedlist();
		
		ll.insertAtend(4);
		ll.insertAtend(5);
		ll.insertAtend(12);
		ll.InsertatBeging(13);
		
		
		ll.insertAt(4, 10);
	    ll.insertAt(0, 100);
		ll.display();
		ll.deleteAt(0);
		ll.display();
//		System.out.println("length : ");
//		System.out.println(ll.size());
		
	//	System.out.println(ll.tail.data);
	//	System.out.println(ll.getAt(4));
	}

}
