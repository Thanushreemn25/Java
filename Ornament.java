class Ornament{

public static String wear(String[] items)
{
	System.out.println("invoked wear");
	int size=items.length;
	System.out.println(size);
	
	return items[size-1];


}
}