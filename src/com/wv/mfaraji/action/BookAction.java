package com.wv.mfaraji.action;

import com.opensymphony.xwork2.Action;

public class BookAction implements Action {

	private String bookName;
	private String author;
	
	public String execute() {		
		System.out.println("Hello from BookAction execute");
		System.out.println(getBookName());
		return ERROR;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
