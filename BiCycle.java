//instance methods

class BiCycle{

    String color;
	float price;
	String brand;
	BiCycleType type=BiCycleType.ELECTRIC;
	
	void brake()
	{
		System.out.println("invoked brake");
	}
	
	void move()
	{
		System.out.println("invoked brake");
	}
	
	BiCycle()
	{
		System.out.println("invoked no arg bicycle constructor");
	}
	
	void displayDetails()
	{
		System.out.println("invoked displayDetails");
		System.out.println(this.color);
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.type);
	}
}