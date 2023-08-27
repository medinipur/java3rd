package StringExample;



public class palindromic {

	public static void main(String[] args) {
	   String str="abcdcba";
	   StringBuilder gtr = new StringBuilder(str);
	   gtr.reverse();
	   String s =gtr +"";
	   if(str.equals(s));{
		   System.out.println("this is palindrome");
		   
	   }
	  
	  
		
	}

}
