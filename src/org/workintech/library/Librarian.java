package org.workintech.library;

import org.workintech.library.books.Book;
import org.workintech.library.membership.MemberRecord;

public class Librarian {
    private Library library;
    private String name;
    private int password;

    public Librarian(Library library, String name, int password) {
        this.library = library;
        this.name = name;
        this.password = password;
    }
    public void newMember(MemberRecord memberRecord){
        library.addMember(memberRecord);
    }
    public void searchBook(String name){
        library.showBook(name);
    }
    public void createBill(Book book, MemberRecord member){
        System.out.println("Member name: "+member.getName() +"\nType: " + member.getType() + "\nMember Id: "+ member.getMember_id()
        +"\nBook: "+book.getTitle() +"\nPrice: "+ book.getPrice());
    }
    public void issueBook(Book book, int id, MemberRecord member){
        boolean bookCheck = false;
        for(Book book1 : library.getBooks()){
            if(book1.getBook_ID() == id){
                bookCheck = true;
            }
        }
        if (member.getNo_books_issued() <= 5 && bookCheck){
        library.lendBook(book,id);
        member.incBookIssued();
        createBill(book,member);
        } else if (member.getNo_books_issued() > 5) {
            System.out.println("You have exceeded the limit");
        } else if (!bookCheck){

            System.out.println("The book is currently being used by " + library.getReader(id).getName());
             ;
        }
    }
    public void returnBook(Book book, int id, MemberRecord member){
        member.decBookIssued();
        library.takeBackBook(book,id);
    }

}
