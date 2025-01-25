public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create books
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fritzgerald");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books
        library.displayBooks();

        // Remove a book
        library.removeBook(book2);

        // Display remaining books
        library.displayBooks();
    }
}