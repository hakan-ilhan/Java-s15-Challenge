package com.library.book;

import com.library.enums.Status;
import com.library.person.Author;
import com.library.person.Reader;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Book {
    private long id;
    private Author author;
    private String name;
    private double price;
    private Status status;
    private int edition;
    private LocalDate dateOfPurchase;
    private Reader owner;
    private boolean isAvailable;

    public Book(long id, Author author, String name, double price, Status status, int edition, LocalDate dateOfPurchase) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }

    public abstract String getCategory();

    public String getTitle(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public void changeOwner(Reader newOwner){
        this.owner = newOwner;
    }

    public void release() {
        this.owner = null;
    }

    public Reader getOwner(){
        return owner;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getEdition() {
        return edition;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void updateStatus(Status newStatus){
        this.status = newStatus;
    }

    public Status getStatus() {
        return status;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author=" + author +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", edition=" + edition +
                ", dateOfPurchase=" + dateOfPurchase +
                ", owner=" + owner +
                ", isAvailable=" + isAvailable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
