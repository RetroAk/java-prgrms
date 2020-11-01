abstract class Shape{
	abstract void numberOfSides();
}
class Rectangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Number of sides in rectangle is 4 ");
	}
}
class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("The number of sides in triangle is 3 ");
	}
}
class Hexagon extends Shape
{
	void numberOfSides()
	{
		System.out.println("The number of sides in hexagon is 6 ");
	}
}
class sides
{
public static void main(String[] args)
{
	Shape ob;
	ob=new Rectangle();
	ob.numberOfSides();
	ob=new Triangle();
	ob.numberOfSides();
	ob=new Hexagon();
	ob.numberOfSides();
}
}
