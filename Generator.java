package bookshelf;

import java.util.Random;
import bookshelf.bookstore.BookCash;

/**
 *
 * @author prida
 */
public class Generator {
    static bookshelf.bookstore.Book createBook() throws CloneNotSupportedException {
        BookCash.loadCache();
        Random rand = new Random();
        int max = 9999, min = 1111;
        int id = rand.nextInt(3) + 1;

        bookshelf.bookstore.Book b = BookCash.getBook(id);

        b.setISBN(rand.nextInt(max - min + 1) + min);
        b.setPages(rand.nextInt(max / 90 - min / 300 + 1) + min / 300);

        return b;
    }
}
