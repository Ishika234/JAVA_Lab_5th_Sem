# 2. Design a class Rectangle with length and breadth. Add a method to calculate area and perimeter.

  class Rectangle1
{
	private double length;
	private double breadth;
	
	public Rectangle1(double l, double b)
	{
		this.length =l;
		this.breadth = b;
	}
	
	public double area()
	{
		return this.length * this.breadth;
	}
	
	public double perimeter()
	{
		return area() * 2;
	}
	
	public void display()
	{
		System.out.println("Area : " + area());
		System.out.println("Perimeter : " + perimeter());
	}
}
public class Rectangle {

	public static void main(String[] args) {
		Rectangle1 r = new Rectangle1(4.5, 7.8);
		r.display();
	}
}
