package org.workintech.library.membership;

public class Faculty extends MemberRecord{
    public Faculty(String name,int member_id, MemberType type, String date_of_membership,
                     Address address,
                   String phoneNo) {
        super(name,member_id, type, date_of_membership,  address, phoneNo);
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
