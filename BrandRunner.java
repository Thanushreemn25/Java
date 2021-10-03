class BrandRunner
{

public static void main(String[] brand)
{
  System.out.println("Brand invoked");
  int size = brand.length;
  
  for(int index=0;index<brand.length;index++)
  {
	 String var=brand[index];
	 System.out.println(var);
  }
	
}
}