import java.util.Comparator;
import java.util.Date;

public class Book implements Comparable<Book> {
    private String name;
    private int numberPage;
    private String author;
    private String releaseDate;

    public Book(String name, int numberPage, String author, String releaseDate) {
        this.name = name;
        this.numberPage = numberPage;
        this.author = author;
        this.releaseDate=releaseDate;
    }

    //Sort a-z by book titles
    @Override
    public int compareTo(Book b) {
        return this.name.compareTo(b.name);
    }

    //Sort by book page numbers
    public static Comparator<Book> sortByPageCount = new Comparator<Book>() {
        @Override
        public int compare(Book book1, Book book2) {
            return Integer.compare(book1.getNumberPage(), book2.getNumberPage());
        }
    };


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}


