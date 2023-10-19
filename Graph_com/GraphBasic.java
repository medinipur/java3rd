package Graph_com;

public class  GraphBasic{
   
 private  int[][] adjancematrix;

public GraphBasic(int nodes) {
	   this.adjancematrix=new int[nodes][nodes];
   }

	public void addEdge(int source, int dest) {
		this.adjancematrix[source][dest]=1;
		this.adjancematrix[dest][source]=1;
	}
	public void show() {
		for(int i=0; i<adjancematrix.length;i++) {
			for(int j=0; j<adjancematrix[i].length; j++) {
				System.out.print(adjancematrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes=4;
	GraphBasic obj=new GraphBasic(nodes);
		obj.addEdge(0, 1);
		obj.addEdge(2, 3);
		obj.addEdge(5, 4);
		obj.addEdge(6, 0);
		obj.show();
		
		
	}

}
