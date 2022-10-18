package Basic;

public class Test1
{
	public static void main(String[] args) 
	{
		System.out.println("main metho is running");
		
		m1();
		
		//create object of non static method
		Test1 s=new Test1();
		s.m2();
		
	}
	
	public static void m1()
	{
		System.out.println("hello");
	}
	
	public void m2()
	{
		System.out.println("God Morning");
	}

}
