class Computer{

    String brand;
	float modelNo;
	float price;
	int quantity;
	ComputerType type = ComputerType.MICROCOMPUTER;
	static double totalOfAllProduct;
	
	Computer()
	{
		System.out.println("invoked computer constructor");
	}
	
	void displayDetails()
	{
		System.out.println("invoked displayDetails");
		System.out.println(this.brand);
		System.out.println(this.modelNo);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.type);
	}
	
	void displayTotalPrice()
	{
		System.out.println("invoked displayTotalPrice");
		double totalPrice=this.quantity*this.price;
        System.out.println(totalPrice);
		Computer.totalOfAllProduct=Computer.totalOfAllProduct+totalPrice;
	}
	
	void displayTotalOfAll()
	{
		
		System.out.println("invoked displayTotalOfAll");
        System.out.println(Computer.totalOfAllProduct);
	}
}