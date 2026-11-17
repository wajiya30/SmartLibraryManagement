# Search Books Module

## Overview
The Search Books module is part of the Smart Library Management System. It allows users to find books in the library using their Book ID or title and view the details of matching books.

## Features
- Search for a book using its ID.
- Search for books using their title.
- Display book ID, title, and author.
- Display book availability status.
- Show an appropriate message when a book is not found.

## Technologies Used
- Java
- ArrayList
- Object-Oriented Programming

## File
`SearchBooks.java`

## Module Dependency
This module uses the `BookManagement.java` module to access the stored book records and retrieve book details.

## How to Run
1. Make sure Java JDK is installed.
2. Ensure `BookManagement.java` and `SearchBooks.java` are in the same folder.
3. Compile both files:

   ```bash
   javac BookManagement.java SearchBooks.java
   ```

4. Run the application through the main method of `BookManagement` or the integrated `Main.java`, depending on the project setup.

## GitHub Branch
`feature/search-books`

## Module Responsibility
This module provides book-searching functionality and displays relevant information about books stored in the library.

