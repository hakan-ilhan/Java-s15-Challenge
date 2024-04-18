package org.workintech.library;

import org.workintech.library.books.*;
import org.workintech.library.membership.Address;
import org.workintech.library.membership.MemberRecord;
import org.workintech.library.membership.MemberType;
import org.workintech.library.membership.Student;
import org.workintech.library.person.Person;
import org.workintech.library.person.Reader;

public class LibMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Journals(1, "George Orwell", "1984", 20.99, Status.AVAILABLE, 1, "2023-01-01");
        Book book2 = new Journals(2, "J.K. Rowling", "Harry Potter and the Philosopher's Stone", 15.99, Status.AVAILABLE, 1, "2023-02-01");
        Book book3 = new StudyBooks(3, "Harper Le", "To Kill a Mockingbird", 12.50, Status.AVAILABLE, 2, "2023-03-01");
        Book book4 = new StudyBooks(4, "J.R.R. Tolkien", "The Lord of the Rings", 30.00, Status.AVAILABLE, 3, "2023-04-01");
        Book book5 = new Magazines(5, "Agatha Christie", "Murder on the Orient Express", 10.75, Status.AVAILABLE, 1, "2023-05-01");
        Book book6 = new Magazines(6, "Agatha Christie", "Murder on the Orient Express 2", 10.75, Status.AVAILABLE, 1, "2024-02-01");
        library.newBook(book1);
        library.newBook(book2);
        library.newBook(book3);
        library.newBook(book4);
        library.newBook(book5);
        library.newBook(book6);

        System.out.println("**************************************************");

        library.findBookbyId(3);
        library.findBookbyId(6);

        System.out.println("************************************");

        library.updateBook(3, "Harper Lee", "To Kill a Mockingbird", 12.50, Status.AVAILABLE, 2, "2023-03-01");

        System.out.println("************************");

        library.getBooks();
        library.removeBookbyId(3);
        library.getBooks();

        System.out.println("**************************************************");

        library.getBooksByCategory("journals");

        System.out.println("**************************************************");
        library.getBooksbyAuthor("agatha christie");

        System.out.println("**************************************************");

        Librarian librarian = new Librarian(library,"Hakan",123456);
        MemberRecord hakan = new Student("Hakan",1,MemberType.STUDENT,"18-04-2024",new Address(14,"Yilmazer","Cevizli",
                "Maltepe","İstanbul"),"05478965214");
        librarian.newMember(new Student("Hakan",1,MemberType.STUDENT,"18-04-2024",new Address(14,"Yilmazer","Cevizli",
                "Maltepe","İstanbul"),"05478965214") {
        });
        library.getReader(1);
        librarian.issueBook(book1,1,hakan);
        librarian.issueBook(book1,1,hakan);
        librarian.returnBook(book1,1,hakan);









    }
}
