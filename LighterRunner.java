class LighterRunner{

public static void main(String[] args)
{
	
  
  boolean lyt=Lighter.on();
  System.out.println(lyt);
 boolean lyt1 = Lighter.off();
  System.out.println(lyt1);
  int width1 = 1;
  boolean run = Lighter.light(width1);
  
}

}