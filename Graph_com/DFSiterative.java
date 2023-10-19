package Graph_com;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DFSiterative {

	public  static void iterativeDFS(Graph graphs, int v, boolean[] discovered) {
		Stack<Integer>st=new Stack<>();
		st.push(v);
		
		while(!st.empty()) {
			v=st.pop();
			
			if(discovered[v]) {
				continue;
			}
			discovered[v]=true;
			System.out.print(v+" ");
			
			
		
			List<Integer>adjList=graph.adjList.get(v);
		}
		
	}

	public static void main(String[] args) {
		List <Edge>edges=Arrays.asList(new 
				Edge(1,2),new Edge(1,8),new Edge(2,3),
				Edge(2,6),new Edge(3,4),new Edge(3,5),new Edge(8,9),
				new Edge(8,12),new Edge(9,10),new Edge(9,11)
				
				);
		int n=13;
		Graph graphs=new Graph(edges,n);
		boolean[]discovered=new boolean[n];
		for(int i=0; i<n; i++) {
			if(!discovered[i]) {
				iterativeDFS(graphs,i,discovered);
			}
		}

	}

	private static Object Edge(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}


}
