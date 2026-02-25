package com.college.autowiringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id = 1;
    private String name = "Abhinav";
    private String gender = "Male";

    @Autowired
    private Certification certification;

    public void display() {

        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);

        System.out.println("\nCertification Details:");
        System.out.println("Cert ID: " + certification.getId());
        System.out.println("Cert Name: " + certification.getName());
        System.out.println("Completion Date: " + certification.getDateOfCompletion());
    }
}