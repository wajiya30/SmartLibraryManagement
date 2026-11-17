
import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {

    public static class Book {
        int id;
        String title;
        String author;
        boolean issued;

        public Book(int id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.issued = false;
        }
    }

    public static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (findBook(id) != null) {
            System.out.println("Book ID already exists!");
            return;
        }

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    public static Book findBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                return b;
            }
        }
        return null;
    }

    public static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            System.out.println(
                "ID: " + b.id +
                " | Title: " + b.title +
                " | Author: " + b.author +
                " | Status: " +
                (b.issued ? "Issued" : "Available")
            );
        }
    }

    public static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int id = sc.nextInt();

        Book b = findBook(id);

        if (b == null) {
            System.out.println("Book not found!");
        } else if (b.issued) {
            System.out.println("Cannot delete an issued book!");
        } else {
            books.remove(b);
            System.out.println("Book deleted successfully!");
        }
    }
}
