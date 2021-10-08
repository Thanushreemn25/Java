class Headset{

    String brand;
	String type;
	float price;
	boolean noiseCancellation;
	boolean mic;
	
	Headset()
	{
		System.out.println("invoked headset with no arg");
	}
	
	Headset(String band)
	{
		System.out.println("invoked headset const with string");
		System.out.println("brand :"+band);
	    brand = band;
	}
	
	Headset(float pri)
	{
		System.out.println("invoked headset const with float");
		System.out.println("price :"+pri);
	    price = pri;
	}
	
	Headset(boolean mi)
	{
		System.out.println("invoked headset const with boolean");
		System.out.println("mic :"+mi);
	    mic = mi;
	}
	
	Headset(String band,String typ)
	{
		System.out.println("invoked headset const with string and string");
		System.out.println("brand :"+band);
		System.out.println("type :"+typ);
	    brand = band;
		type = typ;
	}
	
	Headset(float pri,boolean mi)
	{
		System.out.println("invoked headset const with float and boolean");
		System.out.println("price :"+pri);
		System.out.println("mic :"+mi);
	    price = pri;
		mic = mi;
	}
	
	Headset(float pri,String typ)
	{
		System.out.println("invoked headset const with float and string");
		System.out.println("price :"+pri);
		System.out.println("type :"+typ);
	    price = pri;
		type = typ;
	}
	
	Headset(String band,boolean mi)
	{
		System.out.println("invoked headset const with string and boolean");
		System.out.println("brand :"+band);
		System.out.println("mic :"+mi);
	    brand = band;
		mic = mi;
	}
	
	Headset(boolean noise,boolean mi)
	{
		System.out.println("invoked headset const with boolean and boolean");
		System.out.println("noiseCancellation :"+noise);
		System.out.println("mic :"+mi);
	    noiseCancellation=noise;
		mic = mi;
	}
	
	Headset(String band,float pri,boolean mi)
	{
		System.out.println("invoked headset const with string float boolean");
		System.out.println("brand :"+band);
		System.out.println("price :"+pri);
		System.out.println("mic :"+mi);
		brand = band;
	    price = pri;
		mic = mi;
	}
}