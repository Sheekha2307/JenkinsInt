package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import com.google.common.hash.HashCode;

public class D2606HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set1 = new HashSet();
		set1.add(101);
		set1.add(102);
		set1.add(0);
		set1.add(101);
		set1.add(0);
		set1.remove(0);
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
		  
		  
		  Set<String> set2 = new HashSet(set11); //way 2. here i have used int object but use same data type else exception will be thrown
		  set2.add("Test1");
		  set2.add("Test2");
		  
		  Iterator<String> i1 = set2.iterator(); 
		  while (i1.hasNext()) 
		  {
			  System.out.println("value in set1 is "+i1.next());
		  }
		  Set<String> set3 = new HashSet<String>(1, 0.75f); //way3
		  set3.add("set3-1");
		  set3.add("set3-2");
		  
		  Set <Integer> set4 = new HashSet<Integer>((int) 0.80)	;
		  
		  System.out.println("LinkedHashset code starts");
		  Set <Integer> ls1 = new LinkedHashSet();
		  ls1.add(900);
		  ls1.add(901);
		  ls1.add(809);
		  System.out.println(ls1);
		  
		  
		 

	}
}
