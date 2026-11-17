public class IssueReturn {

    public static void issueBook() {

        System.out.print("Enter Book ID to issue: ");
        int id = BookManagement.sc.nextInt();

        BookManagement.Book book = BookManagement.findBook(id);

        if (book == null) {
            System.out.println("Book not found!");
        }
        else if (book.issued) {
            System.out.println("This book is already issued!");
        }
        else {
            book.issued = true;
            System.out.println("Book issued successfully!");
        }
    }

    public static void returnBook() {

        System.out.print("Enter Book ID to return: ");
        int id = BookManagement.sc.nextInt();

        BookManagement.Book book = BookManagement.findBook(id);

        if (book == null) {
            System.out.println("Book not found!");
        }
        else if (!book.issued) {
            System.out.println("This book is not currently issued!");
        }
        else {
            book.issued = false;
            System.out.println("Book returned successfully!");
        }
    }
}