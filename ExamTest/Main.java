package ExamTest;

import java.util.Scanner;

public class Main {
	private static Scanner input;
	private int N;
	private int[]array;
	private int index;
	
	static {
		input=new Scanner(System.in);
	}

	public Main(int N) {
		this.N=input.nextInt();
		
	}
	public void createArray() {
		array=new int[N];
		index=0;
		
	}
	public void add() {
		for(int i=0; i<N; i++) {
			array[i]=input.nextInt();
			
		}
	}
	//Logic building code 
	
	public int findMiddle() {
		return array[N/2];
	}
	public int findMax() {
		int max=0;
		for(int i=0; i<N; i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		return max;
	}
	
	
	
	public void show() {
		for(int i=0; i<N; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int N=0;
		Main obj=new Main(N);
		obj.createArray();
		obj.add();
		obj.show();
		
	  System.out.println("Middle  is:"+obj.findMiddle());
	  
	  System.out.println("Max is:"+obj.findMax());
		

	}

}
