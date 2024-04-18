package org.workintech.library.person;

import org.workintech.library.books.Book;
import org.workintech.library.person.Person;

import java.util.HashSet;
import java.util.Set;

public class Author extends Person {
    private Set<Book> books;

    public Author(String name, Set<Book> books) {
        super(name);
        this.books = new HashSet<>(books);
    }

    public Set<Book> getBooks() {
        return books;
    }
    public void newBook(Book book){
        books.add(book);
    }
    public void showBook(String bookName){
        for (Book book : books){
            if(book.getTitle().equals(bookName)){
                book.display();
            }
        }
        System.out.println("Book not found with the name: "+bookName);
    }

    @Override
    public void whoyouare() {
        System.out.println("I am " + this.getName());
    }
}
