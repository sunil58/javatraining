class Rect 
{
	int l;
	int w;
	String c;
	Rect(int l,int w)
	{
     this.l=l;
	 this.w=w;
	}
	Rect(int l,int w,String c)
	{
		this.Rect(l,w);
		this.c=c;
	}
	public void rectInfo()
	{
		System.out.println("====================");
		System.out.println("length is:"+l);
		System.out.println("width is:"+w);
		System.out.println("color is:"+c);
		System.out.println("====================");

	}
}
 class Mspaint
 {
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Rect rv1=new Rect(3,4);
		Rect rv2=new Rect(7,9,"red");
		rv1.rectInfo();
		rv2.rectInfo();
		System.out.println("main ends...");
	}
 }
