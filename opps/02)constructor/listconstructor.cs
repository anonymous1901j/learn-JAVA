class program
{
	public static void main(String args[])
	{
		list l=new list(5);
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.print();
	}
}
class list
{
	private int x[];
	public list(int val)
	{
		x=new int[val];
	}
	public list()
	{
		x=new int[10];
	}
	int i=0,k;
	public void add(int val)
	{
		x[i]=val;
		i++;
	}
	public void print()
	{
		for(k=0;k<x.length;k++)
		{
			System.out.println(x[k]);
		}
	}
}
