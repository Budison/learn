package com.github.budison.learn.dao.digitalocean;

/**
 * @author Kevin Nowak
 *
 * The model which is transferred from one layer to the other
 */
class Book {

    private int isbn;
    private String bookName;

    Book() {

    }

    Book(int isbn, String bookName) {
        this.isbn = isbn;
        this.bookName = bookName;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
