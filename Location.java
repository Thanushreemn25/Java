class Location{

   String startingPoint="hassan";
   String destination;
   String travelType;
   float distance;
   int pincode;
  
    Location()
    {
       System.out.println("invoked location with no-arg const ");
    }
	
	Location(String dest)
    {
       System.out.println("invoked location const string");
	   System.out.println("destination :"+dest);
       destination=dest;
    }
	
	Location(float dist)
    {
       System.out.println("invoked location const float");
	   System.out.println("distance :"+dist);
       distance=dist;
    }
	
    Location(String dest,String typ)
    {
       System.out.println("invoked location const string and string");
       System.out.println("destination :"+dest);
       System.out.println("travelType :"+typ);
       destination=dest;
       travelType=typ;
    }
	
	Location(String dest,float dist)
    {
       System.out.println("invoked location const string and float");
       System.out.println("destination :"+dest);
       System.out.println("distance :"+dist);
       destination=dest;
       distance=dist;
    }
	
	Location(float dist,String typ)
    {
       System.out.println("invoked location const string and float");
       System.out.println("distance :"+dist);
       System.out.println("travelType :"+typ);
       distance=dist;
	   travelType=typ;
    }
	
	Location(float dist,int pin)
    {
       System.out.println("invoked location const string and float");
       System.out.println("distance :"+dist);
       System.out.println("pincode :"+pin);
       distance=dist;
       pincode=pin;
    }
	
	Location(int pin,float dist)
    {
       System.out.println("invoked location const string and float");
	   System.out.println("pincode :"+pin);
       System.out.println("distance :"+dist);
       pincode=pin;
       distance=dist;
    }
	
    Location(String dest,int pin)
    {
       System.out.println("invoked location const string and float");
       System.out.println("destination :"+dest);
       System.out.println("pincode :"+pin);
       destination=dest;
       pincode=pin;
    }
   
    Location(String dest,int pin,float dist)
    {
       System.out.println("invoked location const string and float");
       System.out.println("destination :"+dest);
       System.out.println("pincode :"+pin);
	   System.out.println("distance :"+dist);
       destination=dest;
       pincode=pin;
	   distance=dist;
    }
 }