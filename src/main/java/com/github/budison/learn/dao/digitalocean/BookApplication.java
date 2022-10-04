package com.github.budison.learn.dao.digitalocean;

/**
 * @author Kevin Nowak
 */
class BookApplication {

    public static void main(String[] args) {

        BookDAO bookDAO = new BookDAOImpl();

        printBooks(bookDAO);

        Book book = bookDAO.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDAO.saveBook(book);

        printBooks(bookDAO);
    }

    private static void printBooks(BookDAO bookDAO) {
        for (Book book : bookDAO.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn() + " NAME : " + book.getBookName());
        }
    }
}
