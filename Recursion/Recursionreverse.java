package Recursion;

public class Recursionreverse {
	
public  void  reverseRecurion(String s ) {
//	System.out.println(s);
	
   if(s.length()>0) {
	  
	   reverseRecurion(s.substring(1));
      System.out.print(s.charAt(0));
}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursionreverse obj=new Recursionreverse();
	
		String s="Recursion";
		obj.reverseRecurion(s);
	}

}
