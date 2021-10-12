class NewsPaperStarter{

public static void main(String[] holidays)
{

 NewsPaper newsPaper=new NewsPaper("The Hindu",3.50f);

 String nm=newsPaper.name;
 System.out.println(nm);
 float price=newsPaper.price;
 System.out.println(price);
 NewsPaperLang lang= newsPaper.lang;
 System.out.println(lang);
 String header=newsPaper.headline;
 System.out.println(header);
 int pages=newsPaper.noOfPages;
 System.out.println(pages);

 newsPaper.lang=NewsPaperLang.ENGLISH;
 lang=newsPaper.lang;
 System.out.println(lang);

 newsPaper.noOfPages=12;
 System.out.println(newsPaper.noOfPages);

 NewsPaper paper=new NewsPaper();
 System.out.println(paper.name);
 System.out.println(paper.price);

}
}