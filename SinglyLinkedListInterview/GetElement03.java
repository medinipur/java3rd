package SinglyLinkedListInterview;

public class GetElement03 {
	class Node{
		int data;
		Node head;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
    public static class Linkedlist{
    	Node head=null;
    	Node tail=null;
    	
    	int getAt(int index) {
    		Node temp=head;
    		for(int i=0; i<index; i++) {
    			temp=temp.next;
    		}
    		return temp.data;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist ll=new Linkedlist();
		System.out.println(ll.getAt(0));
	}

}
