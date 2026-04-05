package com.arthuryamamoto.library.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.arthuryamamoto.library.model.Book;

import ui.Menu;

public class LibraryService {

    public static void main(String[] args) {

        // Scanner used across the entire application
        Scanner scanner = new Scanner(System.in);

        // Menu instance receives scanner (shared resource)
        Menu menu = new Menu(scanner);

        // List that stores all books
        ArrayList<Book> books = new ArrayList<>();

        // Control variable for loop execution
        boolean running = true;

        // Auto-increment ID
        int nextId = 1;

        // Main loop
        while (running) {

            int option = menu.getOption();

            switch (option) {

                case 1:
                    // Add book
                    Book newBook = menu.readBookData(nextId);
                    books.add(newBook);
                    nextId++;
                    menu.showMessage("Book added successfully!");
                    break;

                case 2:
                    // List books
                    if (books.isEmpty()) {
                        menu.showMessage("No books registered!");
                    } else {
                        System.out.println("\nList of books:");
                        for (Book book : books) {
                            System.out.println(book);
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // Borrow book
                    int borrowId = menu.readId("Enter book ID to borrow: ");
                    borrowBook(books, borrowId, menu);
                    break;

                case 4:
                    // Return book
                    int returnId = menu.readId("Enter book ID to return: ");
                    returnBook(books, returnId, menu);
                    break;

                case 5:
                    // Remove book
                    int removeId = menu.readId("Enter book ID to remove: ");
                    removeBook(books, removeId, menu);
                    break;

                case 6:
                    // Exit program
                    running = false;
                    menu.showMessage("Finishing program...");
                    break;

                default:
                    menu.showMessage("Invalid option. Try again.");
            }
        }

        // Close scanner (resource management)
        scanner.close();
    }

    // business logic: borrow book
    public static void borrowBook(ArrayList<Book> books, int id, Menu menu) {

        for (Book book : books) {
            if (book.getId() == id) {

                if (book.getAvailable()) {
                    book.setAvailable(false);
                    menu.showMessage("Book borrowed: " + book.getTitle());
                } else {
                    menu.showMessage("Book is already borrowed.");
                }

                return;
            }
        }

        menu.showMessage("Book not found.");
    }

    // business logic: return book
    public static void returnBook(ArrayList<Book> books, int id, Menu menu) {

        for (Book book : books) {
            if (book.getId() == id) {

                if (!book.getAvailable()) {
                    book.setAvailable(true);
                    menu.showMessage("Book returned: " + book.getTitle());
                } else {
                    menu.showMessage("This book was not borrowed.");
                }

                return;
            }
        }

        menu.showMessage("Book not found.");
    }

    // business logic: remove book
    public static void removeBook(ArrayList<Book> books, int id, Menu menu) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getId() == id) {

                menu.showMessage("Book removed: " + books.get(i).getTitle());
                books.remove(i);
                return;
            }
        }

        menu.showMessage("Book not found.");
    }
}