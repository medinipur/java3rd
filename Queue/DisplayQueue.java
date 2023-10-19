package Queue;
import java.util.*;

public class DisplayQueue {

	public static void main(String[] args) {
		Queue<Integer>qu=new LinkedList<>();
		
		qu.add(1);
		qu.add(2);
		qu.add(3);
		qu.add(4);
		qu.add(5);
		Queue<Integer>helper=new ArrayDeque<>();
		while(qu.size()>0) {
			System.out.print(qu.peek()+"");
			helper.add(qu.poll());
		}
		while(helper.size()>0) {
			qu.add(helper.poll());
		}

	}

}
