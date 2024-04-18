package org.workintech.library.books;

import org.workintech.library.books.Book;

public class Magazines extends Book {
    public Magazines(int book_ID, String author, String name,
                     double price, Status status, int edition,
                     String date_of_purchase) {
        super(book_ID, author, name, price, status, edition, date_of_purchase);
    }

}
