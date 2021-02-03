package p2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface {

	public static void main(String[] args) {
		
		
	//	Set<Integer> values= new HashSet();
		Set<Integer> values= new TreeSet();
		values.add(5);
		values.add(56);
		values.add(8);
		values.add(5);//supports only uninque elements 
		values.add(86);
		values.add(7);
		for(int i:values)
		{
			System.out.println(i);
		}

	}

}
