package NestedClasss;

//public class ThreadExample extends Thread {
//	
//	public void run() {
//		System.out.println("thread is running ");
//	}
//
//	public static void main(String[] args) {
//		ThreadExample obj=new ThreadExample();
//		obj.start();
//
//	}
//
//}


public class ThreadExample implements Runnable{
	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[]args) {
		ThreadExample m1=new ThreadExample ();
		Thread t1=new Thread(m1);
		 t1.start();
	}


}