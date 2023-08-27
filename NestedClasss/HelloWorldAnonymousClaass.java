package NestedClasss;

public class HelloWorldAnonymousClaass {
	
	interface HelloWorld{
		public void greetings(String greet);
	}
	void sayHello() {
		//local class
		class EnglishGreeting implements HelloWorld{
			public void greetings(String greet) {
				System.out.println("English :"+greet);
			}
		}
		HelloWorld obj=new EnglishGreeting();
		obj.greetings(" Hello");
		
		
		
		
		
		
		//anonymous class
		
		HelloWorld obj2=new HelloWorld() {
			public void greetings(String greet) {
												
				
		System.out.println("Hindi :"+greet);
		
		}
											
	};
		
		obj2.greetings(" Namaste");
		
	
		
		
		
		//anonymous class
	/*	HelloWorld obj3=new HelloWorld() {
			public void greetings(String greet) {
												
				
		System.out.println("Spanish :"+greet);
		
		}
											
	};
		
		obj3.greetings(" Hola");
		
		*/
		
//		HelloWorld  obj4 =new HelloWorld() {
//			public void greetings(String greet) {
//				System.out.println("Bengali:"+greet);
//				
//			}
//			
//		};
//		obj4.greetings("Nomskar");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldAnonymousClaass obj=new HelloWorldAnonymousClaass();
		obj.sayHello();
		
		
	}

}