package p1;

public class A {
	  int j=10;
	 // A object1=new A();
	public static void main(String[] args) {
		A object=new A();
		object.j=12;
		System.out.println(object.j);
		test();
		
	}
	
	 static  void test()
	{
		 A object1=new A();
		System.out.println(object1.j);
	}

}
