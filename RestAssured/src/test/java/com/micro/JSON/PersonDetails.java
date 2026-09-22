package com.micro.JSON;

public class PersonDetails
{
 private String name;
 private String email;
 private int age;
 private boolean isActive;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String args)
    {
        PersonDetails obj = new PersonDetails();
        obj.setName("Hema");
        obj.setEmail("sekhar@01");
        obj.setAge(10);
        obj.setActive(true);

    }

}
