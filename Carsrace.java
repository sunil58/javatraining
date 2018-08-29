class Car
{
	String brandName;
	int topSpeed;
	int milage;
	String color;
	Car(String brandName,int topSpeed,int milage,String color)
	{
		this.brandName=brandName;
		this.topSpeed=topSpeed;
		this.milage=milage;
		this.color=color;
	}
	Car(Car r1)
	{
		this.brandName=r1.brandName;
		this.topSpeed=r1.topSpeed;
		this.milage=r1.milage;
		this.color=r1.color;
	}
	Car(Car r1,String color)
	{
		this.brandName=r1.brandName;
		this.topSpeed=r1.topSpeed;
		this.milage=r1.milage;
		this.color=color;
	}
	Car(Car r1,Car r2,Car r3,Car r4)
	{
		this.brandName=r1.brandName;
		this.topSpeed=r2.topSpeed;
		this.milage=r3.milage;
		this.color=r4.color;
	}
	public void carInfo()
	{
		System.out.println("====================");
		System.out.println("BrandName is " + brandName);
		System.out.println("TopSpeed is " + topSpeed);
		System.out.println("milage is " + milage);
		System.out.println("color " + color);
		System.out.println("====================");
	}
}
	class Racetournment
	{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Car rv1=new Car("lamborghini",285,12,"yellow");
		Car rv2=new Car("bucati",205,13,"blue");
		Car rv3=new Car("mercedes",260,9,"white");
		Car rv4=new Car("BMW",215,7,"black");
		Car rv5=new Car(rv3);
		Car rv6=new Car(rv2);
        Car rv7=new Car(rv4,"red");
		Car rv8=new Car(rv1,rv2,rv3,rv4);
		rv1.carInfo();
		rv2.carInfo();
		rv3.carInfo();
		rv4.carInfo();
		rv5.carInfo();
		rv6.carInfo();
		rv7.carInfo();
		rv8.carInfo();
		System.out.println("main ends...");
	}
}
