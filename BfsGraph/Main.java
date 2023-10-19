package BfsGraph;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g =new Graph(6);
		
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(3,5);
		System.out.println("bfs starting vartex 0:");
		g.BFS(0);
		System.out.println("\nDFS starting from vertex 0:");
		g.DFS(0);
				
				
		

	}

}
