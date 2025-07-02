package com.library.person;

import com.library.book.Book;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Person {
    private Long id;
    private String name;
    Set<Book> books;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
        this.books = new HashSet<>();
    }

    public Person(String name, Set<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String whoYouAre(){
        return name;
    }

    public Long getId() {
        return id;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
