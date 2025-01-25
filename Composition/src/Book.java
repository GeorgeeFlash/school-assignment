public class Book {
    String title, author;

    Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
