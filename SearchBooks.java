public class SearchBooks {

    // Search book using its ID
    public static void searchByID() {

        System.out.print("Enter Book ID: ");

        int id = BookManagement.sc.nextInt();

        BookManagement.Book book =
            BookManagement.findBook(id);

        if (book == null) {
            System.out.println("Book not found!");
        } else {
            displayBook(book);
        }
    }

    // Search book using its title
    public static void searchByTitle() {

        BookManagement.sc.nextLine();

        System.out.print("Enter Book Title: ");

        String title = BookManagement.sc.nextLine();

        boolean found = false;

        for (BookManagement.Book book :
                BookManagement.books) {

            if (book.title.equalsIgnoreCase(title)) {

                displayBook(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    // Display matching book details
    public static void displayBook(
            BookManagement.Book book) {

        System.out.println("\n===== BOOK DETAILS =====");

        System.out.println("Book ID: " + book.id);

        System.out.println("Title: " + book.title);

        System.out.println("Author: " + book.author);

        System.out.println("Status: " +
            (book.issued ? "Issued" : "Available"));
    }
} 