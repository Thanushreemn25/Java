class StabilizerRunner{

public static void main(String[] amoeba)
{

  Stabilizer stabilizer = new Stabilizer(5.1f);
  System.out.println(stabilizer);
  System.out.println(stabilizer.current);
  
  Stabilizer stabilizer1 = new Stabilizer(10.1f,"honda",2);
  System.out.println(stabilizer1);
  System.out.println(stabilizer1.voltage);
  System.out.println(stabilizer1.tv);
  System.out.println(stabilizer1.ledIndicator);
  
  Stabilizer stabilizer2 = new Stabilizer(12.1f,"xyz",30,"blue");
  System.out.println(stabilizer2);
  System.out.println(stabilizer2.power);
  System.out.println(stabilizer2.brand);
  System.out.println(stabilizer2.capacity);
  System.out.println(stabilizer2.color);
  
  Stabilizer stabilizer3 = new Stabilizer(2,5.1f,3.5f,10.0f);
  System.out.println(stabilizer3);
  System.out.println(stabilizer3.light);
  System.out.println(stabilizer3.length);
  System.out.println(stabilizer3.width);
  System.out.println(stabilizer3.weight);
  
  Stabilizer stabilizer4 = new Stabilizer("dynamic",5,3.3f);
  System.out.println(stabilizer4);
  System.out.println(stabilizer4.type);
  System.out.println(stabilizer4.warranty);
  System.out.println(stabilizer4.temperature);
}
}