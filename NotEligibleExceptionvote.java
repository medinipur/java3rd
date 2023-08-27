import java.util.Scanner;

public class NotEligibleExceptionvote extends Exception {

	public NotEligibleExceptionvote() {
		super();
	}
	
	public NotEligibleExceptionvote(String msg) {
		super(msg);
	}
	
	
	public static class Register {
		public static void checkAge(int age)
		throws NotEligibleExceptionvote {
			if(age<=17)
				throw new NotEligibleExceptionvote(" you are Not eligilbe for voting");
		}
		
	}
  

	public static void main(String[] args) {
		String name;
		String country;
		int age=0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.next();
		System.out.println("name is: "+name);
		
		System.out.println("Enter your  country name:");
		country = sc.next();
		System.out.println("country is: "+country);
		
		System.out.println("Enter your age:");
		age = sc.nextInt();
		System.out.println("age  is: "+age);
		
		try {
			Register.checkAge(age);
			System.out.println("you are eligible for vote");
			System.out.println("Registration completed");
		}
		catch(NotEligibleExceptionvote e){
			System.out.println(e.getMessage());
			
		}
		
		

	}


}














