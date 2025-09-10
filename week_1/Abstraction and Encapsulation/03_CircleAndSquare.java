 #3. Demonstrate how abstraction works using interfaces: Define an interface Drawable and implement it in Circle and Square.

  interface Drawable {
    void draw();
}

class Circle implements Drawable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}

class Square implements Drawable {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with side: " + side);
    }
}

public class InterfaceAbstractionDemo {
    public static void main(String[] args) {
        Drawable d1 = new Circle(5);
        Drawable d2 = new Square(4);

        d1.draw();
        d2.draw();
    }
}
