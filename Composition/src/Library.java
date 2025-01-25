import java.util.ArrayList;

// Class representing a Library that contains a list of books
class Library {
    private final ArrayList<Book> books = new ArrayList<>(); // List to store books

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book + " added to the library.");
    }

    // Method to remove a book from the library
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println(book + " removed from the library.");
        } else {
            System.out.println(book + " is not in the library.");
        }
    }

    // Method to display all books in the library
    void displayBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }
}
