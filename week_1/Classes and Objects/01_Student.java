# 1. Create a student class with fields: name, ID, and marks. Include methods to input and display details.

class Student1
{
	private String name;
	private int ID;
	private double marks;
	
	public Student1(String n, int i, double m) {
		this.name = n;
		this.ID = i;
		this.marks = m;
	}
	
	public void display()
	{
		System.out.println("Name : " + this.name);
		System.out.println("ID : " + this.ID);
		System.out.println("Marks : " + this.marks);
	}
}
public class Student {

	public static void main(String[] args) {
		Student1 s1 = new Student1("Ishika", 60, 89.8);
		s1.display();
		
	}
}
