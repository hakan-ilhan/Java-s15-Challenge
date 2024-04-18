package org.workintech.library.books;

import java.util.Objects;

public class Book {
    private int book_ID;
    private String author;
    private String name;
    private double price;
    private Status status;
    private int edition;
    private String date_of_purchase;

    public Book(int book_ID, String author,
                String name, double price,
                Status status, int edition,
                String date_of_purchase) {
        this.book_ID = book_ID;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.date_of_purchase = date_of_purchase;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setDate_of_purchase(String date_of_purchase) {
        this.date_of_purchase = date_of_purchase;
    }

    public String getTitle(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public void changeOwner(String name){
        this.author = name;
    }

    public int getBook_ID() {
        return book_ID;
    }

    public String getOwner(){
        return author;
    }
    public void display() {
        System.out.println("Book ID: " + book_ID);
        System.out.println("Title: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status );
        System.out.println("Edition: " + edition);
        System.out.println("Date of Purchase: " + date_of_purchase);
    }
    public void updateStatus(Status b){
        this.status = b;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book :(" +
                "book_ID=" + book_ID +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", edition=" + edition +
                ", date_of_purchase='" + date_of_purchase + ')'
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
