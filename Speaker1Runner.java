class Speaker1Runner{

public static void main(String[] run)
{
	int level=4;
	//Speaker1.volume(level);
	String vol=Speaker1.volume(level);
	System.out.println(vol);
	
	Speaker1.turnOn();
	boolean turn = Speaker1.turnOn();
	
	
	//Speaker1.turnOff();
	boolean turn1 = Speaker1.turnOff();
	System.out.println(turn1); // its print false
}
}