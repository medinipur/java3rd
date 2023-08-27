package ThreadLifeCycle;

public class ThreadStates {
       public ThreadStates (){
		for(Thread.State C:Thread.State.values())  {  		  
			System.out.println(C);
      }      }
	public static void main(String[] args) {
		ThreadStates  obj =new ThreadStates ();

}
}
         