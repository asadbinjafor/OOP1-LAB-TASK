import java.lang.*;

public class Circle extends Shape
{
	public Circle(){System.out.println("E-Circle");}
	public Circle(double x)
	{
		super(x);
		System.out.println("P-Circle");
	}
	public double getArea()
	{
		return 3.1416 * x * x;
	}
	
}