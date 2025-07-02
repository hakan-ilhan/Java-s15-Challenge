package com.library.person;

import com.library.book.Book;

import java.util.Set;

public class Author extends Person{



    public Author(String name) {
        super(name);
    }

    public Author(String name, Set<Book> books) {
        super(name);
        this.books = books;
    }

    public void newBook(Book book){
        if(books.add(book)){
            System.out.println("Transaction successful.");
        } else {
            System.out.printf("Transaction faied.");
        }
    }

    public Book showBook(String bookName){
        if(books == null){
            return null;
        }

        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(bookName)){
                return book;
            }

        }
        return null;
    }


}
