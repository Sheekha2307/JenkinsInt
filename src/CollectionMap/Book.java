package CollectionMap;

public class Book {
	String color;
	int numberOfPages;
	float price;
	 String name;
	public Book(String c, int n, float p, String ns)
	{
		this.color = c;
		this.numberOfPages = n;
		this.price = p;
		this.name = ns;
	}
	public void printDetails()
	{
		System.out.println("traversing treeset elements " +this.color+ " "+this.numberOfPages+" "+this.price+" " +this.name);
		  
	}

}
