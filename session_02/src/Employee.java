
public class Employee {
	private int empid;
	private String empname;
	private double empsalary;
	
	public Employee()
	{
		System.out.println("Default Consturctor called");
//		empid=111;
//		empname="Rahul";
//		empsalary=450000d;
	}
	public Employee(int i,String n,double d)
	{
		System.out.println("paramaterized Consturctor called");
		empid=i;
		empname=n;
		empsalary=d;
	}
	public String toString()//string representation of object = object class
	{
		return "Employee = "+empid+" "+empname+" "+empsalary;
	}
	public static void main(String [] args) {
		Employee e=new Employee();
		System.out.println(e);
		Employee e1=new Employee(222,"Dravid",785000d);
		System.out.println(e1);

	}

}
