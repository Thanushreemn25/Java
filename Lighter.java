class Lighter{

public static boolean on( )
{
	 System.out.println("lighter on invoked");
	return true;
}

public static boolean off( )
{
	 System.out.println("lighter off invoked");
	 return false;
}

public static boolean light(int width)
{
	if(width>0)
	{    
        System.out.println("width above zero invoked");
		
		return true;
	}	
	else
	{
		System.out.println("width below zero invoked");
		
		return false ;
	}
		
}
}