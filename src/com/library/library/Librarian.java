package com.library.library;

import com.library.book.Book;
import com.library.enums.Status;
import com.library.person.Reader;

public class Librarian {
    private String name;
    private String password;
    private Library library;

    public Librarian(String name, String password, Library library) {
        this.name = name;
        this.password = password;
        this.library = library;
    }

    public Book searchBook(Long id){
        return library.showBook(id);
    }

    public Status issueBook(Long id){
        return library.showBook(id).getStatus();
    }

    public void lendBook(Book book, Reader reader){
        library.lendBook(book, reader);
    }

    public void returnBook(Book book, Status status){
        library.takeBackBook(book, status);
    }
    
}
