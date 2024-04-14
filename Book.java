package com.assignment14;

public class Book {
private String bookName;
private String author;
private String isbn;
private static int bookCount=0;


public Book( String bookName,String author,String isbn) {
	this.bookName=bookName;
	this.author=author;
	this.isbn=isbn;
	bookCount++;
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

public String getIsbn() {
    return isbn;
}

public void setIsbn(String isbn) {
    this.isbn = isbn;
}

public static int getBookCount() {
    return bookCount;
}

@Override
public String toString() {
    return "BookName: " + this.bookName + "\n" + "Author: " + this.author + "\n" + "ISBN: " + this.isbn ;
}
}