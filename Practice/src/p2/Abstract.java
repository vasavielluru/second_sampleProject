package p2;

public class Abstract {

	public static void main(String[] args) {
		
		
		Iphone obj=new Iphone();
		SamsungS4 obj1=new SamsungS4();
		
		show(obj);
		show(obj1);
		
//		MaheshPhone obj=new SureshPhone();//cannot instantiate the abstract class
//		obj.call();
//		obj.cook();
//		obj.dance();
//		obj.move();
	}
//		public static void show(Iphone obj)
//		{
//			obj.showConfig();
//		}
//		public static void show(SamsungS4 obj)
//		{
//			obj.showConfig();
//		}
	
	public static void show(Phone obj)
	{
		obj.showConfig();
	}
	

}
 abstract class MaheshPhone
{
	public void call()
	{
		System.out.println("calling....");
	}
	public  abstract void dance();
	public  abstract void move();
	public  abstract void cook();
	
}
 
 abstract class RameshPhone extends MaheshPhone// absract class
 {
	 public void move()
	 {
		 System.out.println("Moving.....");
	 }
 }
 
 class SureshPhone extends RameshPhone// concrete class
 {
	 public void dance()
	 {
		 System.out.println("dancing...");
	 }
	 public void cook()
	 {
		 System.out.println("cooking..");
	 }
 }
 
 
  abstract class Phone
 {
	 public abstract  void showConfig();
 }
 
 
 class Iphone extends Phone
 {
	 public void showConfig()
	 {
		 System.out.println("2 GB, IOS 9.3");
	 }
 }
 
 class SamsungS4  extends Phone
 {
	 public void showConfig()
	 {
		 System.out.println("2GB, LoliPop");
	 }
 }