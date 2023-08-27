package ThreadLifeCycle;

public class ThreadNewState {

public void createNewThread() {
    Thread thread = new Thread();
        System.out.println("Thread state: " + thread.getState());
        
    }
    
    
    public static void main(String[]args){
    	ThreadNewState threadState = new ThreadNewState();
        
        threadState.createNewThread();
    }
}