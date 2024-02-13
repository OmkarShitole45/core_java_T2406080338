
public class Employee_01 {
	private int empNo;
	private float salary;
	private static float totalSalary;
	private static int n=1;
	
	public Employee_01(float salary)
	{
			
		this.empNo=n++;
		this.salary=salary;
		
		totalSalary+=salary;
		
	}
	/*
	 * public int getCount() { //empNo=1; return empNo; } public static int Sum() {
	 * return totalSalary+=totalSalary; }
	 */
	
	
	
	public static void main (String[] args) {
		System.out.println("Main Method Called");
		Employee_01 e1 = new Employee_01(45000f);
		System.out.println(e1);
		Employee_01 e2= new Employee_01(50455f);
		System.out.println(e2);
		Employee_01 e3=new Employee_01(45465f);
		System.out.println(e3);
		
		System.out.println("Total Salary = "+totalSalary);
		
		//System.out.println("Employee Count = "+e1.getCount());
	}



	@Override
	public String toString() {
		return "Employee_01 [empNo=" + empNo + ", salary=" + salary + ",totalSalary=" + totalSalary +"]";
	}
}

