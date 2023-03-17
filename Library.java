import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    // Constructor
    public Library(List<Book> books) {
        this.books = books;
    }

    public Library(String string) {
    }

    // Getters and Setters
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Remove a book from the library
    public void removeBook(Book book) {
        books.remove(book);
    }

    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book("1234567890", "Java for Beginners", 0, "John Doe", false);
        Book book2 = new Book("0987654321", "Python for Experts", 0, "Jane Smith", false);
        Book book3 = new Book("4567890123", "JavaScript for Web Developers", 0, "Bob Johnson", false);

        // Create a library and add the books
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Library library = new Library(books);

        // Test the library by printing out the books
        List<Book> libraryBooks = library.getBooks();
        for (Book book : libraryBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
