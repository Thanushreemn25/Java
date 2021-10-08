class HandBag{

    String color;
	String brand;
	String material;
	float capacity;
	float price;
	float size;
	
	HandBag()
	{
		System.out.println("invoked HandBag with no arg");
	}
	
	HandBag(String col)
	{
		System.out.println("invoked HandBag with String const");
		System.out.println("color :"+col);
		color = col;
	}
	
	HandBag(float cap)
	{
		System.out.println("invoked HandBag with float const");
		System.out.println("capacity:"+cap);
		capacity = cap;
	}
	
	HandBag(String col,String band)
	{
		System.out.println("invoked HandBag with string and string const");
		System.out.println("color :"+col);
		System.out.println("brand :"+band);
		color = col;
		brand = band;
	}
	
	HandBag(float pri,float siz)
	{
		System.out.println("invoked HandBag with float and float const");
		System.out.println("price :"+pri);
		System.out.println("size :"+siz);
		price = pri;
		size = siz;
	}

	HandBag(String mat,float cap)
	{
	    System.out.println("invoked HandBag with string and float const");
		System.out.println("material :"+mat);
		System.out.println("capacity:"+cap);
		material = mat;
		capacity = cap;
	}
	
	HandBag(float pri,String col)
	{
	    System.out.println("invoked HandBag with float and string const");
		System.out.println("price :"+pri);
		System.out.println("color :"+col);
	    price = pri;
		color = col;
	}
	
	HandBag(String col,String band,float pri)
	{
		System.out.println("invoked HandBag with string string float const");
		System.out.println("color :"+col);
		System.out.println("brand :"+band);
		System.out.println("price :"+pri);
		color = col;
		brand = band;
		price = pri;
	}
	
	HandBag(String col,float siz,String mat)
	{
		System.out.println("invoked HandBag with string float string const");
		System.out.println("color :"+col);
		System.out.println("size :"+siz);
		System.out.println("material :"+mat);
		color = col;
		size=siz;
		material=mat;
	}
	
	HandBag(float pri,float siz,float cap)
	{
		System.out.println("invoked HandBag with float float float const");
		System.out.println("price :"+pri);
		System.out.println("size :"+siz);
		System.out.println("capacity:"+cap);
		price = pri;
		size=siz;
		capacity = cap;
	}
}