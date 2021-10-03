class ChemicalRunner
{

public static void main(String[] chemical)
{
  System.out.println("Chemical invoked");
  int size = chemical.length;
  System.out.println(size);
  
  for(int index=0;index<size;index++)
  {
	 String var=chemical[index];
	 System.out.println(var);
  }
	
}
}