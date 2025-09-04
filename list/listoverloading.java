class program
{
	public static void main(String args[])
	{
		list l=new list();
		l.create();
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
	public void create(int val)
	{
		x=new int[val];
	}
	public void create()
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
		for(k=0;k<i;k++)
		{
			System.out.println(x[k]);
		}
	}
}
