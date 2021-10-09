class Scooter{

    String color;
	String license;
	String motor;
	String brand;
	String type;
	int stroke;
	int brakes;
	int seats;
	int wheels;
	float price;
	float engineSize;
	float wheelSize;
	float speed;
	float height;
	float weight;
	
	Scooter(String color,String license,String motor,String brand,String type)
	{
		System.out.println("invoked scooter no-arg const");
		this.color=color;
		this.license=license;
		this.motor=motor;
		this.brand=brand;
		this.type=type;
	}
	
	Scooter(int stroke,int brakes,int seats,int wheels)
	{
		System.out.println("invoked scooter const1");
		this.stroke=stroke;
		this.brakes=brakes;
		this.seats=seats;
		this.wheels=wheels;
	}
	
	Scooter(float price,float engineSize)
	{
		System.out.println("invoked scooter const2");
		this.price=price;
		this.engineSize=engineSize;
	}
	
	Scooter(float height,int stroke)
	{
		System.out.println("invoked scooter const3");
		this.height=height;
		this.stroke=stroke;
	}
	
	Scooter(float weight)
	{
		System.out.println("invoked scooter const4");
		this.weight=weight;
	}
	
	
	
}