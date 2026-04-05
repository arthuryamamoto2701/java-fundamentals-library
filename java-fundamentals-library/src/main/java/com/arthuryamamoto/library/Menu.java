package com.arthuryamamoto.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    // Scanner used to read user input from console
    private Scanner scanner = new Scanner(System.in);

    // Displays the menu and returns the selected option
    public int getOption() {

        System.out.println("\n=== LIBRARY MENU ===");
        System.out.println(" [1] Add book");
        System.out.println(" [2] List books");
        System.out.println(" [3] Borrow book");
        System.out.println(" [4] Return book");
        System.out.println(" [5] Delete book");
        System.out.println(" [6] Exit program");

        System.out.print("Choose an option: ");

        // Reads the user's menu choice
        int option = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        return option;
    }

    // Creates a new Book object based on user input
    public Book addBook(int id) {

        System.out.println("Enter book title: ");
        String title = scanner.nextLine();

        System.out.println("Enter author name: ");
        String author = scanner.nextLine();

        System.out.println("Enter publication year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        // Create new book instance with generated ID
        Book book = new Book(id, title, author, year);

        System.out.println();
        System.out.println("Book added successfully!");

        return book;
    }

    // Displays all books in the library
    public void listBooks(ArrayList<Book> books) {

        // Check if the list is empty
        if (books.isEmpty()) {
            System.out.println();
            System.out.println("No books registered!");
            System.out.println();
            return;
        }

        System.out.println();
        System.out.println("List of books:");

        // Iterate through all books and print them
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

        System.out.println();
    }
}