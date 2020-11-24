package CollectionLinkedList;

import java.util.LinkedList;

public class D0407ArrayToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String courses[] = {"Java", "Selenium", "Data Structure"};
		LinkedList<String> list = new LinkedList<String>();
		//list.add(courses);- not possible
		for (String s: courses)
		{
			list.add(s);
		}
		System.out.println("Array in linked list are "+list);
	}

}
