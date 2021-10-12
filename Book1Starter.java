class Book1Starter{

public static void main(String[] love)
    {
	
	  Book1 book = new Book1("Biology",125.0f);
	  String bk = book.name;
	  System.out.println(bk);
	  float pri = book.price;
	  System.out.println(pri);
	  BookColor color = book.color;
	  System.out.println(color);
	  int pages = book.noOfPages;
	  System.out.println(pages);
	  float wet = book.weight;
	  System.out.println(wet);
	  
	  book.color = BookColor.BLACK;
	  System.out.println(book.color);
	  
	  book.noOfPages = 90;
	  System.out.println(book.noOfPages);
	  
	  Book1 book1 = new Book1("Chemistry");
	  String bk1 = book1.name;
	  System.out.println(bk1);
	  
	  Book1 book2 = new Book1();
	  System.out.println(book2.weight);
	  System.out.println(book2.name);
	  System.out.println(book2.price);
	}

}