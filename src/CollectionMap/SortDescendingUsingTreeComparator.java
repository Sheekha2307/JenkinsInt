package CollectionMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortDescendingUsingTreeComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(9,"Sheekha");
		map.put(70,"Nandu");
		map.put(4, "Meghs");
		map.put(60, "Anshul");
		
		//1. create an empty treemap with comparator
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				//Here o2.compareTo(o1) is used for descending. o1.compareTo(o2) will return ascending order
				return o2.compareTo(o1);
			}});
		//2. Add map values to tree
		tree.putAll(map);
		//3. traverse
			for (Map.Entry<Integer, String> entry : tree.entrySet())
			{
				//Treemap can sort only key not value. if you comment key line below then also value will not be printed in sorted order
				System.out.println("Key value is " +entry.getKey());
				
			}		
		
	}

}
