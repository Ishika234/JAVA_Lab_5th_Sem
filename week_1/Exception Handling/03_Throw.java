#3. Create a program to accept age from the user. Throw and catch a user-defined exception if age is less than 18.

import java.util.Scanner;

// User-defined exception
class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

public class AgeCheckDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new UnderAgeException("Age must be 18 or above. You entered: " + age);
            }
            System.out.println("Access granted. Age is valid: " + age);
        } catch (UnderAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}
