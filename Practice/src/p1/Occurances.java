package p1;
import java.io.*; 
import java.util.*; 
public class Occurances {
static Scanner obj=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = obj.nextLine();
         characterCount(str); }
		
		  
		   public static void characterCount(String inputString) 
		    { 
		       
		        HashMap<Character, Integer> charCount= new HashMap<Character, Integer>(); 
		  
		       
		  
		        char[] strArray = inputString.toCharArray(); 
		  
		       
		        for (char c : strArray) { 
		            if (charCount.containsKey(c)) { 
		  
		                
		                charCount.put(c, charCount.get(c) + 1); 
		            } 
		            else { 
		            	  
		               
		                
		                charCount.put(c, 1); 
		            } 
		        } 
		  
		        
		        for (Map.Entry entry : charCount.entrySet()) { 
		            System.out.println(entry.getKey() + " " + entry.getValue()); 
		        } 
		    } 
		  
		   
		   
		    }
	

