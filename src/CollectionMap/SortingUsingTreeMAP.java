package CollectionMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingUsingTreeMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(9,"Sheekha");
		map.put(70,"Nandu");
		map.put(4, "Meghs");
		map.put(60, "Anshul");
		
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>(map);
		for (Map.Entry<Integer, String> entry : tree.entrySet())
		{
			//Treemap can sort only key not value. if you comment key line below then also value will not be printed in sorted order
			System.out.println("Key value is " +entry.getKey());
			System.out.println("Value is "+entry.getValue());
		}
	}

}
