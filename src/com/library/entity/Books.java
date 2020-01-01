package com.library.entity;

public class Books extends GenericItems {
    private String author;
    private String bookTitle;
    private String paper;
    
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getPaper() {
		return paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}

	@Override
	public void type() {
		System.out.println("Type is a book");
	}

	@Override
	public int compare(Object o1, Object o2) {
		Books book1 = (Books)o1;
		Books book2 = (Books)o2;
		if(book1.getPrice()> book2.getPrice()) {
			return -1;
		}
		else if(book1.getPrice()<book2.getPrice()) {
			return 1;
		}
		else {
		return 0;
		}
	}
}
