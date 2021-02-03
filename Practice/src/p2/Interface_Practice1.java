package p2;


interface A
{
	 void show();// By default this method is public  and  abstract
}

 class Interface_Practice1 implements A {
	public static void main(String[] args)
	{
		A obj=new Interface_Practice1();//creating object based on class
		Interface_Practice1 object = new Interface_Practice1();
		obj.show();
		object.create();
		
		A obj2=new A()//creating class based on object
				{
					public void show()
					{
						System.out.println("discovery");
					}
				};
				obj2.show();
	}
	
	
	public void show()
	{
		System.out.println("hai");
	}
	public void create()
	{
		System.out.println("create");
	}
	

}
