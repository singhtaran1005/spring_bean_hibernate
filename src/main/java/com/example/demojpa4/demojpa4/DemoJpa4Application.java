package com.example.demojpa4.demojpa4;

import com.example.demojpa4.demojpa4.Models.Book;
import com.example.demojpa4.demojpa4.Models.BookCategory;
import com.example.demojpa4.demojpa4.Repository.BookCategoryRepository;
import com.example.demojpa4.demojpa4.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoJpa4Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoJpa4Application.class, args);
    }

    @Autowired   //injecting dependency of Book_repo...
    BookRepository bookRepository;

    @Autowired
    BookCategoryRepository bookCategoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Set<Book> books = new HashSet<>();
//        Book b1 = new Book("HTML", "Saman", 600);
        Book b2 = new Book("CSS", "Karan", 800,2);
//        Book b3 = new Book("RUBY", "Saran", 10000);
//        Book b1 = new Book("C++", "Ramous", 5000);
//        books.add(b3)

//        books.add(b1);
        books.add(b2);
        bookRepository.save(b2);
//        bookRepository.save(b1);
//        bookRepository.saveAll(books);
//        bookCategoryRepository.save(new BookCategory("Non Programming language"));
//        bookCategoryRepository.save(new BookCategory("programming", books));
//        b1.setId(2);
//        b1.setCost(30);
//        b1.setAuthorName("Karan");
//        b1.setBookName("Dreams");

    }
}
