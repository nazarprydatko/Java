package bookshelf;

import bookshelf.bookstore.Book;

import java.util.LinkedList;
import java.util.List;


class BookShelf {
    private static BookShelf instance;
    private final List<Book> storage;

    private BookShelf() {
        this.storage = new LinkedList<>();
    }

    public static BookShelf getInstance() {
        if (instance == null) {
            instance = new BookShelf();
        }
        return instance;
    }

    public void addBook(Book book) {
        storage.add(book);
    }

    public void printContent() {
        System.out.println("On my shelf:");
        for (Book b : storage) {
            b.printContent();
        }
    }
}
