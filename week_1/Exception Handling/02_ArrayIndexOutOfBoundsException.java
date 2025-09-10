# 2. Write a program to handle ArrayIndexOutOfBoundsException when accessing an array element.

  public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Trying to access an invalid index
            System.out.println("Element at index 7: " + numbers[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index accessed!");
        }

        System.out.println("Program continues after handling exception...");
    }
}
