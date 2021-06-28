package com.example.demojpa4.demojpa4;

import com.example.demojpa4.demojpa4.Models.Book;
import com.example.demojpa4.demojpa4.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoJpa4Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoJpa4Application.class, args);
    }

    @Autowired   //injecting dependency of Book_repo...
    BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {

        List<Book> books = new ArrayList<>();
//        Book b1 = new Book(3, "HEHEHEHEH", "Aman", 500);
//        Book b2 = new Book(4, "ABC", "Tar", 700);
        Book b3 = new Book("RUBY", "Saran", 10000);
        Book b1=new Book("C++","Ramous",5000);
        books.add(b3);
        books.add(b1);
        bookRepository.saveAll(books);
//        b1.setId(2);
//        b1.setCost(30);
//        b1.setAuthorName("Karan");
//        b1.setBookName("Dreams");

    }
}
