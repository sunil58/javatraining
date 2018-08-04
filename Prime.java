class Prime 
{
	public static void main(String[] args) 
	{
      no(22);
	}
	public static void no(int n)
	{
		int status=0;
		for(int i=2;i<=n-1;i++)
		{
			if (n%i==0)
			{
				status=1;
				break;
			}
		}
		if(status==0)
		{
			System.out.println("its is a prime no");
		}
		else
		{
			System.out.println("it is not a prime no");
		}
	}
}
