package CollectionMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Map<Integer, String> map = new HashMap<Integer, String>();
	map.put(1, "Sheekha");
	map.put(5, "Aanchal");
	map.put(2, "Reyu");
	map.put(6, "Piyush");
	System.out.println("Printing map by syso " +map);
	Set set = map.entrySet();

	Iterator itr = set.iterator();
	while (itr.hasNext())
	{
		System.out.println("Iterating key-value pair by entrySet " +itr.next());
	}
	Set key = map.keySet();
	Iterator itr1 = key.iterator();
	while (itr1.hasNext())
	{
		System.out.println("Iterating only key by keySet " +itr1.next());
	}
	
	System.out.println("****Non-Generic (old style)****");
	Iterator itr2 = set.iterator();
	while(itr2.hasNext())
	{
		Map.Entry entry = (Map.Entry) itr2.next();
		System.out.println("key is " +entry.getKey()+ " and Value is " +entry.getValue());
	}
	
	System.out.println("****Generic (New style)****");
	for (Map.Entry<Integer, String> m: map.entrySet())
	{
		System.out.println("key is " +m.getKey()+ " and Value is " +m.getValue());
	}
	//map.entrySet() -Returns a Set view of the mappings contained in this map    
    
    //.stream() - Returns a sequential Stream with this collection as its source  
     
    //.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))- Sorted according to the provided Comparator  
      
    //.forEach(System.out::println);  - Performs an action for each element of this stream  
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out:: println);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out:: println);

	}
}
