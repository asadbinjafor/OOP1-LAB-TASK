import java.lang.*;

public class Square extends Shape
{
	public Square(){System.out.println("E-Square");}
	public Square(double x)
	{
		super(x);
		System.out.println("P-Square");
	}
	public double getArea()
	{
		return x * x;
	}
	
}