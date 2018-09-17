package Progrms5;

public class BookInfoTest {
	
	public static void main(String[] args) {
		BookInfo bookInfo = new BookInfo();
		bookInfo.setIsbn("#1234");
		bookInfo.setAuthor("james Gosling");
		bookInfo.setTitle("Game of Java");
		bookInfo.setPrice(250);
		bookInfo.setDiscount(5);
		
		double dis=bookInfo.getDiscount(250);
		//System.out.println(dis);
		System.out.println(bookInfo);
		
		
	}

}
