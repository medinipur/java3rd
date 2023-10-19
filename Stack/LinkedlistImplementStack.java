package Stack;


public class LinkedlistImplementStack {
	public static class Node{
		int data;
		Node head;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	public static  class Stack{
		private Node head=null;
	  private int size=0;
		
		void  push(int x) {
			
			Node temp= new Node(x);
			temp.next=head;
			head=temp;
			size++;
		}
		public int pop() {
			if(head==null) {
				System.out.println("stack is empty");
				return -1;
			}
			int x=head.data;
			head=head.next;
			return x;
		}
		public int  peek() {
			if(head==null) {
				System.out.println("stack is empty");
				return -1;
			}
			
			return head.data;
		}
		void displayrec(Node h) {
			if(h==null)return;
			displayrec(h.next);
			System.out.print(h.data+" ");
		}
		void diplay() {
			displayrec(head);
			System.out.println();
		}
		public void displayrev() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		
		public int size() {
			return size;
		}
		boolean isEmpty() {
			if(size==0)return true;
			return false;
		}
	}

	public static void main(String[] args) {
		Stack st = new Stack();
        st.push(4);
        st.diplay();
        st.push(5);
        st.diplay();
        st.push(1);
        st.diplay();
        System.out.println(st.size());
        st.pop();
        st.peek();
        st.diplay();
       
       
		

	}

}
