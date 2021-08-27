package week3.day1;

public class Assign4SubStudentClass extends Assign4SuperClass {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Student1 info: " + id);
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student2 info: "+id+" "+name);
		
	}
	
	public void getStudentInfo(int id,String name,String email)
	{
		System.out.println("Student3 info: "+id+" "+name+" "+email);
		
	}		

	
	public void getStudentInfo(int id,String name,String email,long phno)
	{
		System.out.println("Student3 info: "+id+" "+name+" "+email+" "+phno);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign4SubStudentClass subObj=new Assign4SubStudentClass();
		subObj.getStudentInfo();
		subObj.getStudentInfo(100);
		subObj.getStudentInfo(200, "Raje");
		subObj.getStudentInfo(300, "Prabha", "gmail.com");
		subObj.getStudentInfo(400, "Praji", "yahoo.com",9940405294l);

	}

}
