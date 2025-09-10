# 3. Demonstrate instanceof keyword to check object types in an inheritance hierarchy.

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class InstanceofDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();

        System.out.println("a1 is instance of Dog: " + (a1 instanceof Dog));
        System.out.println("a1 is instance of Cat: " + (a1 instanceof Cat));
        System.out.println("a1 is instance of Animal: " + (a1 instanceof Animal));

        System.out.println("a2 is instance of Dog: " + (a2 instanceof Dog));
        System.out.println("a2 is instance of Cat: " + (a2 instanceof Cat));
        System.out.println("a2 is instance of Animal: " + (a2 instanceof Animal));

        System.out.println("a3 is instance of Dog: " + (a3 instanceof Dog));
        System.out.println("a3 is instance of Cat: " + (a3 instanceof Cat));
        System.out.println("a3 is instance of Animal: " + (a3 instanceof Animal));
    }
}
