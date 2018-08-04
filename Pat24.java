class Pat24 
{
	public static void main(String[] args) 
	{
		int space=4;
		int star=1;
		for(int i=1;i<=5;i++)
		{
			int m=1;
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
				
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(m+" ");
				m++;
				
			}
			System.out.println();
            space--;
			star+=2;
		}
	}
}
