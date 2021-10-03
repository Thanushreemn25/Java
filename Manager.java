class Manager{

public static void meeting()
	{
    System.out.println("Invoke meeting");
	Developer.writeCode();
	Developer.developApplication();
	}
	
public static void monitor()
	{
    System.out.println("Invoke monitor");
	Developer.compile();
	}
	
public static void organizing()
	{
    System.out.println("Invoke organizing");
	Developer.run();
	}

public static void planning()
	{
    System.out.println("Invoke planning");
	Developer.testing();
	}

public static void decideSalary()
	{
    System.out.println("Invoke decideSalary");
	Developer.debug();
	}	

}