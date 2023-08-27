
public class classOop {

	public classOop() {
		System.out.println("Constructor");
	}
	
	/*
	//static-block JVM responsible
	static {
		System.out.println("STATIC_BLOCK");
	}
	
	static  void method() {
		System.out.println("STATIC_METHOd");
	}
	*/
	
	
	
	//INIT-BLOCk - ANNONYMOUS BLOCK
	{
		System.out.println("init- block");
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classOop obj =new classOop();
		
		//System.out.println("Object:"+obj);
	// classOop.method();

	}

}
