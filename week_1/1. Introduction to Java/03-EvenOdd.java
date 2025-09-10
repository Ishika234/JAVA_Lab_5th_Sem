# 3. Create a Java program to check whether a number is even or odd using if-else statements.

import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {6
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num  = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println(num + " is Even.");
		}
		else
		{
			System.out.println(num + " is Odd.");
    }
	}
}
