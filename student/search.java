class student
{
	private int sid;
	private String sname;
	private double fee;
	public void read()
	{
		sid=Integer.parseInt(System.console().readLine());
		sname=System.console().readLine();
		fee=Double.parseDouble(System.console().readLine());
	}
	public void print()
	{
		System.out.printf(" %d %s %f",sid,sname,fee);
	}
	public int getid()
	{
		return (sname);
	}
}
class program
{
	public static void main(String args[])
	{
		int search;
		student s[];
		s=new student[5];
		for(int i=0;i<5;i++)
		{
			s[i]=new student();
			
			s[i].read();
		}
		
		for(int i=0;i<5;i++)
		{
			s[i].print();
		}
		search=Integer.parseInt(System.console().readLine());
		for(int i=0;i<5;i++)
		{
			if(search==s[i].getid())
			{
				s[i].print();
				break;
			}
			if(i==4)
			{
				System.out.println("not found");
			}
		}
	}
}
