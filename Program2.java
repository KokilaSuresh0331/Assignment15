package com.assignment14;

import java.util.ArrayList;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
        addBook(books, "Java", "Gosling", "123456");
        addBook(books, "Python", "Van Rossum", "789012");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your Option:");
            System.out.println("1. Update Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Exit");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (option) {
                case 1:
                    System.out.println("Enter the name of the book to update:");
                    String oldBookName = scanner.nextLine();
                    System.out.println("Enter new title:");
                    String newTitle = scanner.nextLine();
                    System.out.println("Enter new author:");
                    String newAuthor = scanner.nextLine();
                    System.out.println("Enter new ISBN:");
                    String newIsbn = scanner.nextLine();
                    updateBook(books, oldBookName, newTitle, newAuthor, newIsbn);
                    break;

                case 2:
                    System.out.println("Enter the name of the book to delete:");
                    String bookToDelete = scanner.nextLine();
                    deleteBook(books, bookToDelete);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Option");
            }

           
            displayBooks(books);
        }
    }

    public static void addBook(ArrayList<Book> books, String bookName, String author, String isbnNo) {
        Book newBook = new Book(bookName, author, isbnNo);
        books.add(newBook);
    }

    public static void updateBook(ArrayList<Book> books, String oldBookName, String newTitle, String newAuthor, String newIsbn) {
        for (Book book : books) {
            if (book.getBookName().equals(oldBookName)) {
                book.setBookName(newTitle);
                book.setAuthor(newAuthor);
                book.setIsbn(newIsbn);
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public static void deleteBook(ArrayList<Book> books, String bookName) {
        books.removeIf(book -> book.getBookName().equals(bookName));
    }

    public static void displayBooks(ArrayList<Book> books) {
        System.out.println("Number of books: " + books.size());
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Book Count: " + (i + 1));
            System.out.println(books.get(i));
        }
    }
}