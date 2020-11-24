package CollectionLinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class D0407LinkedList {

	/* Why is it not allowing this???
	 * Collection arrlist3 =new ArrayList<String>();
	 * 
	 * Collection list2 = new LinkedList<String>();
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList();
		list.add("Welocme");
		list.add("Eclipse");
			
		ArrayList<String> arrlist = new ArrayList<String>(); 
		//following is also correct - 
		/*
		 * Collection arrlist1 = new ArrayList<String>(); arrlist1.add(arrlist);
		 */
		arrlist.add("to");
		arrlist.add("the");
		arrlist.add("most");
		arrlist.add("powerful");
		arrlist.add("online");
		arrlist.add("Technology");
		arrlist.add("Taining");
		arrlist.add("center");
		arrlist.add("the");
		
		System.out.println("Linkedlist before appending arraylist " +list);
		
		/*
		 * list.addAll(arrlist);
		 * System.out.println("Linkedlist after appending arraylist " +list);
		 */
		
		/*
		 * arrlist.addAll(list); System.out.println("Array list " +arrlist);
		 */
		list.add(1, "All");
		list.addAll(2, arrlist);
		System.out.println("Linkedlist after appending arraylist " +list);
		System.out.println("index of first occurence of 'the' is "+list.indexOf("the"));
		System.out.println("index of last occurence of 'the' is "+list.lastIndexOf("the"));
		
		list.removeFirstOccurrence("the");
		System.out.println("Linkedlist after removeFirstOccurrence('the') " +list);
		/*
		 * list.removeFirst(); System.out.println("Linkedlist after removefirst()"
		 * +list);
		 */
		list.remove();
		System.out.println("Linkedlist after remove()" +list);
		//list.descendingIterator();
		//System.out.println(list);
		LinkedList<String> clonelist =(LinkedList<String>) list.clone();
		
		  list.clear(); 
		  System.out.println("Cleared list" +list);
		  System.out.println("Clonedlist "+clonelist);
		  clonelist.offer("IDE");
		  System.out.println("offer method for IDE "+clonelist);
		  clonelist.offerLast("Bye");
		  System.out.println("offerlast method for Bye "+clonelist);
		  clonelist.offerFirst("Welcome");
		  System.out.println("offerfirst method for Welcome "+clonelist);
		  clonelist.set(9, "of");
		  System.out.println("clonelist after set method "+clonelist);
		  System.out.println(clonelist.poll());
		  System.out.println("clonelist after poll method "+clonelist);
		  clonelist.pollFirst();
		  System.out.println("clonelist after pollfirst method "+clonelist);
		  clonelist.pollLast();
		  System.out.println("clonelist after polllast method "+clonelist);
		 System.out.println(clonelist.peek());
		System.out.println("clonelist after peek method "+clonelist);
		System.out.println(clonelist.get(0));
		Iterator itr = clonelist.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println("Traversing in reverse order "+itr.next());
		}
		
		 
		  
		  LinkedList<Integer> stack = new LinkedList<Integer>();
		  stack.push(1); //equivalent to addFirst method (FIFO)
		  stack.push(2);
		  stack.push(10);
		  System.out.println("stack value are "+stack);
		  stack.pop();
		  System.out.println("pop method  "+stack);
		  Iterator itr1 = stack.descendingIterator();
			while(itr1.hasNext())
			{
				System.out.println("Traversing stack in reverse order "+itr1.next());
			}
		
			LinkedList<Integer> list2 = new LinkedList<Integer>();
			list2.add(30);
			list2.add(28);
			
			Collections.sort(list2);
			System.out.println("sort integer "+list2);  
			
			LinkedList<String> list3 = new LinkedList<String>();
			list3.add("Best");
			list3.add("Apple");
			
			Collections.sort(list3);
			System.out.println("sort string"+list3);  
		}

}
