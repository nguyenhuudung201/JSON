package com.class2.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String firstName;
    String lastName;
    int id;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", address=" + address +
                ", listNumbers=" + listNumbers +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    int age;
    Address address;
    List<Phone> listNumbers;

    public Person() {
        address = new Address();
        listNumbers = new ArrayList<Phone>();

    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
