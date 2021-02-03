package p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) throws IOException {
		Scanner obj = new Scanner(System.in);
		// int a=obj.nextInt(),b=obj.nextInt(),c=0;
//		FileReader file = new FileReader("C:\\test\\a.txt"); 
//        BufferedReader fileInput = new BufferedReader(file); 
//          
//        // Print first 3 lines of file "C:\test\a.txt" 
//        for (int counter = 0; counter < 3; counter++)  
//            System.out.println(fileInput.readLine()); 
		int k = obj.nextInt();
try
{
		if (k == 0) {
			throw new MyException(null);
		} else
			System.out.println(k);
}
        catch(Exception e)
        {
        	System.out.println(e);
        	
        	
        }
try {
    test();
 }catch(MyException e) {          
    System.out.println(e.getMessage());
 }
}  

public static void test() throws MyException {
 try {
    int a = 0;
    int b = 1;
    System.out.println(b/a);
 }catch(Exception e) {
    throw new MyException(e);
 }
}

		// fileInput.close();
		/*
		 * try { c=a/b; System.out.println(c); } catch(NullPointerException e) {
		 * 
		 * }
		 * 
		 * finally { System.out.println("hai"); } System.out.println("hia");
		 */


}

class MyException extends Exception
{
	public MyException(Exception msg)
	{
		super(msg);
	}
}



/*
 * 1. If exception arises, then , the statements below that line do not execute
 * 2. If exception is not arised then, the statements inside catch do not
 * 	execute 
 * 3. If the arised exception is not same as mentioned in the catch , in
 * that case if we need to execute the below statements then we can use finally
 * for then to execute 
 * 4. Throws is used to supress errors at compile time
 * 5. Throw is used to throw the exception by the programer..and if you want to execute the stmts below exception , u need to write throw
 * 		in try and catch block or else you can just write normally
 * 6. To use user defined exception, you must use throw keyword to specify such exception
 */