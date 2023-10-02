package SinglyLinkedList;

public class FindIntersectionTwolinkedlist {
	
	class Node{
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
		
		
		public static Node Insertion(Node headA , Node headB) {
			Node temp1=headA;
			Node temp2=headB;
		  // find length of two linked list
			
			int lengthA=0;
			
			while(temp1!=null) {
			lengthA++;
			temp1=temp1.next;
				
			}
			int lengthB=0;
			while(temp2!=null) {
				lengthB++;
				temp2=temp2.next;
			}
			temp1=headA;
			temp2=headB;
			// m-n
			if(lengthA>lengthB) {
				int staps=lengthA-lengthB;
				for(int i=0; i<staps;i++) {
					temp1=temp1.next;
				}
			}
				else {
					int staps=lengthB-lengthA;
					for(int i=0; i<staps;i++) {
						temp2=temp2.next;
					}
				}
			
				while(temp1!=temp2) {
					temp1=temp1.next;
					temp2=temp2.next;
				}
			
			return temp1;
			
		}
	}
          
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	}

}
