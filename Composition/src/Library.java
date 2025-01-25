import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void removeBook(Book book) {
        books.remove(book);
    }

    void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
