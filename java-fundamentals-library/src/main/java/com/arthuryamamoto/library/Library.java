package com.arthuryamamoto.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    

public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    ArrayList<Book> books = new ArrayList<>();

    Menu menu = new Menu();
    boolean stop = false;
    
    do{
        int option = menu.getOption();
        
        switch (option) {
            case 1:
                break;
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

