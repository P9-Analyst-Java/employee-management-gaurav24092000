package com.deloitte.calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operator;
		String restart="na";
		
		try {
			do {
			System.out.println("enter num1 ");
			int num1 = sc.nextInt();
			System.out.println("enter num2 ");
			int num2 = sc.nextInt();
			System.out.println("enter operator (+, -, *, /) or press 'q' to quit");
			operator = sc.next();
				
			
				
			switch(operator) {
				case "+":
					addMethod(num1, num2);
					break;
				case "-":
					subMethod(num1, num2);
					break;
				case "*":
					mulMethod(num1, num2);
					break;
				case "/":
					divMethod(num1, num2);
					break;
				case "q":
					quitMethod();
					break;
				default:
					System.out.println("enter only valid operators or 'q'");
					while(!restart.equals("r")) {
					System.out.println("press 'r' to restart");
					restart = sc.next();
					}
					break;	
				}
			
			} while(operator.equals("+")||
					operator.equals("-")|| 
					operator.equals("*")|| 
					operator.equals("/")||
					restart.equals("r"));
		}catch(InputMismatchException e) {
			System.out.println("enter only numbers "+e);
		}catch(Exception e) {
			System.out.println("calculator ended abruptly "+e);
		}
		
				
		
//		System.out.println(selection);
	
	}

	private static void divMethod(int num1, int num2) {
		try {
		int res = num1/num2;
		System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println("can't divide by zero "+ e);
		}
	}

	private static void mulMethod(int num1, int num2) {
		int res = num1 * num2;
		System.out.println(res);
	}

	private static void quitMethod() {
		System.out.println("thank you!");
	}

	private static void subMethod(int num1, int num2) {
		int res = num1 - num2;
		System.out.println(res);
	}

	private static void addMethod(int num1, int num2) {
		int res = num1 + num2;
		System.out.println(res);
	}

}
