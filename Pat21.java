class Pat21 
{
	public static void main(String[] args) 
	{
		char ch='A';
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if (i%2==0)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else 
				{
                  System.out.print(k+" ");
				  k++;
				}
			}
			System.out.println();
		}
	}
}
