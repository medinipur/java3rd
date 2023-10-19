package BfsGraph;

import java.util.LinkedList;

public class Graph {
private int V;
private LinkedList<Integer>[]adj;

Graph(int v){
	V=v;
	adj=new LinkedList[v];
	for(int i=0; i<v;i++) {
		adj[i]= new LinkedList<>();
	}
}
	public void addEdge(int v, int w) {
		adj[v].add(w);
}
	void BFS (int s) {
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(s);
		
		boolean []visited= new boolean[V];
		visited[s]=true;
		
		while(!queue.isEmpty()) {
			s=queue.poll();
			System.out.print(s+" ");
			
			for(Integer neighbor:adj[s]) {
				if(!visited[neighbor]) {
					visited[neighbor]=true;
					queue.add(neighbor);
				}
			}
		}
	}
 void DFS(int v) {
	 boolean []visited= new boolean[v];
	 DFSUtil(v,visited);
 }
 private void DFSUtil(int v, boolean []visited) {
	 visited[v]=true;
	 System.out.println(v+" ");
	 
	 for(Integer neighbor:adj[v]) {
		 if(!visited[neighbor]) {
		 DFSUtil(neighbor,visited);
	 }
 }

}
}


