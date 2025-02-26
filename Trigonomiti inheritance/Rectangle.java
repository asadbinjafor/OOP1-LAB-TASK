import java.lang.*;

public class Rectangle extends Shape
{
	private double y;
	
	public Rectangle(){System.out.println("E-Rectangle");}
	public Rectangle(double x, double y)
	{
		super(x);
		System.out.println("P-Rectangle");
		this.y = y;
	}
	public void setY(double y){this.y = y;}
	public double getY(){return y;}
	public double getArea()
	{
		return x * y;
	}
	
}