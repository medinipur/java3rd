package NestedClasss;

import java.util.Scanner;

public class Calculator {
	private int num1;
	private  int num2;

	Scanner input = new Scanner(System.in);
	
	//local class
	
	public void additionCalculator() {

		class Addition{
			public void sum(int num1, int num2) {
				System.out.println(num1 + num2);
			}
		}
		Addition objA = new Addition();
		System.out.print("Number 1: ");
		int num1 = input.nextInt();
		System.out.print("Number 1: ");
		int num2 = input.nextInt();
		
		objA.sum(num1, num2);
	
	}
	
	public void subtractCalculator() {
		class subtract{
			public void Sub(int num1, int num2) {
				System.out.println(num1-num2);
			}
			
		}
		subtract objS=new subtract();
		System.out.print("Number 1: ");
		int num1 = input.nextInt();
		System.out.print("Number 2: ");
		int num2 = input.nextInt();
		objS.Sub(num1,num2);
	}
	
	
	public void multipicationCalculator(){
		class Multipicaton{
			public void mul(int num1, int num2) {
				System.out.println(num1*num2);
			}
		}
		Multipicaton objM = new Multipicaton();
		System.out.print("Number 1: ");
		int num1 = input.nextInt();
		System.out.print("Number 2: ");
		int num2 = input.nextInt();
		objM.mul(num1,num2);
	}
	
	
	
	public static void main(String[] args) {
		  

		Calculator obj = new Calculator();
		
		obj.additionCalculator();
		
		obj.subtractCalculator();
		
		obj.multipicationCalculator();

	}

	
}
