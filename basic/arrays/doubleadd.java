class program
{
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		int i,j;
		for(i=0;i<a.length;i++)
		{
		for(j=0;j<a[i].length;j++)
		{
			a[i][j]=Integer.parseInt(System.console().readLine());
		}
		}
		System.out.print("second matixc");
		for(i=0;i<b.length;i++)
		{
		for(j=0;j<b[i].length;j++)
		{
			b[i][j]=Integer.parseInt(System.console().readLine());
		}
		}
		for(i=0;i<a.length;i++)
		{
		for(j=0;j<a[i].length;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
		}
		for(i=0;i<a.length;i++)
		{
		for(j=0;j<a[i].length;j++)
		{
			System.out.print(c[i][j]);
		}
		System.out.println();
		}
	}
}
