# 1.Create a user-defined package mathops with a class Operations having methods add (), subtract (). Import it into another class and use it.

# File 1: mathops/Operations.java
package mathops;

public class Operations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

#File 2: PackageDemo.java
  import mathops.Operations;

public class PackageDemo {
    public static void main(String[] args) {
        Operations op = new Operations();

        int sum = op.add(10, 5);
        int diff = op.subtract(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
    }
}
