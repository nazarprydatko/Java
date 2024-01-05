package bookshelf;
import bookshelf.bookstore.Book;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



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