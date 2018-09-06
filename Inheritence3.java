class F
{
	int x;
	F(int x)
    {
		this.x=x;
	}
}
class G extends F
{
	double y;
	G(int x,double y)
	{
		super(x);
		this.y=y;
	}
}
class H extends F
{
	double z;
	H(int x,double z)
	{
		super(x);
		this.z=z;
	}
}


class Inheritence3 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		F rv1=new F(2);
		G rv2=new G(3,4.1);
		H rv3=new H(5,6.1);
		System.out.println(rv1.x);
		System.out.println("-------------------");
		System.out.println(rv2.x);
		System.out.println(rv2.y);
		System.out.println("-------------------");
		System.out.println(rv3.x);
		System.out.println(rv3.z);
		System.out.println("main ends....");
	}
}
