package org.workintech.library.membership;

public class Address {
    private int doorNumber;
    private String street;
    private String neighborhood;
    private String district;
    private String city;

    public Address(int doorNumber, String street, String neighborhood, String district, String city) {
        this.doorNumber = doorNumber;
        this.street = street;
        this.neighborhood = neighborhood;
        this.district = district;
        this.city = city;
    }



    public String getFullAddress() {
        return doorNumber + " " + street + ", " + neighborhood + ", " + district + ", " + city;
    }
}
