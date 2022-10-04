package com.github.budison.learn.dao.digitalocean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin Nowak
 *
 * The interface implementation which is a concrete implementation of the persistence logic
 */
class BookDAOImpl implements BookDAO {

    // This list is working as a database
    private final List<Book> books;

    BookDAOImpl() {
        books = new ArrayList<>(List.of(
                new Book(1, "Java"),
                new Book(2, "Python"),
                new Book(3, "Android")
        ));
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Book getBookByIsbn(int isbn) {
        return books.get(isbn);
    }

    @Override
    public void saveBook(Book book) {
        books.add(book);
    }

    @Override
    public void deleteBook(Book book) {
        books.remove(book);
    }
}
