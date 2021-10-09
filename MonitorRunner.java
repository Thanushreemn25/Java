class MonitorRunner{

public static void main(String[] amoeba)
{
   
   Monitor monitor= new Monitor("info");
   System.out.println(monitor);
   System.out.println(monitor.display);
   
   Monitor monitor1= new Monitor("blue","digi","mono","lap");
   System.out.println(monitor1);
   System.out.println(monitor1.color);
   System.out.println(monitor1.type);
   System.out.println(monitor1.brand);
   System.out.println(monitor1.device);
   
   Monitor monitor2= new Monitor("good monitor","white screen","mouse",5);
   System.out.println(monitor2);
   System.out.println(monitor2.information);
   System.out.println(monitor2.screen);
   System.out.println(monitor2.control);
   System.out.println(monitor2.brightness);
   
   Monitor monitor3= new Monitor(6.6f,4.5f,10.0f);
   System.out.println(monitor3);
   System.out.println(monitor3.length);
   System.out.println(monitor3.width);
   System.out.println(monitor3.weight);
   
   Monitor monitor4= new Monitor(5.5f,1.2f);
   System.out.println(monitor4);
   System.out.println(monitor4.height);
   System.out.println(monitor4.resolution);
}
}