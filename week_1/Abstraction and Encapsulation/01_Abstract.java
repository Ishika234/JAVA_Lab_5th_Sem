# 1. Create an abstract class Appliance with abstract method start(). Create concrete classes Fan and WashingMachine to implement it.

  abstract class Appliance {
    abstract void start();
}

class Fan extends Appliance {
    @Override
    void start() {
        System.out.println("Fan is starting... Spinning blades!");
    }
}

class WashingMachine extends Appliance {
    @Override
    void start() {
        System.out.println("Washing Machine is starting... Washing clothes!");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Appliance a1 = new Fan();
        Appliance a2 = new WashingMachine();

        a1.start();
        a2.start();
    }
}
