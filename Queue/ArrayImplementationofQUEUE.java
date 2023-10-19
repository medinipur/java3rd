package Queue;

public class ArrayImplementationofQUEUE {
	public static class queueA{
		int front=-1;
		int rear=-1;
		int size=0;
		
		int arr[]=new int[5];
		public void add(int val) {
			if(rear==arr.length-1) {
				System.out.println("Queue is full");
				return;
			}
			if(front==-1) {
				front=rear=0;
				arr[0]=val;
			}
			else {
				arr[++rear]=val;
			}
			size++;
		}
		public int remove() {
			if(size==0) {
				System.out.println("Queue is empty");
				return -1;
			}
			front++;
			size--;
			return arr[front-1];
		}
		
		public int peek() {
			if(size==0) {
				System.out.println("Queue is empty");
				return -1;
			}
			return arr[front];
		}
		public void display() {
			if(size==0) {
				System.out.println("Queue is empty");
			}
			else {
				for(int i=front; i<=rear; i++) {
					System.out.print(arr[i]+"");
				}
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		queueA qu= new queueA();
		qu.add(1);
		qu.add(2);
		qu.add(3);
		qu.add(4);
		qu.add(5);
		qu.display();
		

	}

}
