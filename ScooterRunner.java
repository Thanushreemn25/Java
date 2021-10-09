class ScooterRunner{

public static void main(String[] amoeba)
{
    Scooter scooter = new Scooter("blue","yes","dc","jupiter","electric");
	System.out.println(scooter);
    System.out.println(scooter.color);
	System.out.println(scooter.license);
	System.out.println(scooter.motor);
	System.out.println(scooter.brand);
	System.out.println(scooter.type);
	
	Scooter scooter1 = new Scooter(2,2,2,2);
	System.out.println(scooter1);
    System.out.println(scooter1.stroke);
	System.out.println(scooter1.brakes);
	System.out.println(scooter1.seats);
	System.out.println(scooter1.wheels);
	
	Scooter scooter2 = new Scooter(50000.0f,100.0f);
	System.out.println(scooter2);
    System.out.println(scooter2.price);
	System.out.println(scooter2.engineSize);
	
	Scooter scooter3 = new Scooter(20.0f,2);
	System.out.println(scooter3);
    System.out.println(scooter3.height);
	System.out.println(scooter3.stroke);
	
	Scooter scooter4 = new Scooter(200.0f);
	System.out.println(scooter4);
    System.out.println(scooter4.weight);
}
}