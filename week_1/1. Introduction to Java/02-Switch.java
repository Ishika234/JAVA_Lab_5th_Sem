# 2. Write a program using switch-case to perform basic arithmetic operations: addition, subtraction, multiplication, and division.

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter second number :");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter the operation you want to perform (+,-,*,/) :");
		String op = sc.next();
		
		switch(op) {
		case "+":
			double sum = num1 + num2;
			System.out.println("Addition : "+ sum);
			break;
		
		case "-":
			double sub = num1 - num2;
			System.out.println("Subtraction : "+ sub);
			break;
			
		case "*":
			double mult = num1 * num2;
			System.out.println("Multiplication : "+ mult);
			break;
			
		case "/":
			double div = num1 / num2;
			System.out.println("Division : "+ div);
			break;
			
		default:
			System.out.println("Invalid operator.");
		}		
	}
}


