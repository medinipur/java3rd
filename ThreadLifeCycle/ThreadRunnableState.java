package ThreadLifeCycle;

public class ThreadRunnableState {
	
	public void createRunnableThread() {
		Thread thread=new Thread();
		thread.start();
	
		
		System.out.println("Thread state:"+thread.getState());
	}

	public static void main(String[] args) {
		
		ThreadRunnableState obj=new ThreadRunnableState();
		obj.createRunnableThread();
	}

}
