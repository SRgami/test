package test.api.Resource;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	private String bookId;
	private String name;
	private java.time.LocalDate publishDate;
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.time.LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(java.time.LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	
	
}
