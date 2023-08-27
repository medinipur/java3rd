package DataStructure;

import java.util.Scanner;

public class Main {
  private static Scanner input;
 //private static final int ROOM=10;
  private  int N;
  private boolean isBedAvailable;
 private int badcounter=0;
  private int StudentAdded=0;
  
  
	static {
		input = new Scanner(System.in);
		
	}
	public Main(int N) {
		N=input.nextInt();
		this.N=N;
	}
	
	public boolean isBedAvailable() {
		isBedAvailable = true;
		
		return isBedAvailable;
	}
	
	public int addStudent() {
		
		if(StudentAdded <=N) {
		return ++StudentAdded;
		}
		else {
			return 0;
		}
	}
	
	
	public int checkAnotherRoom() {
		
		
		
		
		
		
		
		
//		System.out.println("Enter size of Room avaliable");
//		int []arr=new int[N];
//		
//		for(int i=0; i<N; i++) {
//			if(arr[i]<4) {
//				System.out.println("Room is full");
//			}
//			else {
//				System.out.println("please check the another room");
//				break;
//			}
//		}
//		int i = 0;
//		while( badcounter< arr[i]) {
//			return ++ badcounter;
//		}
//		System.out.println("Room is not avaliable");
//		
		return 1;
	}
	
	

	public static void main(String[] args) {
		int N =0;
		Main obj= new Main(N);
		
		int i=0;
		do {
		if(obj.isBedAvailable()) {
			i =obj.addStudent();
			System.out.println(i+ "Student Added");
		
		}
		else {
			//
		}
		}
        while(i<4);
		obj.checkAnotherRoom();
	}

	

}































