class BiCycleStarter{

public static void main(String[] val)
{

    BiCycle bicycle=new BiCycle();
	bicycle.brake();
	bicycle.move();
	bicycle.displayDetails();
    
	bicycle.color="BLUE";
	bicycle.brand="Giant";
	bicycle.price=5000;
	
	bicycle.displayDetails();
	
	
}
}