package ui;

import java.util.Scanner;

import com.arthuryamamoto.library.model.Book;

public class Menu {

    private Scanner scanner;

    // constructor receives scanner (dependency injection)
    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    // displays menu and returns selected option
    public int getOption() {

        System.out.println("\n=== LIBRARY MENU ===");
        System.out.println(" [1] Add book");
        System.out.println(" [2] List books");
        System.out.println(" [3] Borrow book");
        System.out.println(" [4] Return book");
        System.out.println(" [5] Delete book");
        System.out.println(" [6] Exit program");

        System.out.print("Choose an option: ");

        int option = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        return option;
    }

    // reads book data from user input
    public Book readBookData(int id) {

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author name: ");
        String author = scanner.nextLine();

        System.out.print("Enter publication year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        return new Book(id, title, author, year);
    }

    // reads an ID from user
    public int readId(String message) {
        System.out.print(message);
        int id = scanner.nextInt();
        scanner.nextLine(); // clear buffer
        return id;
    }

    // generic message display
    public void showMessage(String message) {
        System.out.println("\n" + message + "\n");
    }
}
