
public class Sample_one {
	
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		MultiplyFun obj=new MultiplyFun();
		  
		        System.out.println(obj.Multiply(2, 4)); 
		  
		        System.out.println(MultiplyFun.Multiply(5.5, 6.3)); 
		     
		} 

	public  void test(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
		

}
	class MultiplyFun { 
		  
	    // Method with 2 parameter 
	     int Multiply(int a, int b) 
	    { 
	        return a * b; 
	    } 
	  
	    // Method with the same name but 2 double parameter 
	    static double Multiply(double a, double b) 
	    { 
	        return a * b; 
	    } 
	} 