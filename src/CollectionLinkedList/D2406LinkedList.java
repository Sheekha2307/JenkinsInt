package CollectionLinkedList;

import java.util.LinkedList;
import java.util.List;

public class D2406LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******************Program for linkedList************");
		List <String> linkedlist1 = new LinkedList <String>();
		linkedlist1.add("Sheekha");
		linkedlist1.add("Piyush");
		//linkedlist1.add
		LinkedList <String> linklist= new LinkedList();
		linklist.add("Reyu");
		linklist.add("Reyansh");
		linklist.addFirst("Sheekha");
		
		
		System.out.println("updated value");
		for (int i=0; i<linklist.size();i++)
		{
			System.out.println(linklist.get(i));
		}
		
	}

}
