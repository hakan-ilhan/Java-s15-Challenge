package com.library.library;

import com.library.book.Book;
import com.library.enums.Status;
import com.library.person.Reader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    Map<Long, Book> books;
    Map<Long, Reader> readers;
    Map<Long, Reader> borrowedBooks;

    public Library(Map<Long, Book> books, Map<Long, Reader> readers) {
        this.books = books;
        this.readers = readers;
    }

    public Library() {
        this.books = new HashMap<>();
        this.readers = new HashMap<>();
    }

    public Map<Long, Book> getBooks() {
        return books;
    }

    public Map<Long, Reader> getReaders() {
        return readers;
    }

    public void newBook(Book book){
        books.put(book.getId(), book);
    }

    public void removeBook(Long id){
        books.remove(id);
    }

    public void addBooks(List<Book> bookList){
        for(Book book : bookList){
            books.put(book.getId(),book);
        }
    }

    public Book showBook(Long id){
        return books.get(id);
    }

    public void lendBook(Book book, Reader reader){
        if(book.isAvailable()){
            book.setAvailable(false);
            book.changeOwner(reader);
            reader.addBook(book);
            borrowedBooks.put(reader.getId(),reader);
        }

    }

    public void takeBackBook(Book book, Status newStatus){
        book.setAvailable(true);
        Reader reader = book.getOwner();
        reader.getBooks().remove(book);
        book.release();
        borrowedBooks.remove(reader.getId());

    }

    public List<Book> showBooksByCategory(String categoryName) {
        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : books.values()) {
            if (book.getCategory().equalsIgnoreCase(categoryName)) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

    public Book searchBookByName(String name){
        for(Book book : books.values()){
            if(book.getTitle().equalsIgnoreCase(name)){
                return book;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", readers=" + readers +
                '}';
    }


}
