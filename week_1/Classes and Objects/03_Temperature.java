# 3. Create a class TemperatureConverter with a method that converts Celsius to Fahrenheit and vice versa.

import java.util.*;

class TemperatureConverter
{
	private float cel;
	private float fer;
	
	public TemperatureConverter(float c, float f)
	{
		this.cel = c;
		this.fer = f;
	}
	public float Celcius()
	{
		return (this.cel * 9/5) + 32;
	}
	public float Fahrenheit()
	{
		return (this.fer - 32) * 5/9;
	}
	public void display()
	{
		System.out.println("Celcius to Fahrenheit : "+Celcius());
		System.out.println("Fahrenheit to Celcius : "+Fahrenheit());
	}
}
public class Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Celcius:");
		float c = sc.nextFloat();
		System.out.println("Enter the Fahrenheit:");
		float f = sc.nextFloat();
		TemperatureConverter t1 = new TemperatureConverter(c,f);
		t1.display();	
	}
}
