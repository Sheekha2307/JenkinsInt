package CollectionMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			TreeMap<Integer, String> map = new TreeMap<Integer, String>();
				map.put(200, "Apple"); //duplicate key
				map.put(102, "Banana");
				map.put(420, "Orange");
				map.put(600, "Kiwi");
				map.put(200, "Grapes"); //duplicate key
				map.put(15, "Strawberry");

				System.out.println("get or default method " +map.getOrDefault(300, "Default"));
		
				for (Map.Entry<Integer, String> m: map.entrySet())
				{
					System.out.println("Key is "+m.getKey()+ " Value is "+m.getValue());
					
				}
				map.putIfAbsent(500, "Pineapple");
				System.out.println("map after putif method");
				for (Map.Entry<Integer, String> m: map.entrySet())
				{
					
					System.out.println("Key is "+m.getKey()+ " Value is "+m.getValue());
				}
				
				TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
				map1.putAll(map); 
				map1.put(1, "Papaya");
				System.out.println("map after putall method");
				for (Map.Entry<Integer, String> m1: map1.entrySet())
				{
					System.out.println("Key is "+m1.getKey()+ " Value is "+m1.getValue());
				}
				
				map1.remove(200); //removing by key
				for (Map.Entry<Integer, String> m1: map1.entrySet())
				{
					System.out.println("Key is "+m1.getKey()+ " Value is "+m1.getValue());
				}
				map1.remove(600, "Kiwi"); //removing by key-value
				for (Map.Entry<Integer, String> m1: map1.entrySet())
				{
					System.out.println("Key is "+m1.getKey()+ " Value is "+m1.getValue());
				}
				map1.replace(15, "Chicco"); //replace
				for (Map.Entry<Integer, String> m1: map1.entrySet())
				{
					System.out.println("Key is "+m1.getKey()+ " Value is "+m1.getValue());
				}
				map1.replace(102, "Banana", "Guava"); //replace(k, old string, new string)
				for (Map.Entry<Integer, String> m1: map1.entrySet())
				{
					System.out.println("Key is "+m1.getKey()+ " Value is "+m1.getValue());
				}

				System.out.println("contains key " +map1.containsKey(15));
				System.out.println("contains value "+map1.containsValue("Guava"));
				
				map1.replaceAll((k,v)->"Mango"); //replaceAll
				
				for (Map.Entry<Integer, String> m1: map1.entrySet())
				{
					System.out.println("Key is "+m1.getKey()+ " Value is "+m1.getValue());
				}
				
				

	}

}
