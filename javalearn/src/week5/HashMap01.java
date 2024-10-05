package week5;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//it like K->key V->value pairs
		//HashMap<K, V>
		
		ConcurrentHashMap<String, String> hm=new ConcurrentHashMap<>();
		//HaspMap and ConcurrentHashMap both are same 
		//In ConcurrentHashMap can remove the element while running its the only difference
		
//		HashMap<String, String> hm=new HashMap<>();
		hm.put("name", "Gokul");
		hm.put("time", "8am");
		hm.put("class", "java");
		hm.put("class", "sql");
		//same key la different values iruntha last values will override it
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.get("name"));
		hm.remove("class");
		System.out.println(hm);
		System.out.println(hm.containsKey("name"));
		System.out.println(hm.containsValue("Gokul"));
		
		System.out.println("---------");
		//key match it get the value
		//key doesn't print the default value 
		System.out.println(hm.getOrDefault("name", "not found"));
		System.out.println(hm.getOrDefault("class", "not found"));
		System.out.println("---------");
		
		//keys mattum print pana
		hm.keySet().forEach(e ->{
			System.out.println(e);
		});
		System.out.println("---------");
		//values mattum print pana
		hm.values().forEach(e ->{
			System.out.println(e);
		});
		System.out.println("---------");
		//both key and value print pana
		hm.entrySet().forEach(e ->{
			System.out.println(e);
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
			hm.remove(e.getKey());
		});;
		System.out.println(hm);
		
		
		
		
	}

}
