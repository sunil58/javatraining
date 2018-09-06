//MethodOverriding of Rotation of shapes//
class Shapes 
{
		public void rotate()
	    {
			System.out.println("Rotate ClockWise...");
		}
	
}

class Circle extends Shapes
{
	public static void main(String[] args) 
	{
		Circle rv1=new Circle();
		rv1.rotate();
	}
}

class Rect extends Shapes
{
	public void rotate()
	{
		System.out.println("Rotate Anti-ClockWise...");
	}
	public static void main(String[] args) 
	{
		Rect rv1=new Rect();
		rv1.rotate();
	}
}

class Tri extends Shapes
{
	public void rotate()
	{   
		super.rotate();
		System.out.println("Rotate Anti-ClockWise...");
	}

	public static void main(String[] args) 
	{
		Tri rv1=new Tri();
		rv1.rotate();
	}
}
