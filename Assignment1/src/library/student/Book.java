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
	
}
