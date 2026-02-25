package com.college.autowiringdemo;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id = 101;
    private String name = "Java Full Stack";
    private String dateOfCompletion = "10-02-2026";

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDateOfCompletion() { return dateOfCompletion; }
}