---

☕ Java Fundamentals – Library Management System

This project was created to practice and strengthen core Java and Object-Oriented Programming (OOP) concepts through a simple console-based library management system.


---

🎯 Objective

The goal of this project is to simulate a basic library system while applying fundamental OOP principles in a practical scenario.

The system models real-world entities such as books and their availability, and implements core operations like adding, listing, borrowing, returning, and removing books.

It also reinforces good coding practices such as code organization, readability, and separation of concerns, with a clearer distinction between user interaction and business logic.


---

🧠 Object-Oriented Programming Concepts Applied

This project was built using the following OOP principles:

Encapsulation

The Book class encapsulates all book-related data (id, title, author, year, availability)

Access to attributes is controlled through methods



---

Abstraction

Business operations are exposed through clear methods such as:

borrowBook()

returnBook()

removeBook()




---

Modularity / Separation of Concerns

The application is structured into distinct responsibilities:

model → Book → Data model (entity)

ui → Menu → Handles user interaction (input/output only)

services → LibraryService → Application entry point and business logic + control flow


This separation improves maintainability and aligns with real-world application design patterns.


---

State Management

Each book maintains its own state (available or borrowed)

State transitions are controlled through business rules



---

📊 Business Rules

The system enforces the following rules:

A book can only be borrowed if it is available

A borrowed book cannot be borrowed again until it is returned

Returning a book restores its availability

Operations on non-existent book IDs are validated and handled gracefully



---

🛠️ Features

The system includes the following functionalities:

Add new books with auto-incremented ID

List all registered books

Borrow a book (updates availability status)

Return a borrowed book

Remove a book by ID

Validation for invalid or non-existent book IDs

Console-based interactive menu



---

🏗️ Project Structure

Model → Book → Represents the entity (model)

ui → Menu → Responsible for user input and output (UI layer)

services → LibraryService → Main class containing program flow and business logic



---

🛠️ Technologies Used

Java 17+

Apache Maven (build and project structure management)

ArrayList (data structure)

Scanner (console input)

Visual Studio Code



---

🚀 Key Learning Outcomes

Practical application of OOP principles

Working with collections (ArrayList) in Java

Building interactive console-based applications

Structuring code with clear separation between UI and logic

Managing application flow with loops and user input

Proper resource handling (e.g., Scanner lifecycle)



---

🔮 Future Improvements

Introduce a dedicated service layer (Service pattern)

Persist data using files or a database

Implement search functionality (by title or author)

Improve input validation and error handling

Refactor towards layered architecture (Controller / Service / Repository)



---

👨‍💻 Author

Developed by Arthur Mitsuo Yamamoto


---

📌 Notes

This project is part of my Java learning journey and will continue evolving as I improve my skills.


---