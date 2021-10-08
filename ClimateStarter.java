class ClimateStarter{

public static void main(String[] tea)
{
	String typ1="rainy";
	String loc1="hassan";
	String des1="Its heavy rainy here";
	float temp1=28.5f;
	float humi1=12.5f;
	
	new Climate();
	new Climate(typ1);
	new Climate(temp1);
	new Climate(typ1,temp1);
	new Climate(humi1,loc1);
	new Climate(loc1,des1);
	new	Climate(temp1,humi1);
	new Climate(typ1,loc1,des1);
	new Climate(typ1,loc1,temp1);
	new Climate(typ1,humi1,loc1);
}
}