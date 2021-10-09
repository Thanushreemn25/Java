class Stabilizer{

    float voltage ;
	float current ;
	String tv;
	int ledIndicator;
	float power;
	String brand;
	float capacity;
	String color;
	int light;
	float length;
	float width;
	float weight;
	String type;
	int warranty;
	float temperature;
	
	Stabilizer(float current)
	{
		System.out.println("invoked stabilizer no-arg const");
		this.current=current;
	}
	
	Stabilizer(float voltage,String tv,int ledIndicator)
	{
		System.out.println("invoked stabilizer const with float,String,String");
		this.voltage=voltage;
		this.tv=tv;
		this.ledIndicator=ledIndicator;
	}
	
	Stabilizer(float power,String brand,float capacity,String color)
	{
		System.out.println("invoked stabilizer const with float,String,float,String");
		this.power=power;
		this.brand=brand;
		this.capacity=capacity;
		this.color=color;
	}
	
	Stabilizer(int light,float length, float width,float weight)
	{
		System.out.println("invoked stabilizer const with int,float,float,float");
		this.light=light;
		this.length=length;
		this.width=width;
		this.weight=weight;
	}
	
	Stabilizer(String type,int warranty,float temperature)
	{
		System.out.println("invoked stabilizer const with String,int,float");
		this.type=type;
		this.warranty=warranty;
		this.temperature=temperature;
	}
}