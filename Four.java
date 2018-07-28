class Four 
{
	public static void main(String[] args) 
	{
		int mul=1;
		for(int i=5;i<=25;i++)
		{
			if(i%4==0)
			{
			  mul*=i;
			}
		}
			
            System.out.println("product of muliples of i="+mul);	
	}
}
