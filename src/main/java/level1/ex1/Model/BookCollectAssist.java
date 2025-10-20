package level1.ex1.Model;

import java.util.Comparator;
import java.util.List;

public class BookCollectAssist {
    public static List<Book> sortBooks(List<Book> books) {
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getName().compareTo(b2.getName());
            }
        });
        return books;
    }
}
