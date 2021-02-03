package p2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.Iterator;

public class Collections_practice {
	
	
	//Collection is an interface in java

	public static void main(String[] args) {
		 
		List<Integer> values=new ArrayList<>();
		values.add(900);
		values.add(0);
		values.add(300);
		values.add(3);
		values.add(90);
		values.add(9);
//		values.add("vasu");
//		values.add(5.3f);
		values.add(3, 2);
		//System.out.println(values.get(0));
		
		Comparator<Integer> com=new ComImpl();
		
		
		
		Collections.sort(values,com);
		//values.forEach(System.out::println);
		//Collections.reverse(values);
//		
//		Iterator i=values.iterator();		
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
//values.remove(9);
		for(int i:values)
		{
			System.out.println(i);
		}
			
	}

}
