package patternQuestion;

public class patternExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     pattern7(5);
	}
	static void pattern7(int n) {
		
			for(int i=1; i<=n;i++) {
				for(int j=1;j<=n; j++) {
					if(i==1||i==n ||j==1 ||j==n) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		
			
		}
	}


