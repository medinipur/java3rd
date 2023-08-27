package StringExample;

public class stringBuilderExample {

	public static void main(String[] args) {
		StringBuilder str= new StringBuilder("Hello");
	System.out.println(str);
	
    	str.setCharAt(0, 'm');
		System.out.println(str);
	
		
		
		StringBuilder sb = new StringBuilder("HelloWorld");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
