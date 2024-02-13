package session_04;

public class Date {
	 private int dd,mm,yy;
//	 private final float PI;
//	 
//	 public Date() {
//		 PI=3.14f;
//	 }

	 
	 
	public Date(int dd, int mm, int yy) {
		//PI=3.14f;
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}



	
	public String toString() {
		return  dd + "/" + mm + "/" + yy ;
	}
	
	public static void main(String[] args) {
		final Date b =new Date(13,2,2024);
		Date d=new Date(14,2,2024);
		
		
	}
	
	 

}
