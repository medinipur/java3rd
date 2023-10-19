package TowerOfHanoi;

public class towerOfHanoi {

	public towerOfHanoi() {
		System.out.println("Tower Of Hanoi");
	}                         
	                         //source       destination    auxiliary
	public void Tower(int n, char from_rod, char to_rod, char aux_rod) {
		if(n==1) {
			System.out.println("Move disk 1 from ROD " +from_rod+ " To ROD " + to_rod);
			return;
		}
		Tower(n-1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk 2 from ROD " + n + " from ROD " + from_rod);
		Tower(n-1, aux_rod, to_rod, from_rod);
	}

	public static void main(String[] args) {
	int n=3;
	
	towerOfHanoi obj=new towerOfHanoi();
	obj.Tower(n, 'A', 'c', 'B');  //source destination auxiliary
	}

}
