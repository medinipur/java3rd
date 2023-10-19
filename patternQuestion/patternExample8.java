package patternQuestion;

public class patternExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      pattern8(5);
	}
	static void pattern8(int n) {
		
			for(int i=0;i<n;i++) {
				for(int j=0; j<i;j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
			
		}
	}


