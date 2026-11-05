package library.model;

/** Livre : informations bibliographiques uniquement. */
public class Book extends AbstractLendable {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }

    @Override
    public String getDescription() {
        return title + " by " + author;
    }
}
