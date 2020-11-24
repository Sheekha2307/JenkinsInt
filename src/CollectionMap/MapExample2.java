package CollectionMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Map<Integer,String> map=new HashMap<Integer,String>();  
		map.put(102,"Rahul"); 
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.values();
		  for (String m: map.values())
		  {
			  System.out.println("Values method " +m);
		  }
		    
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  

	}
}
	}
