---

# ☕ Java Fundamentals – Library Management System

This project was created to practice and strengthen core Java and Object-Oriented Programming (OOP) concepts through a simple console-based library management system.

---

## 🎯 Objective

The goal of this project is to simulate a basic library system while applying fundamental OOP principles in a practical scenario.

The system models real-world entities such as books and their availability, and implements core operations like adding, listing, borrowing, returning, and removing books.

This project focuses on improving understanding of how to structure Java applications using clean code and separation of responsibilities.

---

## 🧠 Object-Oriented Programming Concepts Applied

This project was built using the following OOP principles:

* **Encapsulation**

  * The `Book` class encapsulates all book-related data (id, title, author, year, availability)
  * Getters and setters control access to private attributes

* **Abstraction**

  * The system hides internal implementation details behind methods like `borrowBook()`, `returnBook()`, and `removeBook()`

* **Modularity / Separation of Concerns**

  * `Book` → data model (entity)
  * `Menu` → user interaction and operations
  * `Library` → application entry point and control flow

* **State Management**

  * Each book maintains its own state (`available` or borrowed)

---

## 🛠️ Features

The system includes the following functionalities:

* Add new books with auto-incremented ID
* List all registered books
* Borrow a book (changes availability status)
* Return a borrowed book
* Remove a book by ID
* Input validation for non-existent books
* Console-based menu navigation system

---

## 🏗️ Project Structure

* `Book` → Represents the entity (model)
* `Menu` → Handles user input and operations
* `Library` → Main class with program flow and menu loop

---

## 🛠️ Technologies Used

* Java 17+
* ArrayList (data structure)
* Scanner (console input)
* Visual Studio Code

---

## 🚀 Key Learning Outcomes

* Practical application of OOP principles
* Working with lists (`ArrayList`) in Java
* Building console-based interactive applications
* Structuring code into classes with clear responsibilities
* Handling user input and program flow with menus and loops

---

## 👨‍💻 Author

Developed by **Arthur Mitsuo Yamamoto**

---

## 📌 Notes

This project is part of my Java learning journey.

---
