package bookshelf;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import bookshelf.bookstore.Book;

import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author prida
 */
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