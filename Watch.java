//accessing instance methods...non static...;ref.instance method;   

class Watch{

    String countryMade;
	String brand;
	WatchType type=WatchType.QUARTZ;
	
	Watch()
	{
		System.out.println("invoked no arg bicycle constructor");
	}
	
	void displayDetails()
	{
		System.out.println("invoked displayDetails");
		System.out.println(this.countryMade);
		System.out.println(this.brand);
		System.out.println(this.type);
	}
}