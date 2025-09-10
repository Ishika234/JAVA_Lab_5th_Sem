# 1. Write a program to take a student’s name, roll number, and marks in three subjects. Calculate and display the total and average using Scanner.

import java.util.Scanner;
public class lab {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		
		System.out.println("Enter you roll number: ");
		int roll = sc.nextInt();
		
		System.out.println("Enter your marks for JAVA :");
		double java = sc.nextDouble();
		
		System.out.println("Enter your marks for DBMS :");
		double dbms = sc.nextDouble();
		
		System.out.println("Enter your marks for OS :");
		double os = sc.nextDouble();
		
		double total = java = dbms + os;
		double average = total/3;
		
		System.out.println("Total : "+ total);
		System.out.print("Average : "+ average);
	}
}


