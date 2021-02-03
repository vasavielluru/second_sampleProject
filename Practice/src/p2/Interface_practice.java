package p2;

interface printable{  
	void print();  
	} 
public class Interface_practice  implements printable{
	public void print(){System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 
			 
			Interface_practice obj = new Interface_practice();  
			obj.print();  
			
			
			 System.out.println(MultiplyFun.Multiply(2, 4)); 
			  
		        System.out.println(MultiplyFun.Multiply(5.5, 6.3)); 
			 }
}
	//Polymorphism@OverLoading
	class MultiplyFun { 
		  
	    // Method with 2 parameter 
	    static int Multiply(int a, int b) 
	    { 
	        return a * b; 
	    } 
	  
	    // Method with the same name but 2 double parameter 
	    static double Multiply(double a, double b) 
	    { 
	        return a * b; 
	    } 
	} 
			
	


