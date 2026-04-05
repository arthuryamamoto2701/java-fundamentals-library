package com.arthuryamamoto.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {

        // Scanner used to read user input from console
        Scanner scanner = new Scanner(System.in);

        // List that stores all books registered in the system
        ArrayList<Book> books = new ArrayList<>();

        // Menu object responsible for handling user options
        Menu menu = new Menu();

        // Control variable to keep the program running
        boolean stop = false;

        // Auto-increment ID for each new book and declare variable
        int id_book = 1;

        // Declare id
        int id;

        // Main loop of the application
        do {
            // Display menu and get user option
            int option = menu.getOption();

            switch (option) {

                // Add a new book to the list
                case 1:
                    books.add(menu.addBook(id_book));
                    id_book++; // increment book ID
                    break;

                // List all registered books
                case 2:
                    menu.listBooks(books);
                    break;

                // Borrow books
                case 3:
                    System.out.println("Enter the ID of the book you want to borrow: ");
                    id = scanner.nextInt();
                    menu.borrowBook(books, id);
                    break;
                // Return book
                case 4:
                    System.out.println("Enter the ID of the book you want to return: ");
                    id = scanner.nextInt();
                    menu.returnBook(books, id);
                    break;
                // Delete book
                case 5:
                    System.out.println("Enter the ID of the book you want to remove: ");
                    id = scanner.nextInt();
                    menu.removeBook(books, id);
                    break;

                // Exit the application
                case 6:
                    stop = true;
                    System.out.println("Finishing....");
                    break;

                // Handle invalid options
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }

        } while (!stop);
    }
}
