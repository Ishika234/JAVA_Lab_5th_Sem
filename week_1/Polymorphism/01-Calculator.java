# 1. Create a class Calculator with method multiply (int, int) and multiply (double, double) to demonstrate method overloading.

  class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result1 = calc.multiply(5, 4);
        double result2 = calc.multiply(3.5, 2.2);

        System.out.println("Multiplication of integers: " + result1);
        System.out.println("Multiplication of doubles: " + result2);
    }
}
