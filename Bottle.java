class Bottle{

public static void storing(int price,int height,String color,String quality,String[] brands)
{
   System.out.println("invoked storing");
   System.out.println("Price : "+price);
   System.out.println("Height : "+height);
   System.out.println("Color : "+color);
   System.out.println("Quality : "+quality);
   
   for(int brandIndex=0;brandIndex<brands.length;brandIndex++)
   {
	   String brand = brands[brandIndex];
	   System.out.println(brand);
   }
}
}  