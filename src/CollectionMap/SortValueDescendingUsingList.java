package CollectionMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class SortValueDescendingUsingList {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(9,"Sheekha");
			map.put(70,"Nandu");
			map.put(4, "Meghs");
			map.put(60, "Anshul");
			
			LinkedList<String> list = new LinkedList<String>(map.values());
			System.out.println("Original list" +list);
			Collections.sort(list);
			System.out.println("Ascending order" +list);
			Iterator itr = list.descendingIterator();
			while (itr.hasNext())
			{
				System.out.println("reverse order " +itr.next());
			}
			
					}

	}



