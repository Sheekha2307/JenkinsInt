package CollectionMap;

import java.util.Comparator;

public class ComparatorExample implements Comparator {

	public int compare(Object o1, Object o2) {
		
		Book obj1 = (Book) o1;
		Book obj2 = (Book) o2;
		
		if (obj1.numberOfPages == obj2.numberOfPages)
			return 0;
		else if (obj1.numberOfPages >= obj2.numberOfPages)
		return 1;
		else return -1;
	
	}

}
