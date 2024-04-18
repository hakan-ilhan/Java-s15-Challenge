package org.workintech.library;

import org.workintech.library.books.*;
import org.workintech.library.membership.MemberRecord;
import org.workintech.library.person.Reader;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {
    private Set<Book> books;
    private Map<Integer, Reader> readers;

    private Map<Integer,Reader> borrowedBooks;

    public Library() {
        this.books = new HashSet<>();
        this.readers = new HashMap<>();
    }

    public void addMember(MemberRecord memberRecord){
        readers.put(memberRecord.getMember_id(),memberRecord);
    }

    public Set<Book> getBooks(){
        return books;
    }
    public Reader getReader(Integer number){

        return readers.get(number);
    }
    public void newBook(Book book){
        books.add(book);
        System.out.println("The book has been successfully added to the library. (" + book.getTitle() + ")");
    }
    public void lendBook(Book book, Integer id){
        readers.get(id).borrowBook(book);
        books.remove(book);
    }
    public void takeBackBook(Book book, Integer id){
        readers.get(id).returnBook(book);
        books.add(book);
    }
    public void findBookbyId(int id){
        boolean found  = false;
        for (Book book : books) {
            if(book.getBook_ID() == id) {
                System.out.println("Here is the book you are looking for : " +book);
                found =true;
                break;
            }
        }
        if(!found) System.out.println("The book you are looking for is either not available in our library or has been borrowed by someone.");

    }
    public void showBook(String name){
        for(Book book : books){
            if(book.getTitle().equals(name)){
                System.out.println(book);
            }
        }
    }
    public void updateBook(int bookId, String author, String name, double price, Status status, int edition, String date_of_purchase) {
        for (Book book : books) {
            if (book.getBook_ID() == bookId) {
                book.setAuthor(author);
                book.setName(name);
                book.setPrice(price);
                book.setStatus(status);
                book.setEdition(edition);
                book.setDate_of_purchase(date_of_purchase);
                System.out.println("Book information updated successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found in the library.");
    }
    public void removeBookbyId(int id) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getBook_ID() == id) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book with ID " + id + " has been successfully deleted.");
        } else {
            System.out.println("The book with the searched ID could not be found.");
        }
    }
    public void getBooksByCategory(String category) {
        Set<Book> booksByCategory = new HashSet<>();
        for (Book book : books) {
            if (book instanceof Journals && category.equalsIgnoreCase("journals")) {
                booksByCategory.add(book);
            } else if (book instanceof StudyBooks && category.equalsIgnoreCase("studybooks")) {
                booksByCategory.add(book);
            } else if (book instanceof Magazines && category.equalsIgnoreCase("magazines")) {
                booksByCategory.add(book);
            }
        }

        if (!booksByCategory.isEmpty()) {
            System.out.println("Books in category \"" + category + "\":");
            for (Book book : booksByCategory) {
                System.out.println(book);
            }
        } else {
            System.out.println("No books found in the category \"" + category + "\".");
        }
    }
    public void getBooksbyAuthor(String author){
        Set<Book> booksbyAuthor = new HashSet<>();
        for(Book book : books){
            if(book.getAuthor().equalsIgnoreCase(author)){
                booksbyAuthor.add(book);
            }
        }
        System.out.println(booksbyAuthor);
    }


}
