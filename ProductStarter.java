class ProductStarter{

public static void main(String[] value)
{

    Product product = new Product();
	product.displayDetails();
	product.name="Laptop";
    product.price=40.0f;
    product.quality=true;
    product.quantity=2;
    product.isiMark=true;
    product.displayDetails();
	
	Product product1 = new Product();
	product1.displayDetails();
	product1.name="Book";
    product1.price=2.0f;
    product1.quality=true;
    product1.quantity=3;
    product1.isiMark=true;
    product1.displayDetails();
	
	Product product2 = new Product();
	product2.displayDetails();
	product2.name="Chocolate";
    product2.price=10.0f;
    product2.quality=true;
    product2.quantity=20;
    product2.isiMark=true;
    product2.displayDetails();
	
	Product product3 = new Product();
	product3.displayDetails();
	product3.name="Bag";
    product3.price=15.0f;
    product3.quality=true;
    product3.quantity=1;
    product3.isiMark=true;
    product3.displayDetails();
	
	Product product4 = new Product();
	product4.displayDetails();
	product4.name="Jewellery";
    product4.price=30.0f;
    product4.quality=true;
    product4.quantity=8;
    product4.isiMark=true;
    product4.displayDetails();
	
	product.displayTotalPrice();
	product1.displayTotalPrice();
	product2.displayTotalPrice();
	product3.displayTotalPrice();
	product4.displayTotalPrice();
	
}
}