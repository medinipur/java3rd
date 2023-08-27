
public class CustomException extends Exception{
	private String massage;

	public CustomException(String massage) {
		this.massage=massage;
	}
	
	public String toString() {
		return massage;
	}

	public static void main(String[] args) {
		try {
			throw new CustomException("This is a custom exception");
		
		}
		catch(CustomException ce ) {
			System.out.println(ce);
			
			// System.out.println(ce.getMessage());
		}

	}

}
