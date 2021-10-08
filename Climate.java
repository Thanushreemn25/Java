class Climate{
    
	String type;
	String location;
	String description;
	float temperature;
	float humidity;
	
	Climate()
	{
		System.out.println("invoked climate with no arg");
	}
	
	Climate(String typ)
	{
		System.out.println("invoked climate const with string");
		System.out.println("type :"+typ);
		type = typ;
	}
	
	Climate(float temp)
	{
    	System.out.println("invoked climate const with float");
		System.out.println("temperature :"+temp);
		temperature=temp;
	}
	
	Climate(String typ,float temp)
	{
		System.out.println("invoked climate const with string and float");
		System.out.println("type :"+typ);
		System.out.println("temperature :"+temp);
		type = typ;
		temperature=temp;
	}
	
	Climate(float humi,String loc)
	{
		System.out.println("invoked climate const with float and string");
		System.out.println("humidity :"+humi);
		System.out.println("location :"+loc);
		humidity=humi;
		location=loc;
	}
	
	Climate(String loc,String des)
	{
		System.out.println("invoked climate const with string and string");
		System.out.println("location :"+loc);
		System.out.println("description :"+des);
		location=loc;
		description=des;
	}
	
	Climate(float temp,float humi)
	{
		System.out.println("invoked climate const with float and float");
		System.out.println("temperature :"+temp);
		System.out.println("humidity :"+humi);
		temperature=temp;
		humidity=humi;
	}
	
	Climate(String typ,String loc,String des)
	{
		System.out.println("invoked climate const with string string string");
		System.out.println("type :"+typ);
		System.out.println("location :"+loc);
		System.out.println("description :"+des);
		type = typ;
		location=loc;
		description=des;
	}
	
	Climate(String typ,String loc,float temp)
	{
		System.out.println("invoked climate const with string string string");
		System.out.println("type :"+typ);
		System.out.println("location :"+loc);
		System.out.println("temperature :"+temp);
		type = typ;
		location=loc;
		temperature=temp;
	}
	
	Climate(String typ,float humi,String loc)
	{
		System.out.println("invoked climate const with string string string");
		System.out.println("type :"+typ);
		System.out.println("humidity :"+humi);
		System.out.println("location :"+loc);
		type = typ;
		humidity=humi;
		location=loc;
	}
}