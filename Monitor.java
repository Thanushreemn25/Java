class Monitor{
    
	String display;
	String color;
	String type;
	String brand;
	String device;
	String information;
	String description;
	String screen;
	String control;
	int brightness;
    float length;
	float width;
	float weight;
	float height;
	float resolution;
	
	Monitor(String display)
	{
		System.out.println("invoked monitor no-arg const");
		this.display=display;
	}
	
	Monitor(String color,String type,String brand,String device)
	{
		System.out.println("invoked monitor const1");
		this.color=color;
		this.type=type;
		this.brand=brand;
		this.device=device;
		
	}
	
	Monitor(String information,String screen,String control,int brightness)
	{
		System.out.println("invoked monitor no-arg const2");
		this.information=information;
		this.screen=screen;
		this.control=control;
		this.brightness=brightness;
	}
	
	Monitor(float length,float width,float weight)
	{
		System.out.println("invoked monitor no-arg const3");
		this.length= length;
		this.width=width;
		this.weight=weight;
	}
	
	Monitor(float height,float resolution)
	{
		System.out.println("invoked monitor no-arg const4");
		this.height=height;
		this.resolution=resolution;
	}
}