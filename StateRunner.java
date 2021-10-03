class StateRunner
{

public static void main(String[] state)
{
  System.out.println("State invoked");
  int size = state.length;
  System.out.println(size);
   
  for(int index=0;index<state.length;index++)
  {
	 String var=state[index];
	 System.out.println(var);
  }
	
}
}