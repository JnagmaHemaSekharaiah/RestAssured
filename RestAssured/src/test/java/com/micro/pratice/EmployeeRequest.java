package com.micro.pratice;

import java.util.List;

public class EmployeeRequest
{
    private String name ;
    private int age;
    private List<String> skills;

    EmployeeRequest(String name, int age, List<String> skills)
    {
        this.name   = name;
        this.age    = age;
        this.skills = skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSkills() {
        return skills;
    }
}
