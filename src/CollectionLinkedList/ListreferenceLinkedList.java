package CollectionLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListreferenceLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List stack = new LinkedList<Integer>();
		  ((LinkedList<Integer>) stack).push(1); //as push method is not available in List interface hence we can type cast to childclass so that method can be called
		  ((LinkedList<Integer>) stack).push(2);
		  ((LinkedList<Integer>) stack).push(10);
		  System.out.println("stack value are "+stack);
		  ((LinkedList<Integer>) stack).pop();
		  System.out.println("pop method  "+stack);
		  Iterator itr1 = ((LinkedList<Integer>) stack).descendingIterator();
			while(itr1.hasNext())
			{
				System.out.println("Traversing stack in reverse order "+itr1.next());
			}
		}
	}


