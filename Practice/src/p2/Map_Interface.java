package p2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_Interface {

	public static void main(String[] args) {
	
		Map<String,String> map=new TreeMap<>();
		map.put("name", "vasu");
		map.put("desig", "engineer");
		map.put("company", "Mindtree");
		//map.put(78,false);
		
//		Set<String> keys=map.keySet();
//		for(String key : keys)
//		{
//			System.out.println(key + " " + map.get(key));
//		}
		
		
		Set<Map.Entry<String, String>> values =map.entrySet();
		for(Map.Entry<String,String> e: values)
		{
			System.out.println(e.getKey()+ " "+e.getValue());
		}
		
		

	}

}
