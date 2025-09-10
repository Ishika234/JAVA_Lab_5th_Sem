# 3. Create two packages: package1 with class A and package2 with class B. Access class A from B using import.

#Class A in package1
package package1;

public class A {
    public void display() {
        System.out.println("Hello from Class A (package1)");
    }
}

#Class B in package2
package package2;

import package1.A;   // importing class A from package1

public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}


