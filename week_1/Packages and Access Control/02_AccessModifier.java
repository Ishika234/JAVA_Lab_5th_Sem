#2. Show the use of all access modifiers (private, public, protected, and default) by creating variables and methods in different classes.

  class AccessDemo {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;        // default
    private int privateVar = 40;

    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    public void showPrivate() {
        // private accessible inside same class
        System.out.println("Private Var: " + privateVar);
        privateMethod();
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        // Accessible
        System.out.println("Public Var: " + obj.publicVar);
        System.out.println("Protected Var: " + obj.protectedVar);
        System.out.println("Default Var: " + obj.defaultVar);
        // System.out.println(obj.privateVar); // ❌ Not allowed

        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        // obj.privateMethod(); // ❌ Not allowed

        obj.showPrivate(); // access private indirectly
    }
}
