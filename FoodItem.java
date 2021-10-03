class FoodItem{

public static String eat(String[] items)
{
	
	System.out.println("invoked eat");
	int size=items.length;
	System.out.println(size);
	
	 for(int index=0;index<size;index++)
  {
	 
	 System.out.println(items[index]);
  }
   
	return items[0];
	
}
}