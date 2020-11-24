package collectionTreeSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class D30TreesetDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<D30TreeSetBook> book = new TreeSet<D30TreeSetBook>(new D30PriceCompare()); //way 1 passing object
		//way2
		
		/*
		 * D30PriceCompare d20 = new D30PriceCompare(); TreeSet<D30TreeSetBook> book =
		 * new TreeSet<D30TreeSetBook>(d20);
		 */
		
		
		//below is hetrogenous list, hence for tree set it will be confused which element to be used for sorting and hence exception is thrown
		D30TreeSetBook b1 = new D30TreeSetBook("Red", 10, 1000, "Sheekha");
		D30TreeSetBook b2 = new D30TreeSetBook("Yellow", 20, 4002, "Piyush");
		D30TreeSetBook b3 = new D30TreeSetBook("Orange", 30, 1003, "Reyu");
		D30TreeSetBook b4 = new D30TreeSetBook("Pink", 15, 2000, "Aanchal");
		
		book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		
		
		  for(D30TreeSetBook b: book) {
		  System.out.println("traversing treeset elements " +b.color+ " "+b.numberOfPages+" "+b.price+" " +b.name);
		  
		  
		  }
		 
		
		
		
	}
	

}
