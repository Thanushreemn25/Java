class TestRunner
{
public static void main(String[] arg)
{ 
   Transformer obj = new Transformer();
   System.out.println("Transformer start");
  
   Robot obj1 = new Robot();
   System.out.println("Robot start work");
   
   HardDisk obj2 = new HardDisk();
   System.out.println("Hard-disk stores content");
   
   Motor obj4 = new Motor();
   System.out.println("Motor starts movement");
   
   WaterTank obj5 = new WaterTank();
   System.out.println("Watertank filled");
   
   
}
}