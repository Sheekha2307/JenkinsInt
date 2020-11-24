package collectionTreeSet;
import java.util.*;
public class D30PriceCompare implements Comparator {
	
	public int compare(Object o1, Object o2) {
		
		D30TreeSetBook obj1 = (D30TreeSetBook)o1;
		D30TreeSetBook obj2 = (D30TreeSetBook)o2;
		if (obj1.price == obj2.price)
		return 0;
		else if (obj1.price> obj2.price)
			return 1;
		else return -1;
		
	}

	}
