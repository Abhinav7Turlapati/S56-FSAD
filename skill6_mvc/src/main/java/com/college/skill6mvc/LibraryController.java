package com.college.skill6mvc;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class LibraryController {

    List<Book> bookList = new ArrayList<>();

    // /welcome
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Online Library System";
    }

    // /count
    @GetMapping("/count")
    public int countBooks() {
        return 5;
    }

    // /price
    @GetMapping("/price")
    public double price() {
        return 499.99;
    }

    // /books
    @GetMapping("/books")
    public List<String> books() {
        return Arrays.asList("Java", "Spring Boot", "Python", "React");
    }

    // /books/{id}
    @GetMapping("/books/{id}")
    public String bookById(@PathVariable int id) {
        return "Book details for ID: " + id;
    }

    // /search?title=
    @GetMapping("/search")
    public String search(@RequestParam String title) {
        return "Searching for book: " + title;
    }

    // /author/{name}
    @GetMapping("/author/{name}")
    public String author(@PathVariable String name) {
        return "Books written by: " + name;
    }

    // POST /addbook
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        bookList.add(book);
        return "Book added successfully";
    }

    // /viewbooks
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return bookList;
    }
}