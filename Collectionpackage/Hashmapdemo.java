package Collectionpackage;
// imp for interview
import java.util.HashMap;
import java.util.Set;

public class Hashmapdemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		
		//insertion nned to some data
		
		/*map.put(1, "ram");
		map.put(2, "shaym");
		map.put(3, "ram");*/
		
		map.put("India", 120);
		map.put("china", 140);
		map.put("US", 30);
		map.put("Italy", 30);
		
		System.out.println(map);
		
		map.put("china", 180);
		System.out.println(map);
		
		//searching
		
		if(map.containsKey("Italy")) {
			
			System.out.println("Italy is presnt ");
			
		}else {
			System.out.println("Italy is not  presnt ");
		}
		
       //iteration
		
		for(java.util.Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
		//Iteration (2)
		Set<String> keys = map.keySet();
		for(String key : keys) {
		System.out.println(key+ " " + map.get(key));
		}

		//Removing
		map.remove("china");
		System.out.println(map);
		}
	}


