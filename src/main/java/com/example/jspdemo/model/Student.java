package com.example.jspdemo.model;

import java.io.Serializable;

public class Student implements Serializable {
    private final int id;
    private final String firstName;
    private final String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
