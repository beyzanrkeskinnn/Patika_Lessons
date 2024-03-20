
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Sadece aptallar 8 saat uyur", 275, "Erdal Demirkıran");
        Book book2 = new Book("Veronika ölmek istiyor", 216, "Paulo");
        Book book3 = new Book("Aşk ve Gurur", 456, "Jane Austen");
        Book book4 = new Book("Fareler ve İnsanlar", 116, "John ");
        Book book5 = new Book("Satranç", 192, "Stefan");

        //Set 1 Sort a-z by book titles
        Set<Book> bookSet = new TreeSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        System.out.println("Kitap isimlerinin A - Z sıralaması ");
        for (Book books : bookSet) {
            System.out.println(books.getName() + " " + books.getAuthor() + " " + books.getNumberPage());
        }

        // A different Set definition for sorting by pages
        Set<Book> bookSet2 = new TreeSet<>(Book.sortByPageCount);
        bookSet2.add(book1);
        bookSet2.add(book2);
        bookSet2.add(book3);
        bookSet2.add(book4);
        bookSet2.add(book5);

        System.out.println("===============================================");
        System.out.println("Kitapları sayfa sayılarına göre sıralama ");
        for (Book books2 : bookSet2) {
            System.out.println(books2.getNumberPage() + " " + books2.getName() + " " + books2.getAuthor());
        }
    }
}