package com.micro.JSON.JSON_ARRAY2;

import io.cucumber.java.be.I;

import java.util.ArrayList;
import java.util.List;

public class Example {

    private String orderId;
    private String custmoreName;
    private float totalAmount;
    private boolean isDelivered;
    private Address address;
    private List<Items> items;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCustmoreName() {
        return custmoreName;
    }

    public void setCustmoreName(String custmoreName) {
        this.custmoreName = custmoreName;
    }


    public static void main(String args[])
    {
        Address address1 = new Address();
        address1.setCity("HYD");
        address1.setPindCode("123");


        Items objitem = new Items();
        objitem.setPrice(102.2f);
        objitem.setQuantity(1);
        objitem.setPrice(202.98f);

        Items objitem2 = new Items();
        objitem2.setPrice(102.2f);
        objitem2.setQuantity(1);
        objitem2.setPrice(202.98f);

        List<Items> arryListOfItems = new ArrayList<>();
        arryListOfItems.add(objitem);
        arryListOfItems.add(objitem2);

        Example obj = new Example();
        obj.setAddress(address1);
        obj.setDelivered(true);
        obj.setCustmoreName("Hema");
        obj.setItems(arryListOfItems);


    }

}
