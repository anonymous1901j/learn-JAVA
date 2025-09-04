class program
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int i,j;
		for(i=0;i<10;i++)
		{
			a[i]=Integer.parseInt(System.console().readLine());
		}
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}
}
/* normal array
the output of this program is 
1
2
3
4
5
6
7
8
9
10
1
2
3
4
5
6
7
8
9
10
*/
