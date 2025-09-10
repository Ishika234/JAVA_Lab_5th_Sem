# 2. Write a program where a superclass Shape has method area(). Override it in Circle, Triangle, and Rectangle classes using runtime polymorphism.

  class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Triangle(10, 6);
        Shape s3 = new Rectangle(4, 7);

        System.out.println("Area of Circle: " + s1.area());
        System.out.println("Area of Triangle: " + s2.area());
        System.out.println("Area of Rectangle: " + s3.area());
    }
}
