package com.arthuryamamoto.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    

public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    ArrayList<Book> books = new ArrayList<>();

    Menu menu = new Menu();
    boolean stop = false;
    int id_book = 1;

    do{
        int option = menu.getOption();
        
        switch (option) {
            case 1:
                books.add(menu.addBook(id_book));
                id_book++;
                break;
            case 2:
                menu.listBooks(books);
            case 6:
                stop = true;
                System.out.println("Finishing....");
                break;
        
            default:
                break;
        }
    }while(!stop);

    }
}

