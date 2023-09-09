package patternQuestion;

public class patternExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       pattern3(5);
	}
	static void pattern3(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
