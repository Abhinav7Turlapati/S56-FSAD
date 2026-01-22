package com.college.autowiringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.college.autowiringdemo.model.Student;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private Student student;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(student);
    }
}
