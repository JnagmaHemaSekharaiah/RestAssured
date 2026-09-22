package com.micro.Serilalization;

public class Booking
{
    private String firstName;
    private String lastName;
    private int totalPrice;
    private boolean deposited;

    public Booking(String firstName, String lastName, int totalPrice, boolean deposited)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalPrice = totalPrice;
        this.deposited = deposited;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDeposited(boolean deposited) {
        this.deposited = deposited;
    }



    public boolean isDeposited() {
        return deposited;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalPrice() {
        return totalPrice;
    }




}
