package Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import collectionTreeSet.D30TreeSetBook;

import java.util.Set;

public class D0107CollectionLinkedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> linkmap = new LinkedHashMap<Integer, String>();
		linkmap.put(101, "Sheekha");
		linkmap.put(102, "Meghna");
		linkmap.put(200, "Deepali");
		linkmap.put(50, "Anshul");
		
		Set<Integer>key = linkmap.keySet();
		
		for (int i : key)
		{
			System.out.println("Key set method value is " +i);
		}
		
		Set<Entry<Integer, String>> entryset = linkmap.entrySet();
		
		for(Entry<Integer, String> i: entryset)
		{
			System.out.println("Key "+i.getKey() + " and value is " +i.getValue());
		}
		
		LinkedHashMap<Integer, D30TreeSetBook> linkmap2 = new LinkedHashMap<Integer, D30TreeSetBook>();
		D30TreeSetBook b1 = new D30TreeSetBook("Red",2, 100, "Sheekha");
		D30TreeSetBook b2 = new D30TreeSetBook("Orange",5, 406, "Anshul");
		D30TreeSetBook b3 = new D30TreeSetBook("Yellow",9, 200, "Meghna");
		D30TreeSetBook b4 = new D30TreeSetBook("Pink",7, 300, "Nandu"); 
		linkmap2.put(101, b1);
		linkmap2.put(200, b2);
		linkmap2.put(50, b3);
		linkmap2.put(300, b4);
		Set<Entry<Integer, D30TreeSetBook>> Book = linkmap2.entrySet();
		for (Entry<Integer, D30TreeSetBook> book1: Book)
		{
			System.out.println("color is " +book1.getValue().color + " number of pages are " +book1.getValue().numberOfPages+ " Price " +book1.getValue().price+ " Name is " +book1.getValue().name);
		}
		
		/*
		 * Iterator itr = key.iterator(); while (itr.hasNext()) {
		 * System.out.println("Traversing through iterator" +itr.next()); }
		 */ 
		/*
		 * Collections.sor System.out.println("Key value is " +linkedmapset);
		 * 
		 * LinkedHashMap linkmap1 = new LinkedHashMap<K, V>();
		 * 
		 */
	}

}
