class InternetRunner{

public static void main(String[] values)
{

  Internet internet= new Internet();// instance is created
  String provider="Airtel"; 
  String prov=internet.provider;
  System.out.println(provider);
  System.out.println(prov);
  
  Deodrant deodrant= new Deodrant();
  String brand="Nivea";
  int price=400;
  int quantity=2;
  String color="blue";
  String band=deodrant.brand;
  int pri=deodrant.price;
  int qua=deodrant.quantity;
  String col=deodrant.color;
  System.out.println(brand);
  System.out.println(band);
  System.out.println(price);
  System.out.println(pri);
  System.out.println(quantity);
  System.out.println(qua);
  System.out.println(color);
  System.out.println(col);
  
 
  PowerBank powerBank= new PowerBank();
  int capacity=27000;
  String company="oneplus";
  int price1=899;
  int cap=powerBank.capacity;
  String com=powerBank.company;
  int pri1=powerBank.price1;
  System.out.println(capacity);
  System.out.println(cap);
  System.out.println(company);
  System.out.println(com);
  System.out.println(price1);
  System.out.println(pri1);
  
  Wallet wallet= new Wallet();
  int price2=500;
  String color1="black";
  String countryMade="India";
  int pri2=wallet.price2;
  String col1=wallet.color1;
  String country=wallet.countryMade;
  System.out.println(price2);
  System.out.println(pri2);
  System.out.println(color1);
  System.out.println(col1);
  System.out.println(countryMade);
  System.out.println(country);
  
}
}