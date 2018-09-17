package Progrms5;

public class BookInfo {
	private String isbn;
	private String title;
	private String author;
	private double price;
	private double discount;
	private double disPrice;
	public double getDisPrice() {
		return disPrice;
	}
	public void setDisPrice(float disPrice) {
		this.disPrice = disPrice;
	}
	public double getDiscount(double price) {
		discount=(0.05*price);
		disPrice=price-discount;
		return disPrice;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookInfo [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + ", discount="
				+ discount + ", disPrice=" + disPrice + "]";
	}
	
	

}
