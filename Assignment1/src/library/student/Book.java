package library.student;

public class Book {

	//Specfications 
	private String title;
	private String Author;
	private String ISBN;
	private double price; 
	
	/**
	 * default constructor that initalizes params
	 * @param title
	 * @param Author
	 * @param ISBN
	 * @param price
	 */
	public Book(String title, String Author, String ISBN, double price) {
	this.title = "Unknown";
	this.Author = "Unknown";
	this.ISBN = "Unknown";
	this.price = 0.0;
	}
	
	//Copy Constructor 
	public Book(Book other) {
		this.title = other.title;
		this.Author = other.Author;
		this.ISBN = other.ISBN;
		this.price = other.price;
		
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
