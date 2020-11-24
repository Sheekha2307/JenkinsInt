package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class D0107CollectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put(1, 101);
		map.put(2, 200);
		map.put(3, "Test1");
	
		/*
		 * map.keySet(); map.values();
		 */
		System.out.println(map);
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(101, "Test12");
		map1.put(101, "test");
		map1.put(102, "Test123");
		System.out.println("Put method for string value " +map1);
		map1.putAll(map);
		System.out.println("putAll " +map1);
	
		System.out.println("contains method" +map1.containsKey(1));
		System.out.println("Contains value method "+map1.containsValue("test"));//looking for exact match?? Test is giving false value
		map1.clone();//how to print?
		System.out.println("Entry set method " +map1.entrySet()); //explain
		System.out.println("Equals method " +map1.equals(map));
		System.out.println(map1.isEmpty());
		map1.putIfAbsent(109, "Test1234");
		System.out.println("PutIfAbsent method " +map1);
		System.out.println("Get method " +map1.get(101));
		System.out.println(map1.getOrDefault(200, "Defualt value"));
		System.out.println("getClass method " +map1.getClass()); //explain ouput
		System.out.println("Size of map1 is " +map1.size());
		System.out.println("values method " +map1.values());
		System.out.println(map1.remove(101));
		System.out.println("values method " +map1.values());
		System.out.println(map1.remove(109, "Test1234"));
		System.out.println("values method " +map1.values());
		
		Set<Integer> mapset1 = map1.keySet();
		for (int i : mapset1)
		{
			System.out.println("Keys in map are "+i);
		}
		Set<Entry<Integer, String>> mapset2 = map1.entrySet();
		for (Entry<Integer, String> j : mapset2)
		{
			System.out.println("value in map are "+j);
		}
		Iterator itr = mapset2.iterator();
		while (itr.hasNext())
		{
			System.out.println("traversing through iterator " +itr.next());
		}
		
		//Set mapset1 = new Set(map1);
		System.out.println("Key set is " +map1.keySet());
		System.out.println("Entry set is " +map1.entrySet());
		
		//Iterator itr = map1.
		//while ()
		
		HashMap map2 = new HashMap(map1);
		map2.put(map1, map1); //explain the output
		System.out.println(map2);
	}

}
