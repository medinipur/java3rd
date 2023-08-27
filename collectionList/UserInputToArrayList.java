package collectionList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputToArrayList {

	public UserInputToArrayList() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
       ArrayList<String> obj = new ArrayList<>();
       
       for(int i=0;i<5;i++) {
       String name =sc.next();
       obj.add(name);
       
       }
       
       System.out.println(obj);
	}

}
