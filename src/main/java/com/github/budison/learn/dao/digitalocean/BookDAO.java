package com.github.budison.learn.dao.digitalocean;

import java.util.List;

/**
 * @author Kevin Nowak
 *
 * The BookDAO interface provides a flexible design and API to access the data associated with it at persistence level
 */
interface BookDAO {

    List<Book> getAllBooks();

    Book getBookByIsbn(int isbn);

    void saveBook(Book book);

    void deleteBook(Book book);
}
