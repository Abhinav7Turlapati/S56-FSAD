package com.college.autowiringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Skill5Application {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(Skill5Application.class, args);

        Student student = context.getBean(Student.class);
        student.display();
    }
}