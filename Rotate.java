//shape rotation and its area using Inheritence,Method Overriding,Abstract class//
abstract class Shapes
{
	public void rotate()
	{
		System.out.println("Rotating ClockWise");
	}
	abstract public void area();
}
class Circle extends Shapes
{
	
	final double pi=3.14;
	int radius;
	Circle(int radius)
	{
		this.radius=radius;
	}
	public void area()
	{
		double area=pi*radius*radius;
		System.out.println("area of circle="+area);
	}
}

class Rect extends Shapes
{
	int length;
	int breath;
    
	Rect(int length,int breath)
	{
		this.length=length;
		this.breath=breath;
	}
	public void area()
	{
		int area=length*breath;
		System.out.println("area of rectangle="+ area);
	}
}

class Tri extends Shapes
{
	int base;
	int height;
	
	Tri(int base,int height)
	{
		this.base=base;
		this.height=height;
	}
	public void area()
	{
		double area=0.5*base*height;
		System.out.println("area of triangle="+area);
	}
}

class Rotate
{
	public static void main(String [] args)
	{
		System.out.println("main starts...");
		System.out.println("=====================");
		Circle c1=new Circle(5);
		c1.rotate();
		c1.area();
		System.out.println("=====================");
		System.out.println("=====================");
		Rect r1=new Rect(4,5);
		r1.rotate();
		r1.area();
		System.out.println("=====================");
		System.out.println("=====================");
		Tri t1=new Tri(3,4);
		t1.rotate();
		t1.area();
		System.out.println("main ends...");
	}
}





