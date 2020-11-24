package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class D2406ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Integer> list1 = new ArrayList();  //1st way
		list1.add(101);
		list1.add(102);
		//System.out.println(list1.size());
		list1.add(101);
		list1.add(104);
		
		for(int i=0; i<list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}
		/*
		 * get set lastindex
		 */
		//System.out.println(list1.set(1, 402));  in this case 102 will be printed first and then operation will be performed
		list1.set(1, 402);
		System.out.println(list1.get(1));
		
		System.out.println(list1.lastIndexOf(101));
		
		System.out.println("sublist");
	List <Integer> list2 =list1.subList(0, 2); //end index is exclusive
		for (int i=0; i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}
		
		int size1 = 5;
		List <Integer> list3 = new ArrayList(5); //way2
		list3.add(600);
		list3.add(300);
		list3.add(400);
		Collections.sort(list3);
		System.out.println("sort" +list3);
		
		List list4 = new ArrayList();
		list4.add(list3);
		list4.add("Sheekha");
		list4.add(100.5);
		for (int i=0; i<list4.size(); i++)
{
	System.out.println("Hetrogenous list " +list4.get(i));
}
		System.out.println("Iterating through for-each loop for list2");
		for (Integer name:list2)
			System.out.println(name);
		
		List <Integer> list5 = new ArrayList(list4); //way3
		
		
	}

	
}
