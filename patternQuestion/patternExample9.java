package patternQuestion;

public class patternExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        pattern9(5);
	}
	static void pattern9(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0; j<n-i+1;j++) {
				System.out.print(i+"");
			}
			System.out.println();
		}
	}

}
