//Method overriding to get details of employee's by using inheritence//
class EmployeeDetails
{
	final int id;
	String name;
	double salary;
	int yearsOfExperience;

	EmployeeDetails(int id,String name,double salary,int yearsOfExperience)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.yearsOfExperience=yearsOfExperience;
	}
	public void empInfo()
	{

		System.out.println("Employeeid :" + id);
		System.out.println("Employeename :" + name);
		System.out.println("salary :" + salary + "L");
		System.out.println("Years of experience :" + yearsOfExperience +"yrs");
	}

}
class Devlopers extends EmployeeDetails
{
	String language;
	Devlopers(int id,String name,double salary,int yearsOfExperience,String language)
	{
		super(id,name,salary,yearsOfExperience);
		this.language=language;
	}
	public void empInfo()
	{
		System.out.println("======================");
		super.empInfo();
		System.out.println("Devlopers Language :" + language + " " +"Language");
		System.out.println("======================");
	}
}
class TestEngineer extends EmployeeDetails
{
	String testing;
	TestEngineer(int id,String name,double salary,int yearsOfExperience,String testing)
	{
		super(id,name,salary,yearsOfExperience);
		this.testing=testing;
	}
	public void empInfo()
	{
		System.out.println("======================");
		super.empInfo();
		System.out.println("Type of testing :" + testing +" " + "Testing");
		System.out.println("======================");
	}
}

class Company  
{
	public static void main(String[] args) 
	{
		System.out.println("main Starts...");
		Devlopers d1=new Devlopers(10,"Jhon",10.2,5,"java");
		Devlopers d2=new Devlopers(13,"Joe",11.5,2,"C++");
		d1.empInfo();
		d2.empInfo();
		TestEngineer t1=new TestEngineer(9,"Max",12.2,7,"Manual");
		TestEngineer t2=new TestEngineer(17,"Mark",6.3,4,"Automation");
		t1.empInfo();
		t2.empInfo();
        System.out.println("main Ends...");
	}
}
