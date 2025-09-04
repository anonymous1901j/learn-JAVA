class program
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int i,search;
		for(i=0;i<10;i++)
		{
			a[i]=Integer.parseInt(System.console().readLine());
		}
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		search=Integer.parseInt(System.console().readLine());
		for(i=0;i<10;i++)
		{
			if(a[i]==search)
			{
				System.out.println(a[i]);
				break;
			}
			if(i==9)
			{
				System.out.println("element not found");
			}
		}
	}
}?*
