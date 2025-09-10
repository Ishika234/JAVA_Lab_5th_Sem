# 1. Create a class Person with name and age. Derive a class Teacher with additional fields subject and salary. Show how inheritance works.

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;
    double salary;

    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    void displayTeacherInfo() {
        displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Rahul Sharma", 35, "Mathematics", 55000.0);
        teacher1.displayTeacherInfo();
    }
}
