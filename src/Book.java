import java.util.Objects;

public class Book implements Comparable<Book> {

    private final String author;
    private final String name;
    private final int pages;

    public Book(String author, String name, int pages) {
        if (author == null || name == null || pages == 0) {
            throw new IllegalArgumentException();
        }
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && author.equals(book.author) && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return name.compareTo(o.name);
    }
}

