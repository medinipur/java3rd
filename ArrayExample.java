import java.util.Scanner;

public class ArrayExample {

	public ArrayExample() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n =sc.nextInt();
		
		int []arr = new int[n];
		
		System.out.println("Enter" +n+ "Element");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayExample obj = new ArrayExample();
	}

}