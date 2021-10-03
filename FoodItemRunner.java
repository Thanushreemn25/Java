class FoodItemRunner{

public static void main(String[] value){
	String[] items={"idli","dosa","poori","biriyani"};
	String address=FoodItem.eat(items);
	System.out.println(address);
}
}