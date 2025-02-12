package library.student;

public class Book {

	//Specfications 
	private String title;
	private String Author;
	private String ISBN;
	private double price; 

	public Book(String title, String Author, String ISBN, double price) {
	this.title = title;
	this.Author = Author;
	this.ISBN = "Unknown";
	this.price = 0.0;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
}
