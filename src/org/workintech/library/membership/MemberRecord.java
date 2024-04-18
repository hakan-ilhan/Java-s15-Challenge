package org.workintech.library.membership;

import org.workintech.library.person.Reader;

public abstract class MemberRecord extends Reader {
    private int member_id;
    private MemberType type;
    private String date_of_membership;
    private int no_books_issued = 0;
    private final int max_book_limit = 5;

    private Address address;
    private String phoneNo;

    public MemberRecord(String name,int member_id, MemberType type,
                        String date_of_membership,
                         Address address, String phoneNo) {
        super(name);
        this.member_id = member_id;
        this.type = type;
        this.date_of_membership = date_of_membership;


        this.address = address;
        this.phoneNo = phoneNo;
    }
    public String getMember() {
        return "Member ID: " + member_id + "\nName: " + getName() + "\nAddress: " + address.getFullAddress() + "\nPhone Number: " + phoneNo;
    }
    public void incBookIssued(){
        no_books_issued++;
    }
    public void decBookIssued(){
        no_books_issued--;
    }

    public int getMember_id() {
        return member_id;
    }

    public MemberType getType() {
        return type;
    }

    public int getNo_books_issued() {
        return no_books_issued;
    }



    public Address getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}
