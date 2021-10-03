class Calender{

public static int getBirthMonth(String personName)
{
    if(personName=="Thanu")
	{
		 System.out.println("name thanu invoked");
	int month1 = 6;
	return month1;
	}
	else if(personName=="Hitha")
	{
		 System.out.println("name hitha invoked");
    int month2 = 4;
	return month2;
	}
    else if(personName=="Meena")
	{
	    System.out.println("name meena invoked");
    int month3 = 4;
	return month3;
	}
	else
	{
    System.out.println("invalid data");
	int month4 = 0;
	return month4;
	}
    
}

public static String getBirthDay(String personName)
{
	if(personName=="Thanu")
	{
		System.out.println("name thanu invoked");
	String day1 = "Monday";
	return day1;
	}
    else if(personName=="Hitha")
	{
		System.out.println("name hitha invoked");
    String day2 = "tuesday";
	return day2;
	}
    else if(personName=="Meena")
	{
		System.out.println("name meena invoked");
    String day3 = "wednesday";
	return day3;
	}
	else
	{
	System.out.println("no bday");
	String day4 = "NO Birthday";
	return day4;
	}
}

}