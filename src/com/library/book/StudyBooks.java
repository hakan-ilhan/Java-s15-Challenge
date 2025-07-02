package com.library.book;

import com.library.enums.Status;
import com.library.person.Author;

import java.time.LocalDate;

public class StudyBooks extends Book{
    public StudyBooks(long id, Author author, String name, double price, Status status, int edition, LocalDate dateOfPurchase) {
        super(id, author, name, price, status, edition, dateOfPurchase);
    }

    @Override
    public String getCategory() {
        return "StudyBook";
    }
}
