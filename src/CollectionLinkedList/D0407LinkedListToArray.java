package CollectionLinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class D0407LinkedListToArray extends D0407LinkedList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Welocme");
		list.add("to");
		list.add("the");
		list.add("world");
		list.add("of");
		list.add("Eclipse");
		int size = list.size();
		String[] arr = new String[size];
		arr = list.toArray(arr);
		for (String s: arr)
		{
		System.out.println("Array value "+s);
		}
		//way2
		System.out.println(Arrays.toString(arr));
		
}
}