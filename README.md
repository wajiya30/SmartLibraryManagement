# Issue and Return Books Module

## Overview
The Issue and Return module is part of the Smart Library Management System. It manages the issuing and returning of books and updates their availability status.

## Features
- Issue a book using its Book ID.
- Check whether a book exists before issuing it.
- Prevent issuing a book that is already issued.
- Return a previously issued book.
- Prevent returning a book that is not currently issued.
- Update the book's availability status after each operation.
- Display messages for successful and unsuccessful operations.

## Technologies Used
- Java
- ArrayList
- Object-Oriented Programming

## File
`IssueReturn.java`

## Module Dependency
This module uses `BookManagement.java` to find books and update their issue status.

## How to Run
1. Make sure Java JDK is installed.
2. Ensure `BookManagement.java` and `IssueReturn.java` are in the same folder.
3. Compile both files:

   ```bash
   javac BookManagement.java IssueReturn.java
   ```

4. Run the application through the main method of `BookManagement` or the integrated `Main.java`, depending on the project setup.

## GitHub Branch
`feature/issue-return`

## Module Responsibility
This module handles book issuing and returning while maintaining the correct availability status of each book.

