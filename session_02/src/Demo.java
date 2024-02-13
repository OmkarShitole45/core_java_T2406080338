
public class Demo {
	private int day,month,year;
	
	public int getDay()
	{
		return day;
	}
	public void setDay(int d)
	{
		day=d;
	}
	public int getMonth()
	{
		return month;
	}
	public void setMonth(int m)
	{
		month=m;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int y)
	{
		year=y;
	}
	public static void main(String [] args)
	{
		Demo d=new Demo();
		d.setDay(7);
//		int a=getDay();
//		System.out.println("Day = "+a);
		System.out.println("D = "+d.getDay());
		
		Demo m=new Demo();
		m.setDay(2);
//		int b=getDay();
//		System.out.println("Month = "+b);
		System.out.println("M = "+m.getDay());
		
		Demo y=new Demo();
		y.setDay(24);
		
//		int c=getDay();
//		System.out.println("Year = "+c);
		System.out.println("Y = "+y.getDay());
		
	}

}
