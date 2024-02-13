
public class Student {
	private int rollno;
	private String name;
	
	public Student()
	{
		//this(2,"Aishish");
		System.out.println("Default");
	}
	public Student(int rollno,String name)
	{
		this();
		System.out.println("Parametarized");
		this.rollno = rollno;
		this.name = name;
		
	}
	public String toStirng() {
		return "Student [rollno="+rollno+", name="+ name+"]";
	}
	public static void main(String [] args) {
		Student s= new Student(1,"Rahul");
		System.out.println(s);
//		Student s=new Student();
//		System.out.println(s);
	}

}
