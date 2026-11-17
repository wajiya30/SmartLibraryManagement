# Smart Library Management System

## Project Overview
The **Smart Library Management System** is a Java-based console application designed to manage basic library operations. It helps users manage books, search for books, and handle book issuing and returning through a simple menu-driven interface.

The project is developed using Java and Object-Oriented Programming concepts. It is divided into three main modules to support teamwork and demonstrate GitHub collaboration through separate branches and pull requests.

## Features

- Add new books to the library.
- View all available books.
- Delete books from the library.
- Search for books by ID.
- Search for books by title.
- Issue available books.
- Return previously issued books.
- Check whether a book is available or already issued.

## Project Modules

### Module 1: Book Management
**File:** `BookManagement.java`

- Add new books with an ID, title, and author.
- Display all books.
- Delete books using their ID.
- Maintain the list of books.

### Module 2: Search Books
**File:** `SearchBooks.java`

- Search for books using their ID.
- Search for books using their title.
- Display book details, including title, author, and availability status.

### Module 3: Issue and Return Books
**File:** `IssueReturn.java`

- Issue a book if it is available.
- Prevent issuing a book that is already issued.
- Return a previously issued book.
- Prevent returning a book that has not been issued.
- Display appropriate messages for invalid book IDs and operations.

## Technologies Used

- **Programming Language:** Java
- **IDE:** Visual Studio Code
- **Version Control:** Git
- **Collaboration Platform:** GitHub
- **Data Structure:** ArrayList

## Project Structure

```text
SmartLibraryManagement/
│
├── BookManagement.java
├── SearchBooks.java
├── IssueReturn.java
├── Main.java
└── README.md
```

## How to Run the Project

### Prerequisites
- Install Java JDK.
- Install Visual Studio Code or another Java IDE.
- Install Git (optional, if you are cloning the repository).

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/wajiya30/SmartLibraryManagement.git
   ```

2. Open the project folder in Visual Studio Code.

3. Make sure all Java files are in the same folder.

4. Compile the Java files:

   ```bash
   javac *.java
   ```

5. Run the application:

   ```bash
   java Main
   ```

## Application Menu

The application provides the following menu options:

```text
===== SMART LIBRARY MANAGEMENT SYSTEM =====

1. Add Book
2. View All Books
3. Delete Book
4. Search Book by ID
5. Search Book by Title
6. Issue Book
7. Return Book
0. Exit

Enter your choice:
```

## Data Storage

The project uses Java's `ArrayList` to store book records during program execution. Book information is maintained in memory and is not permanently saved after the application is closed.

## GitHub Collaboration

The project uses Git and GitHub for team collaboration.

- Each team member works on a separate feature branch.
- Members commit and push their code to their respective branches.
- Pull requests are created to merge completed modules into the `main` branch.
- The project owner reviews and merges the contributions.

### Branches

| Team Member | Module | Branch |
|---|---|---|
| Member 1 | Book Management | `feature/book-management` |
| Member 2 | Search Books | `feature/search-books` |
| Member 3 | Issue and Return | `feature/issue-return` |

## Future Improvements

- Store book records permanently using a database.
- Add user login and authentication.
- Introduce a graphical user interface.
- Add member registration and management.
- Maintain a history of issued and returned books.

## Conclusion

The Smart Library Management System provides a simple way to perform basic library operations using Java. It demonstrates modular programming, object-oriented concepts, data structures, and collaborative software development using GitHub.

