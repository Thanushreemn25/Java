class HandBagStarter{

public static void main(String[] tea)
   {
      String col1="blue";
	  String band1="ladida";
	  String mat1="leather";
	  float cap1=10.0f;
	  float pri1=999.0f;
	  float siz1=5.5f;
	  
	  new HandBag();
	  new HandBag(col1);
	  new HandBag(cap1);
	  new HandBag(col1,band1);
	  new HandBag(pri1,siz1);
	  new HandBag(mat1,cap1);
	  new HandBag(pri1,col1);
	  new HandBag(col1,band1,pri1);
	  new HandBag(col1,siz1,mat1);
	  new HandBag(pri1,siz1,cap1);
	  
   }
}