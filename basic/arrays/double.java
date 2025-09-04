class program
{
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
	
		int i,j;
		for(i=0;i<a.length;i++)
		{
		for(j=0;j<a[i].length;j++)
		{
			a[i][j]=Integer.parseInt(System.console().readLine());
		}
		}
		for(i=0;i<a.length;i++)
		{
		for(j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]);
		}
		System.out.println();
		}
	}
}
