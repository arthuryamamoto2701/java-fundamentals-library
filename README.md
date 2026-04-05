<<<<<<< HEAD
---

=======
>>>>>>> 80b1e5cd5f840775cadaeee30cfc69bc45df33a3
☕ Java Fundamentals – Library Management System

This project was created to practice and strengthen core Java and Object-Oriented Programming (OOP) concepts through a simple console-based library management system.


---

🎯 Objective

The goal of this project is to simulate a basic library system while applying fundamental OOP principles in a practical scenario.

The system models real-world entities such as books and their availability, and implements core operations like adding, listing, borrowing, returning, and removing books.

<<<<<<< HEAD
It also reinforces good coding practices such as code organization, readability, and separation of concerns, with a clearer distinction between user interaction and business logic.

=======
It also aims to reinforce good coding practices such as code organization, readability, and separation of concerns.
>>>>>>> 80b1e5cd5f840775cadaeee30cfc69bc45df33a3

---

🧠 Object-Oriented Programming Concepts Applied

This project was built using the following OOP principles:

Encapsulation

<<<<<<< HEAD
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

=======
- The "Book" class encapsulates all book-related data ("id", "title", "author", "year", "availability")
- Access to attributes is controlled through methods

Abstraction

- Internal logic is hidden behind clear methods such as:
  - "borrowBook()"
  - "returnBook()"
  - "removeBook()"

Modularity / Separation of Concerns

- "Book" → data model (entity)
- "Menu" → handles user interaction (input/output)
- "Library" → application entry point and control flow

State Management

- Each book maintains its own state ("available" or borrowed)

---

>>>>>>> 80b1e5cd5f840775cadaeee30cfc69bc45df33a3
📊 Business Rules

The system enforces the following rules:

<<<<<<< HEAD
A book can only be borrowed if it is available

A borrowed book cannot be borrowed again until it is returned

Returning a book restores its availability

Operations on non-existent book IDs are validated and handled gracefully


=======
- A book can only be borrowed if it is available
- A borrowed book cannot be borrowed again until it is returned
- Returning a book restores its availability
- Operations on non-existent book IDs are handled with validation
>>>>>>> 80b1e5cd5f840775cadaeee30cfc69bc45df33a3

---

🛠️ Features

The system includes the following functionalities:

<<<<<<< HEAD
Add new books with auto-incremented ID

List all registered books

Borrow a book (updates availability status)

Return a borrowed book

Remove a book by ID

Validation for invalid or non-existent book IDs

Console-based interactive menu


=======
- Add new books with auto-incremented ID
- List all registered books
- Borrow a book (updates availability status)
- Return a borrowed book
- Remove a book by ID
- Input validation for invalid or non-existent books
- Console-based interactive menu
>>>>>>> 80b1e5cd5f840775cadaeee30cfc69bc45df33a3

---

🏗️ Project Structure
<<<<<<< HEAD

Model → Book → Represents the entity (model)

ui → Menu → Responsible for user input and output (UI layer)

services → LibraryService → Main class containing program flow and business logic


=======

- "Book" → Represents the entity (model)
- "Menu" → Handles user interaction (input/output)
- "Library" → Main class with program flow and menu loop
>>>>>>> 80b1e5cd5f840775cadaeee30cfc69bc45df33a3

---

🛠️ Technologies Used
<<<<<<< HEAD

Java 17+

Apache Maven (build and project structure management)

ArrayList (data structure)

Scanner (console input)

Visual Studio Code


=======

- Java 17+
- ArrayList (data structure)
- Scanner (console input)
- Visual Studio Code
>>>>>>> 80b1e5cd5f840775cadaeee30cfc69bc45df33a3

---

🚀 Key Learning Outcomes
<<<<<<< HEAD

Practical application of OOP principles

Working with collections (ArrayList) in Java

Building interactive console-based applications

Structuring code with clear separation between UI and logic

Managing application flow with loops and user input

Proper resource handling (e.g., Scanner lifecycle)


=======

- Practical application of OOP principles
- Working with collections ("ArrayList") in Java
- Building interactive console-based applications
- Structuring code into classes with clear responsibilities
- Managing application flow with loops and user input
>>>>>>> 80b1e5cd5f840775cadaeee30cfc69bc45df33a3

---

🔮 Future Improvements
<<<<<<< HEAD

Introduce a dedicated service layer (Service pattern)

Persist data using files or a database

Implement search functionality (by title or author)

Improve input validation and error handling

Refactor towards layered architecture (Controller / Service / Repository)


=======

- Introduce a service layer to better separate business logic
- Persist data using files or a database
- Implement search functionality (by title or author)
- Improve input validation and error handling
- Refactor code towards a more scalable architecture
>>>>>>> 80b1e5cd5f840775cadaeee30cfc69bc45df33a3

---

👨‍💻 Author
<<<<<<< HEAD

Developed by Arthur Mitsuo Yamamoto

=======

Developed by Arthur Mitsuo Yamamoto
>>>>>>> 80b1e5cd5f840775cadaeee30cfc69bc45df33a3

---

📌 Notes

This project is part of my Java learning journey and will continue evolving as I improve my skills.
<<<<<<< HEAD


---
=======
>>>>>>> 80b1e5cd5f840775cadaeee30cfc69bc45df33a3
