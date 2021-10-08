class LocationStarter{

public static void main(String[] tea)
  {
    
   String dest1="mysore";
   String typ1="car";
   float dist1=30.5f;
   int pin1=573116;
	 
	new Location();
	new Location(dest1);
	new Location(dist1);
	new Location(dest1,typ1);
	new Location(dest1,dist1);
	new Location(dist1,typ1);
	new Location(dist1,pin1);
	new Location(pin1,dist1);
	new Location(dest1,pin1);
	new Location(dest1,pin1,dist1);
  }
}  