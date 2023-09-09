package patternQuestion;

public class patternExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       pattern2(5);
	}
	
	static void pattern2(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

