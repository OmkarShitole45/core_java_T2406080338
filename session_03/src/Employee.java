
public class Employee {
	private int empid;
	private String empName;
	private float empSalary;
	private static int count;
	
	public Employee(){
		
	}
	public Employee(int empid,String empName,float empSalary)
	{
		this.empid=empid;
		this.empName=empName;
		this.empSalary=empSalary;
		count++;
	}
	public static int getCount() {
		return count;
	}
	public String toString() {
		return "Employee [empid]= "+empid +"[empName] = "+ empName +"[empSalary] = "+ empSalary ;
	}
	static {
		System.out.println("Static Block Called");
		count =60;
	}
	public static void main (String[] args) {
		System.out.println("Main Method Called");
		Employee e1 = new Employee(11,"Omkar",45505.654f);
		System.out.println(e1);
		Employee e2= new Employee(22,"Ritesh",4658405.654f);
		System.out.println(e2);
		Employee e3=new Employee(33,"vb",456405.654f);
		System.out.println(e3);
		
		System.out.println("Employee Count = "+e1.getCount());
		System.out.println("Employee Count = "+e2.getCount());
		System.out.println("Employee Count = "+e3.getCount());
		System.out.println("Employee Count = "+Employee.getCount());



	}

}
