package com.assignment14;

import java.util.ArrayList;


public class ArrayListProgram {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
        addBook(books, "Java", "Gosling", "123456");  
        addBook(books, "Python", "Van Rossum", "789012");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println("Book Count: " + (i + 1));
            System.out.println(book);
            System.out.println();
        }
    }

    public static void addBook(ArrayList<Book> books, String bookName, String author, String isbnNo) {
        Book newBook = new Book(bookName, author, isbnNo);
        books.add(newBook);
    }
   

   
}
