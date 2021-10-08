class HeadsetStarter{

public static void main(String[] tea)
{

     String band1 = "boat";
	 String typ1="wireless";
	 float pri1=2999;
	 boolean noise1=true;
	 boolean mi1=true;
	 
  	 new Headset();
	 new Headset(band1);
	 new Headset(pri1);
	 new Headset(mi1);
	 new Headset(band1,typ1);
	 new Headset(pri1,mi1);
	 new Headset(pri1,typ1);
	 new Headset(band1,mi1);
	 new Headset(noise1,mi1);
	 new Headset(band1,pri1,mi1);
}
}