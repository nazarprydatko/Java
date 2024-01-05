package bookshelf;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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

        // Используйте ваш класс Book, а не java.awt.print.Book
        bookshelf.bookstore.Book b = BookCash.getBook(id);

        b.setISBN(rand.nextInt(max - min + 1) + min);
        b.setPages(rand.nextInt(max / 90 - min / 300 + 1) + min / 300);

        return b;
    }
}