class ComputerStarter{

public static void main(String[] arg)
{
	Computer computer = new Computer();
	computer.displayDetails();
	computer.brand="Dell";
	computer.modelNo=7.0f;
	computer.price=40.0f;
	computer.quantity=1;
	computer.displayDetails();
	
	Computer computer1 = new Computer();
	computer1.displayDetails();
	computer1.brand="ACER";
	computer1.modelNo=8.0f;
	computer1.price=30.0f;
	computer1.quantity=2;
	computer1.displayDetails();
	
	Computer computer2 = new Computer();
	computer2.displayDetails();
	computer2.brand="Apple";
	computer2.modelNo=10.0f;
	computer2.price=50.0f;
	computer2.quantity=3;
	computer2.displayDetails();
	
	Computer computer3 = new Computer();
	computer3.displayDetails();
	computer3.brand="lenovo";
	computer3.modelNo=10.0f;
	computer3.price=40.0f;
	computer3.quantity=4;
	computer3.displayDetails();
	
	Computer computer4 = new Computer();
	computer4.displayDetails();
	computer4.brand="toshiba";
	computer4.modelNo=10.0f;
	computer4.price=45.0f;
	computer4.quantity=5;
	computer4.displayDetails();
	
	computer.displayTotalPrice();
	computer1.displayTotalPrice();
	computer2.displayTotalPrice();
	computer3.displayTotalPrice();
	computer4.displayTotalPrice();
	
	computer.displayTotalOfAll();
	
}
}