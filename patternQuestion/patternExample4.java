package patternQuestion;

public class patternExample4 {

	public static void main(String[] args) {
		
   pattern4(5);
	}
	static void pattern4(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
