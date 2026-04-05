☕ Java Fundamentals – Library Management System

This project was created to practice and strengthen core Java and Object-Oriented Programming (OOP) concepts through a simple console-based library management system.

---

🎯 Objective

The goal of this project is to simulate a basic library system while applying fundamental OOP principles in a practical scenario.

The system models real-world entities such as books and their availability, and implements core operations like adding, listing, borrowing, returning, and removing books.

It also aims to reinforce good coding practices such as code organization, readability, and separation of concerns.

---

🧠 Object-Oriented Programming Concepts Applied

This project was built using the following OOP principles:

Encapsulation

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

📊 Business Rules

The system enforces the following rules:

- A book can only be borrowed if it is available
- A borrowed book cannot be borrowed again until it is returned
- Returning a book restores its availability
- Operations on non-existent book IDs are handled with validation

---

🛠️ Features

The system includes the following functionalities:

- Add new books with auto-incremented ID
- List all registered books
- Borrow a book (updates availability status)
- Return a borrowed book
- Remove a book by ID
- Input validation for invalid or non-existent books
- Console-based interactive menu

---

🏗️ Project Structure

- "Book" → Represents the entity (model)
- "Menu" → Handles user interaction (input/output)
- "Library" → Main class with program flow and menu loop

---

🛠️ Technologies Used

- Java 17+
- ArrayList (data structure)
- Scanner (console input)
- Visual Studio Code

---

🚀 Key Learning Outcomes

- Practical application of OOP principles
- Working with collections ("ArrayList") in Java
- Building interactive console-based applications
- Structuring code into classes with clear responsibilities
- Managing application flow with loops and user input

---

🔮 Future Improvements

- Introduce a service layer to better separate business logic
- Persist data using files or a database
- Implement search functionality (by title or author)
- Improve input validation and error handling
- Refactor code towards a more scalable architecture

---

👨‍💻 Author

Developed by Arthur Mitsuo Yamamoto

---

📌 Notes

This project is part of my Java learning journey and will continue evolving as I improve my skills.
