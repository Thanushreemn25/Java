class Movie{

public static void entertain(int ticketPrice,int movieLength,int rating,String movieName,String[] actors)
{
	
   System.out.println("invoked entertain");
   System.out.println("Ticket Price : "+ticketPrice);
   System.out.println("Movie Length : "+movieLength);
   System.out.println("Rating : "+rating);
   System.out.println("Movie Name : "+movieName);

   for(int actorIndex=0;actorIndex<actors.length;actorIndex++)
     {
	    String actor=actors[actorIndex];
	    System.out.println(actor);
     }

}
}