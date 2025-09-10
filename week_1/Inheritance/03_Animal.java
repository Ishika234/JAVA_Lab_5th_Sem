# 3. Create a class Animal with method sound(). Override it in Dog, Cat, and Cow classes to show different animal sounds.

  class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks: Woof Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows: Meow Meow");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos: Moo Moo");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}
