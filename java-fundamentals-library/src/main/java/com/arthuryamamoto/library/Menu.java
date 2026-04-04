package com.arthuryamamoto.library;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

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
        scanner.nextLine();

        return option;
    }
}