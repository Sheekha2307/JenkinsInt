package collectionTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
		Iterator itr = set.iterator();
		while (itr.hasNext())
		{
			System.out.println("Treeset value are "+itr.next());
		}
		
		Iterator itr1 = set.descendingIterator();
		while (itr1.hasNext())
		{
			System.out.println("Treeset value in descending order are "+itr1.next());
		}
		
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		set1.add(56);
		set1.add(30);
		set1.add(80);
		set1.add(100);
		set1.add(10);
		set1.add(67);
		set1.add(109);
		set1.add(50);
		System.out.println("Treeset Integer value are "+set1);
		System.out.println("First method " +set1.first());
		System.out.println("Last method " +set1.last());
		System.out.println("Higher method "+set1.higher(81));
		System.out.println("Reverse element: "+set1.descendingSet());
		set1.pollFirst();
		set1.pollLast();
		System.out.println("Removing highest and lowest value "+set1);
		System.out.println("headsetvalues-less than given element" +set1.headSet(67));
		System.out.println("headset boolean method values-less than given element" +set1.headSet(67, true));
		System.out.println("Subset method " +set1.subSet(30,80));
		System.out.println("Subset boolean method " +set1.subSet(30, false, 80, true));
		System.out.println("Tailset method " +set1.tailSet(56));
		System.out.println("Tailset boolean method " +set1.tailSet(56, false));
		System.out.println("ceiling method " +set1.ceiling(80));
		System.out.println("Higher method "+set1.higher(80));
		System.out.println("Floor method " +set1.floor(80));
		System.out.println("Lower method "+set1.lower(80));
		
	}

}
