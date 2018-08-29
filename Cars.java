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
		public void carInfo()
		{
			System.out.println("===========================");
			System.out.println("Brand name is:" + brandName);
			System.out.println("Top speeed is:" + topSpeed);
			System.out.println("milage is:" + milage);
			System.out.println("color is:" + color);
			System.out.println("===========================");
		}
	
}

class Cardetails
{
	public static void main(String [] args)
	{
		Car rv1=new Car("audi",180,32,"red");
		Car rv2=new Car("benz",190,28,"black");
		Car rv3=new Car("bmw",220,21,"white");
		rv1.carInfo();
		rv2.carInfo();
		rv3.carInfo();

	}
}
