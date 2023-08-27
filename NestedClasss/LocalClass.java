package NestedClasss;

public class LocalClass {
	
	
	public void innermethod() {
	class InnerClass{
		public void sum(int a, int b) {
			System.out.println(a+b);
		}
	}
	 InnerClass objI=new InnerClass();
	 objI.sum(20,30);
	
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalClass obj = new  LocalClass ();
		 obj.innermethod();
		 

	}

}
