package bookshelf.bookstore;


import java.util.HashMap;
import java.util.Map;

public class BookCash {
    private static final Map<Integer, Book> bookMap = new HashMap<>();

    public static Book getBook(int id) throws CloneNotSupportedException {
        Book toBeClonedBook = bookMap.get(id);
        return (Book) toBeClonedBook.clone();
    }

    public static void loadCache() {
        FantasyBook fb1 = new FantasyBook();
        bookMap.put(1, fb1);

        ComicBook cb1 = new ComicBook();
        cb1.setColor(true);
        bookMap.put(2, cb1);

        FantasyBook fb2 = new FantasyBook();
        bookMap.put(3, fb2);
    }
}
