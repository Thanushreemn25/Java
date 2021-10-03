class Speaker1{

public static String volume(int level)
  {
	if(level<=0)
	{
		 System.out.println("level zero invoked");
	     String msg1="on the speaker";
		 return msg1;
	}
		
	else if(level<=3)
	{
		 System.out.println("level less than or equal to three invoked");
		 String msg2="ok";
		 return msg2;
	}
		
       
	else if(level>3)
	{
		 System.out.println("level above three invoked");
		 String msg3="loud";
		 return msg3;
	}
        
    else if(level>5 && level<=9)
    {
		System.out.println("level bw five and nine invoked");
		String msg4="too loud";
		return msg4;
		
	}
	else
	{
	    System.out.println("level above nine invoked");
		String msg5="call police";
		return msg5;
	}

  }

public static boolean turnOn()
{
	System.out.println("invoked turn on");
	boolean on = true;
	return on;
}

public static boolean turnOff()
{
	System.out.println("invoked turn off");
	boolean off = false;
	return off;
}

}