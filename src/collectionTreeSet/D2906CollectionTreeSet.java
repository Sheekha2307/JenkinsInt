package collectionTreeSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;

import com.google.common.hash.HashCode;

public class D2906CollectionTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set1 = new HashSet();
		set1.add(200);
		set1.add(102);
		set1.add(0);
		set1.add(101);
		set1.add(0);
		set1.remove(0);
		System.out.println(set1);
		System.out.println(set1.contains(101));
		

		// System.out.println(set1); -->This will return all value but if we want specific data then it is not useful
		
		  Iterator<Integer> i = set1.iterator(); 
		  while (i.hasNext()) 
		  {
			  System.out.println("value in set1 is "+i.next());
		  }
		  
		  System.out.println("String data type");
		  
		  Set<String> set11 = new HashSet();
		  set11.add("Test22");
		  set11.add("Test23");
		  TreeSet <Integer> tsint = new TreeSet<Integer>();
		  tsint.addAll(set1);
		  tsint.ceiling(150);
		 System.out.println("headset method " +tsint.headSet(200)); //excluding 200- less than value
		  System.out.println("first method " +tsint.first());
		  System.out.println("ceiling method by integer " +tsint.ceiling(150));
		  System.out.println("tailset method "+tsint.tailSet(102)); //including 102- greater than or equal to
			/*
			 * System.out.println("Poll method " +tsint.pollFirst()); //retrieves and remove
			 * first element System.out.println("Poll last method " +tsint.pollLast());
			 * //retrieves and remove last element
			 */
		  
		    System.out.println("Descending Set " +tsint.descendingSet()); //way1
		  TreeSet<Integer> reverse = (TreeSet<Integer>) tsint.descendingSet();//way 2
		  System.out.println("Descending set in way 2 " +reverse);
		  
		  
		 TreeSet <String> ts = new TreeSet<String>();
		 ts.add("Mango");
		 ts.add("Apple");
		 
		 
		 TreeSet <String> ts1 = new TreeSet(set11);
		 ts1.add("Mango");
		 ts1.add("Apple");
		 ts1.ceiling("Mango");
		 System.out.println("ceiling method " +ts1.ceiling("Mango"));
		 System.out.println("TreeSet value " +ts1);
		 for (String name : ts1)
		 {
			 System.out.println("Tree set traversing by for each " +name);
		 }
		 Iterator itr = ts1.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println("Tree set traversing by iterator " +itr.next());
		 }

	}
}

