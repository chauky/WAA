package cs544.lab6;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Book {
	private int id;
	@NotEmpty
	private String title;
	@NotEmpty
	private String ISBN;
	@NotEmpty
	private String author;
	@NotNull
	private double price;

	public Book() {
		super();
	}

	public Book(String title, String iSBN, String author, double price) {
		super();
		this.title = title;
		ISBN = iSBN;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
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

	public void setPrice(double price) {
		this.price = price;
	}

}
