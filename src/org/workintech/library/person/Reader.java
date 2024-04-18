package org.workintech.library.person;

import org.workintech.library.books.Book;
import org.workintech.library.person.Person;

import java.util.HashSet;
import java.util.Set;

public class Reader extends Person {
    private Set<Book> books;

    public Reader(String name) {
        super(name);
        this.books = new HashSet<>();

    }
    public void borrowBook(Book book){
        books.add(book);
    }
    public void returnBook(Book book){
        books.remove(book);
    }
    @Override
    public void whoyouare() {
        System.out.println("I am " + this.getName());
    }
    @Override
    public String toString() {
        return super.toString() + (books == null ? "" : books);
    }
}
