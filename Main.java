package bookshelf;
import bookshelf.bookstore.Book;
/**
 *
 * @author prida
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShelf my_bsf = BookShelf.getInstance();
        for (int i = 0; i < 5; i++) {
            bookshelf.bookstore.Book b = Generator.createBook();
            my_bsf.addBook(b);
        }
        my_bsf.printContent();
    }
}
