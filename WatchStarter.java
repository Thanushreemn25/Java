class WatchStarter{

public static void main(String[] main)
{

    Watch wat=new Watch();
	wat.displayDetails();
	
	wat.countryMade="India";
	wat.brand="Titan";
	wat.type=WatchType.AUTOMATIC;
	
	wat.displayDetails();
}
}