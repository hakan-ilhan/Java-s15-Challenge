package com.library.person;

import com.library.book.Book;

import java.util.Set;

public class Reader extends Person{

    public Reader(String name) {
        super(name);
    }

    public Reader(String name, Set<Book> books) {
        super(name, books);
    }


}
