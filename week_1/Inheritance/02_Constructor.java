# 2. Demonstrate constructor chaining in multilevel inheritance: Person → Employee → Manager.

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }
}

class Employee extends Person {
    String department;

    Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
        System.out.println("Employee constructor called");
    }
}

class Manager extends Employee {
    double salary;

    Manager(String name, int age, String department, double salary) {
        super(name, age, department);
        this.salary = salary;
        System.out.println("Manager constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Manager m1 = new Manager("Anita Verma", 40, "HR", 80000.0);
        m1.display();
    }
}
