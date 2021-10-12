class Book1{

    String name;
	int noOfPages;
	float price;
    float weight;
	BookColor color=BookColor.BLUE;
	
	Book1(String name,float price)
	{
		this();
		System.out.println("invoked String and float Constructor of book");
		this.name=name;
		this.price=price;
	}
	
	Book1(String name)
	{   
	    this(150.0f);
		System.out.println("invoked String Constructor of book");
		this.name = name;
	}
	
	
	Book1(float price)
	{
		System.out.println("invoked float Constructor of book");
		this.price = price;
	}
	
	Book1()
	{
		System.out.println("invoked no-arg Constructor of book");
		this.weight = 1.0f;
		this.name = "Maths";
		this.price = 200.0f;
	}
}