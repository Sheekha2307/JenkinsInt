package CollectionMap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, Book> map = new LinkedHashMap<Integer, Book>();
		Book b1 =new Book("Red", 10, 5000, "Sheekha");
		Book b2 =new Book("Yellow", 20, 100, "Anshul");
		Book b3 =new Book("Pink", 15, 2500, "Meghna");
		Book b4 =new Book("Orange", 200, 5000, "Nandu");
		map.put(1, b1);
		map.put(4, b2);
		map.put(2, b4);
		map.put(5, b3);

		for (Map.Entry<Integer, Book> m: map.entrySet())
		{
			System.out.println("Key "+m.getKey()+ " color : "+m.getValue().color+ " Number of pages : "+m.getValue().numberOfPages+ " Price : "+m.getValue().price+ " Name : "+m.getValue().name);
		//if only m.getvalue() is used then garbage value is thrown (as there are 4 values within Book object) hence need to use user defined attributes like m.getValue().color
		
		}
		System.out.println(map.keySet());
		Set<Integer> key = map.keySet();
		for (int k: key)
		{
			System.out.println("key is "+k);
		}
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(new ComparatorExample())).forEach(System.out::println);
		/*
		 * map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.
		 * out::println);
		 * map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out
		 * :: println);
		 * 
		 * map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.
		 * reverseOrder())).forEach(System.out:: println);
		 */	}

}
