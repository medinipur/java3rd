package patternQuestion;

public class patternExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          pattern6(5);
	}
	static void pattern6(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
		 System.out.println();
		}
		for(int i=n-1;i>=1; i--) {
			for(int j=1;j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
